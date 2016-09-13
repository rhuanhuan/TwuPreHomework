import java.util.Scanner;

public class Diamond{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int read = scan.nextInt();
        int i = 0, j = 0;
        for (i = 0; i < 2 * read - 1; i++) {
            for (j = 0; j < Math.abs(read - i - 1); j++) {
                System.out.print(' ');
            }
            for (j = Math.abs(read - i - 1); j < 2*read - Math.abs(read - i - 1) -1 ; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}