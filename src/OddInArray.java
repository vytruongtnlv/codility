import java.util.HashMap;
import java.util.Map;

/**
 * Created by dodin on 10/17/2020.
 */
public class OddInArray {
    private static int solution(int[] A) {

        if(A.length == 1) return A[0];

        Map<Integer, Integer> map = parseToHashMao(A);
        int oddUnpaired = map.keySet().stream().filter(it -> map.get(it) == 1).findAny().get();

        return oddUnpaired;
    }

    private static Map<Integer, Integer> parseToHashMao(int[] A){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            int count = map.containsKey(A[i]) ? map.get(A[i]) : 0;
            if(count == 1) {
                map.remove(A[i]);
            }
            else {
                map.put(A[i], ++count);
            }
        }
        return map;
    }



    public static void main(String args[]){
        int A[] = {9,3,9,3,9,7,9};

        System.out.println(solution(A));
    }
}
