import java.util.Arrays;
import java.util.HashMap;

public class FrogRiverOne {


    public static int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> intHs = parseToMap(A);
        return intHs.get(X) != null ? intHs.get(X) : -1;
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
        int A[] = {1,3,1,4,2,3,5,4};

        int x = 5;

//        System.out.printf(""+solution(x,A));
        System.out.printf(""+solution(5, new int[]{3}));
    }
}
