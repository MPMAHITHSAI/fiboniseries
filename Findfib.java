package Findfib;
import java.util.*;

public class Findfib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(fibonum(input));

    }

    static int fibonum(int t) {
        if(t==0){
            return 0;
        } else if (t==1) {
            return 1;
        }
        return fibonum(t-1)+fibonum(t-2);
    }
}