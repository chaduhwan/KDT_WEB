import java.util.ArrayList;
import java.util.Scanner;

public class RectangleCon {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Rectangle> testArr = new ArrayList<>();

        while (true) {
            System.out.println("가로 세로 길이를 입력해주세요");
            int width = scan.nextInt();
            int height = scan.nextInt();
            if(width ==0 && height == 0) {
                break;
            }
            Rectangle test = new Rectangle(width);
            test.setHeight(height);
            testArr.add(test);
        }
        for (int i = 0 ; i < testArr.size() ; i ++) {
            testArr.get(i).area();
        }
        System.out.println("사각형의 갯수는 " + Rectangle.getCout());

       scan.close();
    }
}
