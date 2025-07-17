import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import jline.ConsoleReader;
import java.io.IOException;
public class Value implements Comparable<Value> {
    public static final Value NULL = new Value();
    public static final Value VOID = new Value();
    private Object value;

    public Value() {
        value = new Object();
    }

    public Value(Object v) {
        if (v == null) {
            throw new RuntimeException("v == null");
        }
        value = v;
        // only accept boolean, list, number or string types
//        if(!(isBoolean() || isList() || isNumber() || isString())) {
//            throw new RuntimeException("invalid data type: " + v + " (" + v.getClass() + ")");
//        }
    }

    public Value readInput( ConsoleReader reader){
      String str="";
         try{
           reader.setDefaultPrompt("");
           str=reader.readLine();
        }catch (IOException io) {
          System.out.println("Error IO");
        }
        return new Value(str);
    }

    public boolean isBoolean() {
        return value instanceof Boolean;
    }

    public boolean isFraction(Object v, int[] arr) {
        String s = v.toString();
        //arr = new int[2];
        int index = s.indexOf("/");
        if (index != -1) {
            boolean denominator = isInteger(s.substring(0, index));
            boolean numerator = isInteger(s.substring(index + 1, s.length()));
            if (!numerator || !denominator) {
                return false;
            }
            arr[0] = Integer.parseInt((s.substring(0, index)));
            arr[1] = Integer.parseInt((s.substring(index + 1, s.length())));
            return true;

        }
        return false;
    }

    public static int[] reduceFract(int[] a) {
        int[] b = new int[2];
        b[0] = a[0] / mcd(a[0], a[1]);
        b[1] = a[1] / mcd(a[0], a[1]);
        return b;
    }

    public boolean isNumber() {
        return value instanceof Number;
    }

    public boolean isInteger(Object v) {
        try {
            Integer.parseInt(v.toString());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

 public boolean isInteger() {
        try {
            Integer.parseInt(value.toString());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isDouble(Object v) {
        try {
            Double.parseDouble(v.toString());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isFloat(Object v) {
        try {
            Float.parseFloat(v.toString());
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
    public boolean isNull() {
        return this == NULL;
    }

    public boolean isVoid() {
        return this == VOID;
    }

    public Integer asInteger() {
        return ((Number) value).intValue();
    }

    public double realToDouble(String real) {
        String s = real.toString();
        int index = s.indexOf("/");
        double denominator = Double.parseDouble(s.substring(0, index));
        double numerator = Double.parseDouble(s.substring(index + 1, s.length()));
        return denominator / numerator;
    }

    public Boolean asBoolean() {
        return (Boolean) value;
    }

    @Override
    public int compareTo(Value v) {
        if (this.isNumber() && v.isNumber()) {
            if (this.equals(v)) {
                return 0;
            } else {
                return this.asInteger().compareTo(v.asInteger());
            }
        } else {
            throw new RuntimeException("illegal expression: can't compare `" + this + "` to `" + v + "`");
        }
    }

    public Value add(Object a) {
        boolean int_a = isInteger(a.toString());
        boolean int_v = isInteger(value.toString());
        boolean doub_a = isDouble(a.toString());
        boolean doub_v = isDouble(value.toString());
        if (int_a && int_v) {
            int suma = Integer.parseInt(a.toString()) + Integer.parseInt(value.toString());
            value = suma;
            return new Value(value);
        } else if (isDouble(a) && isDouble(value)) {
            double suma = Double.parseDouble(a.toString()) + Double.parseDouble(value.toString());
            value = suma;
            return new Value(value);
        } else if (doub_a && int_v) {
            double suma = Double.parseDouble(a.toString()) + asInteger();
            value = suma;
            return new Value(value);
        } else if (int_a && doub_v) {
            double suma = Integer.parseInt(a.toString()) + Double.parseDouble(value.toString());
            value = suma;
            return new Value(value);
        } else {
            int[] fract1 = new int[2];
            int[] fract2 = new int[2];
            if (isInteger(value.toString()) && isFraction(a, fract1)) {
                int num = Integer.parseInt(value.toString());
                fract1[0] = (num * fract1[1]) + fract1[0];
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (isInteger(a.toString()) && isFraction(value, fract1)) {
                int num = Integer.parseInt(a.toString());
                fract1[0] = (num * fract1[1]) + fract1[0];
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (isDouble(a.toString()) && isFraction(value, fract1)) {
                double num = Double.parseDouble(a.toString());
                double num1 = realToDouble(value.toString());
                value = num + num1;
                return new Value(value);
            }

            if (isDouble(value.toString()) && isFraction(a, fract1)) {
                double num = Double.parseDouble(value.toString());
                double num1 = realToDouble(a.toString());
                value = num + num1;
                return new Value(value);
            }

            if (isFraction(a, fract1) && isFraction(value, fract2)) {
                int mcm = mcm(fract1[1], fract2[1]);
                fract1[0] = (mcm / fract1[1]) * fract1[0];
                fract1[1] = (mcm / fract2[1]) * fract2[0];
                fract1[0] = fract1[0] + fract1[1];
                fract1[1] = mcm;
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    String fractionR = fract1[0] + "/" + fract1[1];
                    value = fractionR;
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }
        }
        return null;
    }

    private static int mcd(int a, int b) {
        while (a != b) {
            int x = Math.min(a, b);
            a = Math.max(a, b);
            b = x;
            b = a - b;
            a = x;
        }
        return a;
    }

    private static int mcm(int a, int b) {
        if (a % b == 0) {
            return a;
        } else if (b % a == 0) {
            return b;
        }
        return (a * b) / mcd(a, b);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public Value div(Object a) {
        boolean int_a = isInteger(a.toString());
        boolean int_v = isInteger(value.toString());
        boolean doub_a = isDouble(a.toString());
        boolean doub_v = isDouble(value.toString());
        if (int_a && int_v) {
            int div = Integer.parseInt(value.toString()) / Integer.parseInt(a.toString());
            value = div;
            return new Value(value);
        } else if (doub_a && doub_v) {
            double div = Double.parseDouble(value.toString()) / Double.parseDouble(a.toString());
            value = div;
            return new Value(value);
        } else if (doub_a && int_v) {
            double div = asInteger() / Double.parseDouble(a.toString());
            value = div;
            return new Value(value);
        } else if (int_a && doub_v) {
            double div = Double.parseDouble(value.toString()) / Integer.parseInt(a.toString());
            value = div;
            return new Value(value);
        } else {
            int[] fract1 = new int[2];
            int[] fract2 = new int[2];
            if (int_v && isFraction(a, fract1)) {
                int num = Integer.parseInt(value.toString());
                fract1[0] = num * fract1[1];
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (int_a && isFraction(value, fract1)) {
                int num = Integer.parseInt(a.toString());
                fract1[0] = fract1[1] * num;
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (doub_a && isFraction(value, fract1)) {
                double num = Double.parseDouble(a.toString());
                double num1 = realToDouble(value.toString());
                value = num1 / num;
                return new Value(value);
            }

            if (doub_v && isFraction(a, fract1)) {
                double num = Double.parseDouble(value.toString());
                double num1 = realToDouble(a.toString());
                value = num / num1;
                return new Value(value);
            }

            if (isFraction(a, fract1) && isFraction(value, fract2)) {
                int mcm = mcm(fract1[1], fract2[1]);
                fract1[0] = fract1[1] * fract2[0];
                fract1[1] = fract1[0] * fract2[1];
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    String fractionR = fract1[0] + "/" + fract1[1];
                    value = fractionR;
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }
        }
        return null;
    }

    public Value mul(Object a) {
        boolean int_a = isInteger(a.toString());
        boolean int_v = isInteger(value.toString());
        boolean doub_a = isDouble(a.toString());
        boolean doub_v = isDouble(value.toString());
        if (int_a && int_v) {
            int mult = Integer.parseInt(value.toString()) * Integer.parseInt(a.toString());
            value = mult;
            return new Value(value);
        } else if (doub_a && doub_v) {
            double mult = Double.parseDouble(value.toString()) - Double.parseDouble(a.toString());
            value = mult;
            return new Value(value);
        } else if (doub_a && int_v) {
            double mult = asInteger() * Double.parseDouble(a.toString());
            value = mult;
            return new Value(value);
        } else if (int_a && doub_v) {
            double mult = Double.parseDouble(value.toString()) - Integer.parseInt(a.toString());
            value = mult;
            return new Value(value);
        } else {
            int[] fract1 = new int[2];
            int[] fract2 = new int[2];
            if (int_v && isFraction(a, fract1)) {
                int num = Integer.parseInt(value.toString());
                fract1[0] = num * fract1[0];
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (int_a && isFraction(value, fract1)) {
                int num = Integer.parseInt(a.toString());
                fract1[0] = fract1[0] * num;
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (doub_a && isFraction(value, fract1)) {
                double num = Double.parseDouble(a.toString());
                double num1 = realToDouble(value.toString());
                value = num1 * num;
                return new Value(value);
            }

            if (doub_v && isFraction(a, fract1)) {
                double num = Double.parseDouble(value.toString());
                double num1 = realToDouble(a.toString());
                value = num * num1;
                return new Value(value);
            }

            if (isFraction(a, fract1) && isFraction(value, fract2)) {
                int mcm = mcm(fract1[1], fract2[1]);
                fract1[0] = fract1[0] * fract2[0];
                fract1[1] = fract1[1] * fract2[1];
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    String fractionR = fract1[0] + "/" + fract1[1];
                    value = fractionR;
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }
        }
        return null;
    }

    public Value sub(Object a) {
        boolean int_a = isInteger(a.toString());
        boolean int_v = isInteger(value.toString());
        boolean doub_a = isDouble(a.toString());
        boolean doub_v = isDouble(value.toString());
        if (int_a && int_v) {
            int dif = Integer.parseInt(value.toString()) - Integer.parseInt(a.toString());
            value = dif;
            return new Value(value);
        } else if (doub_a && doub_v) {
            double dif = Double.parseDouble(value.toString()) - Double.parseDouble(a.toString());
            value = dif;
            return new Value(value);
        } else if (doub_a && int_v) {
            double dif = asInteger() - Double.parseDouble(a.toString());
            value = dif;
            return new Value(value);
        } else if (int_a && doub_v) {
            double dif = Double.parseDouble(value.toString()) - Integer.parseInt(a.toString());
            value = dif;
            return new Value(value);
        } else {
            int[] fract1 = new int[2];
            int[] fract2 = new int[2];
            if (int_v && isFraction(a, fract1)) {
                int num = Integer.parseInt(value.toString());
                fract1[0] = (num * fract1[1]) - fract1[0];
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (int_a && isFraction(value, fract1)) {
                int num = Integer.parseInt(a.toString());
                fract1[0] = fract1[0] - (num * fract1[1]);
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    value = fract1[0] + "/" + fract1[1];
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }

            if (doub_a && isFraction(value, fract1)) {
                double num = Double.parseDouble(a.toString());
                double num1 = realToDouble(value.toString());
                value = num1 - num;
                return new Value(value);
            }

            if (doub_v && isFraction(a, fract1)) {
                double num = Double.parseDouble(value.toString());
                double num1 = realToDouble(a.toString());
                value = num - num1;
                return new Value(value);
            }

            if (isFraction(a, fract1) && isFraction(value, fract2)) {
                int mcm = mcm(fract1[1], fract2[1]);
                fract1[0] = (mcm / fract1[1]) * fract1[0];
                fract1[1] = (mcm / fract2[1]) * fract2[0];
                fract1[0] = fract1[1] - fract1[0];
                fract1[1] = mcm;
                fract1 = reduceFract(fract1);
                if (fract1[1] != 1) {
                    String fractionR = fract1[0] + "/" + fract1[1];
                    value = fractionR;
                } else {
                    value = fract1[0];
                }
                return new Value(value);
            }
        }
        return null;
    }

    public boolean lt(Object a) {
        int[] fract = new int[2];
        double result_a;
        double result_v;
        if (isFraction(a, fract)) {
            result_a = realToDouble(a.toString());
        } else {
            result_a = Double.parseDouble(a.toString());
        }
        if (isFraction(value, fract)) {
            result_v = realToDouble(value.toString());
        } else {
            result_v = Double.parseDouble(value.toString());
        }
        return result_v < result_a;
    }

    public boolean gt(Object a) {
        int[] fract = new int[2];
        double result_a;
        double result_v;
        if (isFraction(a, fract)) {
            result_a = realToDouble(a.toString());
        } else {
            result_a = Double.parseDouble(a.toString());
        }
        if (isFraction(value, fract)) {
            result_v = realToDouble(value.toString());
        } else {
            result_v = Double.parseDouble(value.toString());
        }
        return result_v > result_a;
    }

    public void max(Object a) {
        int[] fract = new int[2];
        double result_a;
        double result_v;
        if (isFraction(a, fract)) {
            result_a = realToDouble(a.toString());
        } else {
            result_a = Double.parseDouble(a.toString());
        }
        if (isFraction(value, fract)) {
            result_v = realToDouble(value.toString());
        } else {
            result_v = Double.parseDouble(value.toString());
        }
        if(result_v < result_a)
         value=new Value(a);
    }
}
