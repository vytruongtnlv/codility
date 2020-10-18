import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by dodin on 10/17/2020.
 */
public class CyclicRotaion {

    private static int[] solution(int[] A, int K){
        if(K == A.length){
            return A;
        }
        int[] B = Arrays.copyOfRange(A, A.length - K, A.length);
        int[] C = Arrays.copyOfRange(A,0, A.length - K);
        int[] newList = new int[A.length];
        int index = 0;
        for(int i: B){
            newList[index] = i;
            index++;
        }
        for(int i: C){
            newList[index] = i;
            index++;
        }
        return newList;
    }
    public static void main(String args[]){
        int[] A = {1, 2, 3, 4};
        int K = 3;

        int[] result = solution(A,K);
        for (int i: result){
            System.out.println(i);
        }
    }
}
