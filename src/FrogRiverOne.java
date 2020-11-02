import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class FrogRiverOne {


    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashMap<Integer , Integer> intHs = parseToMap(A);
        Object[] B = intHs.keySet().toArray();
        if(X > B.length) return -1;
        int lastValue = Integer.MIN_VALUE;
        Arrays.sort(B);
        for(int i = 0; i < B.length; i++){
            int value = Integer.parseInt(B[i].toString());
            lastValue = lastValue < intHs.get(value) ? intHs.get(value) : lastValue;
            if((i + 1 == value) && value == X){
                return lastValue;
            }
        }
        return -1;
    }

    public static HashMap<Integer, Integer> parseToMap (int A[]) {
        HashMap<Integer, Integer> intHs = new HashMap<>();
        for( int i = 0; i < A.length ; i++){
            if(intHs.get(A[i]) == null)
                intHs.put(A[i] , i);
        }
        return intHs;
    }

    public static void main(String args[]) {
        int A[] = {1,3,1,2,3,5,2};

        int x = 5;

        System.out.println(""+solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}));
        System.out.println(""+solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
        System.out.println(""+solution(x,A));
        System.out.println(""+solution(5, new int[]{3}));
    }
}
