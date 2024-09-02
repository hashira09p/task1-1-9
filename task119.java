/**
 * task119
 */
import java.util.Scanner;
public class Task119 {

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);
        int num1 = Integer.parseInt(obj1.nextLine());
        int num2 = Integer.parseInt(obj2.nextLine());

        System.out.println("The Product is:" + multiplication(num1,num2));
        System.out.println("The Quotient is:" + division(num1,num2));
        System.out.println("The Sum is:" + addition(num1,num2));
        System.out.println("The Difference is:" + subtraction(num1,num2));
    }

    public static int addition(int addend1, int addend2){
        return addend1 + addend2;
    }

    public static int subtraction(int minuend, int subtrahend){
        return minuend - subtrahend;
    }

    public static int multiplication(int multiplicand, int multiplier){
        return multiplicand * multiplier;
    }

    public static int division(int dividend, int divisor){
        return dividend / divisor;
    }
}
