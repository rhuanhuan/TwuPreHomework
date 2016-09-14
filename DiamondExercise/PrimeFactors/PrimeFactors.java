import java.util.Scanner;

public class PrimeFactors{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        generate(n);
    }
    public static void generate(int n){
        int i;
        for(i=2;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
                while(n%i == 0 ){
                    n=n/i;
                }
            }
        }
    }
}
