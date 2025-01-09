import java.util.*;
public class primeCheck {
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<= (int) Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        System.out.println("Enter Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkPrime(n)){
            System.out.print("Prime");
        }else{
            System.out.print("Not a Prime");
        }
    }
}
