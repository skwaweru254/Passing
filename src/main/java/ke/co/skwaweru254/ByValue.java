package ke.co.skwaweru254;

import java.util.Scanner;

public class ByValue {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a+"  "+b);

        Scanner obj = new Scanner(System.in);

        int ans = adding(obj.nextInt(), obj.nextInt());

        System.out.println(ans);

    }

    static int adding(int a,int b){
        return a+b;
    }
}
