import java.util.HashMap;

/**
 * Created by dodin on 10/31/2020.
 */
public class MaxCounter {

    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] result = new int[N];
        int maxCounter = 0;
        int initialValue = 0;
        initially(0,result);

        for(int i = 0; i < A.length ; i++) {
            int value = A[i];
            if(value <= N && result[value-1] >= initialValue ){
                result[value-1] += 1;
                maxCounter = maxCounter < result[value-1] ? result[value-1] : maxCounter;
            }else if(value <= N && result[value-1] < initialValue) {
                result[value-1] = initialValue + 1;
                maxCounter = maxCounter < result[value-1] ? result[value-1] : maxCounter;
            }
            else if(value == N + 1 ){
                initialValue  = maxCounter;
            }
        }
        initially(initialValue, result);
        return result;
    }

    public static int[] initially(int value, int[] result){
        for(int i = 0; i < result.length; i++){
            if(result[i] < value) {
                result[i] = value;
            }
        }
        return result;
    }


//    public static int[] solution(int N, int[] A) {
//        // write your code in Java SE 8
//        int[] result = new int[N];
//        int maxCounter = 0;
//        initially(0,result);
//
//        for(int i = 0; i < A.length ; i++) {
//            int value = A[i];
//            if(value <= N){
//                result[value-1] += 1;
//                maxCounter = maxCounter < result[value-1] ? result[value-1] : maxCounter;
//            }else if(value == N + 1 ){
//                initially(maxCounter, result);
//            }
//        }
//        return result;
//    }
//
//    public static int[] initially(int value, int[] result){
//        for(int i = 0; i < result.length; i++){
//            result[i] = value;
//        }
//        return result;
//    }

    public static void main (String args[]){
        System.out.println(solution(5, new int[] {3,4,4,6,1,4,4}).toString());
    }
}
