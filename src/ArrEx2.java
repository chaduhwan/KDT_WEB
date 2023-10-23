import java.util.Scanner;

public class ArrEx2 {



    public static void main(String[] args) {

        // Todo Auto generated method stub
        // 이차원 배열로 4년 평점 구하기 (1~4년)

        double[][] score = {{3.5,3.7},{4.3,4.3},{4.1,4.0},{3.9,3.7}};

        double sum = 0;

        for (int i = 0 ; i < score.length ; i ++){ // 학년별
            for(int j = 0 ; j < score[i].length ; j++) { // 학년의 학기별
                sum += score[i][j];
            }
        }
        int n = score.length; // 4
        int m = score[0].length; // 2

        System.out.println(sum/(n*m));

        Scanner scan = new Scanner(System.in);

        int[] test = new int[5];
        System.out.println("숫자 5개를 입력하세요");
        for(int i = 0 ; i < test.length ; i++) {
            test[i] = scan.nextInt();
        }

        int sum1 = 0;
        for (int i = 0 ; i < test.length ; i ++){
            sum1 +=test[i];
        }

        System.out.println((double) sum1/test.length);

    }
}
