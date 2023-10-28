package math;

public class MathFunctions {
    private MathFunctions(){}

    // add:
    public static int add(int num1, int num2){
        return num1 + num2;
    }
    public static long add(long num1, long num2){
        return num1 + num2;
    }
    public static float add(float num1, float num2){
        return num1 + num2;
    }
    public static double add(double num1, double num2){
        return num1 + num2;
    }

    // sub:
    public static int sub(int number, int decrement){
        return number - decrement;
    }
    public static long sub(long number, long decrement){
        return number - decrement;
    }
    public static float sub(float number, float decrement){
        return number - decrement;
    }
    public static double sub(double number, double decrement){
        return number - decrement;
    }

    // multiply:
    public static int multiply(int number, int multiplier){
        return number * multiplier;
    }
    public static long multiply(long number, long multiplier){
        return number * multiplier;
    }
    public static float multiply(float number, float multiplier){
        return number * multiplier;
    }
    public static double multiply(double number, double multiplier){
        return number * multiplier;
    }

    // div:
    public static int div(int number, int divisor){
        return number / divisor;
    }
    public static long div(long number, long divisor){
        return number / divisor;
    }
    public static float div(float number, float divisor){
        return number / divisor;
    }
    public static double div(double number, double divisor){
        return number / divisor;
    }

    // abs:
    public static int abs(int number){
        return number >= 0 ? number : number * -1;
    }
    public static long abs(long number){
        return number >= 0 ? number : number * -1;
    }
    public static float abs(float number){
        return number >= 0 ? number : number * -1.0f;
    }
    public static double abs(double number){
        return number >= 0 ? number : number * -1.0;
    }

    // pow:
    public static int pow(int number){
        return number * number;
    }
    public static long pow(long number){
        return number * number;
    }
    public static float pow(float number){
        return number * number;
    }
    public static double pow(double number){
        return number * number;
    }
}