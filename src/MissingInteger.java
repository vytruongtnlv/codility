import java.util.HashSet;
import java.util.Set;

/**
 * Created by dodin on 10/31/2020.
 */
public class MissingInteger {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> newSet = parseToSet(A);
        int length = newSet.size();
        for(int i = 1; i < length + 1; i++){
            if(!newSet.contains(i)){
                return i;
            }
        }
        if(!newSet.contains(newSet.size()+1)){
            return length + 1;
        }
        return 1;
    }

    public static Set<Integer> parseToSet(int[] A){
        Set<Integer> newSet = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            newSet.add(A[i]);
        }
        return newSet;
    }

    public static void main(String args[]){
        System.out.println(solution(new int[]{1, 2, 3}));
    }
}
