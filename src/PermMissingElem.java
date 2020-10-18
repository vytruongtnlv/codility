/**
 * Created by dodin on 10/18/2020.
 */
public class PermMissingElem {
    public static int solution(int[] A) {
        int totalElem = 0;
        for(int i = 1; i <= A.length + 1; i++){
            totalElem += i;
        }
        for(int i: A){
           totalElem -= i;
        }

       return totalElem;
    }

    public static void main(String args[]){
        int A[] = {2,3,1,5,4};

        System.out.println(solution(A));
    }
}
