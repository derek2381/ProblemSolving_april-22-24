// problem link
// https://codeforces.com/problemset/problem/1283/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int h, m;
            h = sc.nextInt();
            m = sc.nextInt();

            h = (23-h)*60;
            h += 60-m;

            System.out.println(h);
        }
    }
}
