import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Circle centerCircle = new Circle();
        Circle nonCenterCircle = new Circle(2,2,2);
        Scanner scannerObject = new Scanner(System.in);
        double a;
        double b;
        a = scannerObject.nextDouble();
        b = scannerObject.nextDouble();
        double result = a+b;
        System.out.println(result);
    }

    public static double add(double a, double b){
        double res = a+b;
        return res;
    }
    public static double div(double a, double b){
        double res = a/b;
        return res;
    }
    public static double mul(double a, double b){
        double res = a*b;
        return res;
    }
    public static double min(double a, double b){
        double res = a-b;
        return res;
    }
}
