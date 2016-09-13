import java.util.Scanner;

public class IsoscelesTriangle{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int read = scan.nextInt();
        int i = 0,j=0;
        for (i = 0; i < read; i++) {
            for (j = 0;j<read-i-1;j++){
                System.out.print(' ');
            }
            for (j = read-i-1;j<read+i;j++){
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}