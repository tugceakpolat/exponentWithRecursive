import java.util.Scanner;
public class exponential {
     static int exponent(int base, int exponent) {

         if(exponent == 0 || base == 1) {
             return 1;
         }
         return base * exponent(base, exponent - 1);
        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the base number :");
        int base = input.nextInt();

        System.out.print("Please enter the exponent number : ");
        int exponent = input.nextInt();

        int result = exponent(base,exponent);
        System.out.println("Result : " +result);

    }


    }
