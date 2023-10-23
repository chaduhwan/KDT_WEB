import java.util.Scanner;

public class Loof {
    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i++) {
            System.out.println(i);
        }

        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하세요!");
        int a = scan.nextInt();

        while (a >0) {
            System.out.print( a);
            a--;
        }
    }
}
