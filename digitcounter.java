//This code counts the number of digits in a decimal number that has been given as input by the user.
import java.util.Scanner;
class digitcounter{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a: ");
        double a = sc.nextDouble(); //storing a floating point value
        System.out.printf("a=%f\n",a);
        double i = a;//decimal value duplicate
        System.out.printf("i=%f\n",i);
        int b = (int)a; //storing its integer version
        int m = b;//integer value duplicate
        System.out.printf("b=%d\n",b);
        int k=0, l=0; //counter variables
        //to count the decimal numbers
            while (i % 10 != 0) {
                i = i * 10;
                k++;
            }
            k = k - 1;
        System.out.printf("number of decimal digits= %d\n",k);
        //to count the whole numbers part
            while(m>0){
                m=m/10;
                l++;
            }
        System.out.printf("number of whole numbers= %d\n",l);
            int digit = k + l;
        System.out.printf("number of digits: %d\n",digit);
    }
}
