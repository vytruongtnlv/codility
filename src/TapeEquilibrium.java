/**
 * Created by dodin on 10/18/2020.
 */
public class TapeEquilibrium {
    public static int solution(int[] A) {
        if(A.length == 2) {
            return getGap(A[0], A[1]);
        }

        int i = 0;
        int j = A.length-1;

        int leftSum = A[i];
        int rightSum = A[j];

        i++;
        j--;

        int minGap = getGap(leftSum, rightSum);
        while(i <= j){
            if(rightSum >= leftSum){
                leftSum += A[i];
                i++;
            }
            else {
                rightSum += A[j];
                j--;
            }
            minGap = getGap(leftSum, rightSum);
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
