/**
 * Created by dodin on 10/18/2020.
 */
public class TapeEquilibrium {
    public static int solution(int[] A) {
        if(A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        int minGap = Integer.MAX_VALUE;
        int total = 0;
        for(int i = 0; i < A.length; i++) {
            total += A[i];
        }

        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < A.length - 1; i++){
            leftSum += A[i];
            rightSum = total - leftSum;
            if(Math.abs(leftSum - rightSum) < minGap) {
                minGap = Math.abs(leftSum - rightSum);
            }
        }

        return minGap;
    }

    private static int getGap(int a, int b){
        return a > b ? Math.abs(b - a) : Math.abs(a - b);
    }

    public static void main(String args[]){
        int A[] = {-3,2,-3,5}; // -3 2 = -1 -3+5 = 2

        System.out.println(solution(A));
    }
}
