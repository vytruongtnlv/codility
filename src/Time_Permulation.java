/**
 * Created by dodin on 10/16/2020.
 */
public class Time_Permulation {

    private static void count(String str){
        permulation("",str);
    }

    private static void permulation(String newStr, String oldStr){
        System.out.println(newStr + " - " +oldStr);
        int n = oldStr.length();
        if( n == 0)
            System.out.println("New str:"+ newStr);
        else {
            for(int i = 0; i < n; i++)
            permulation(newStr + oldStr.charAt(i),oldStr.substring(0, i) + oldStr.substring(i+1, n));
        }
    }

    public static void main(String args[]){
        String str = "abcd";
        count("abcd");

    }
}
