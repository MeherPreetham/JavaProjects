import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = 2; //least value for an LCM to be true
        int count = 1; //to store the LCM
        do{
            if(lcm%a==0 && lcm%b==0){
                count = count * lcm;
                break;
            }
            lcm++;
        }while(true);
        System.out.println(lcm);
    }
}
