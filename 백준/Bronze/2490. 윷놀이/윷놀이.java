import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for(int t = 0; t < 3; t++){  // ⭐ 3줄 반복
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int cnt1 = 0;

            for(int i = 0; i < 4; i++){
                if(Integer.parseInt(st.nextToken()) == 1){
                    cnt1++;
                }
            }

            if(cnt1 == 0){
                System.out.println("D");
            }else if(cnt1 == 1){
                System.out.println("C");
            }else if(cnt1 == 2){
                System.out.println("B");
            }else if(cnt1 == 3){
                System.out.println("A");
            }else{
                System.out.println("E");
            }
        }
    }
}