// problem link
// https://codeforces.com/problemset/problem/1475/A

import java.util.*;

public class solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long temp = n;
            boolean flag = false;

            while(temp > 0){
                if((temp&1) != 0 && n%temp == 0 && temp != 1){
                    flag = true;
                    break;
                }
                temp >>= 1;
            }

            if(flag == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
