/**
 * Created by dodin on 10/18/2020.
 */
public class FrogJmp {
    private static int solution(int X, int Y, int D) {
        int jumps =  (Y-X)%D == 0 ? (Y-X)/D : (Y-X)/D + 1  ;

       return jumps;
    }



    public static void main(String args[]){
        int X = 10;
        int Y =85;
        int D = 30;

        System.out.println(solution(X, Y, D));
    }
}
