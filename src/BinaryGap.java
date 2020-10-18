import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dodin on 10/16/2020.
 */
public class BinaryGap {

    public static void main(String args[]){
        int n = 0;
        String binaryN = Integer.toBinaryString(n);

        System.out.println(maxGapOne(binaryN));
    }

    private static int maxGapOne(String binary) {

        String[] binaryList = binary.split("1");

        System.out.println(binaryList);
        int maxGap = 0;

        int length = binaryList.length;
        if(binary.endsWith("0") && length > 0){
            length--;
        }
        for(int i = 0; i < length; i++){
            if(maxGap < binaryList[i].length() ){
                maxGap = binaryList[i].length();
            }
        }

        return maxGap;
    }

    private static int maxGap(String binary) {
        int maxAllTime = Integer.MIN_VALUE;
        int currentMax = 0;
        boolean isCountBegin = true;

        String[] biList = binary.split("");

        for (String x: biList) {
            if (x.equals("0")) currentMax++;
            if (x.equals("1")) {
                if (isCountBegin) {
                    isCountBegin = false;
                    currentMax = 0;
                } else {
                    maxAllTime = currentMax > maxAllTime ? currentMax : maxAllTime;
                    isCountBegin = true;
                }
            }
        }

        return maxAllTime;
    }
}
