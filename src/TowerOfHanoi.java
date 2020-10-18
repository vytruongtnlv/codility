/**
 * Created by dodin on 10/17/2020.
 */
public class TowerOfHanoi {

    public static void main(String args[]) {
        int num=3;

        TOH(num - 1, "A", "B", "C");
    }

    public static void TOH(int disk, String source, String destination, String auxiliary) {
        if(disk == 0) {
            System.out.println(source + " -> " + destination);
        } else {
            TOH(disk - 1, source, auxiliary, destination);
            TOH(0, source, destination, auxiliary);
            TOH(disk - 1, auxiliary, destination, source);
        }
    }
}
