/**
 * Created by dodin on 10/31/2020.
 */
public class CountDiv {
    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        return B/K - A/K + (B % K == 0 ? 1 : 0);
    }
    public static void main(String args[]) {
        System.out.println(solution(6, 11, 2));
    }
}
