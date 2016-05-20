import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while((T--)!=0)
        {
            int N=in.nextInt();
            int K=in.nextInt();
            int c=0;
            for(int i=0;i<N;i++)
            {
                int num=in.nextInt();
                if(num<=0)
                    c++;
            }
            if(c<K)
                System.out.println("YES");
            else
                 System.out.println("NO");
        }    
    }
}
