import java.util.Scanner;
public class DrawVerticalLine{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int read = scan.nextInt();
        int i = 0;
        for (i = 0; i < read; i++) {
            System.out.println('*');
        }
    }
}
