import java.util.Arrays;

/**
 * Created by dodin on 10/31/2020.
 */
public class PermCheck {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            if(A[i] != i+1){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        System.out.println(solution(new int[]{4,1,3,2}));
        System.out.println(solution(new int[]{4,1,3,}));
    }
}
