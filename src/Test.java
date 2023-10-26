import java.util.ArrayList;

public class Test {
//    public static int sumLessThan(int[] list,int a ){
//        int sum = 0;
//        for(int arr : list){
//            if(arr < a) {
//                sum += arr;
//            }
//        }
//        return sum;
//    }
    public static int[] result(int[] list, int a ){
        int[] test =new int[2];
        for(int i = 0 ; i < list.length ; i++){
           for(int j = 0 ; j < list.length ; j++) {
               if(list[i] + list[j] == a) {
                   test[0] = i;
                   test[1] = j;
                   return test;
               }
           }
        }
        return test;
    }




    public static void main(String[] args) {
        int[] test = {2, 6, 7, 4, 5, 12, 35};
//        System.out.println(sumLessThan(test,10));
        int[] fin = result(test,9);
        System.out.println("[" + fin[0] +" , " + fin[1] + "]");
    }
}
