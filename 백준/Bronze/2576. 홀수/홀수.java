import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[7];
        int tot = 0;
        int hol = 0;
        
        for(int i = 0; i < 7; i++){
            int n = sc.nextInt();
            if(n % 2 == 1){
                arr[hol] = n;
                tot+=n;
                hol++;
            }
        }
        
        if(hol == 0){
           System.out.println("-1");
           return;
        }
                    
        Arrays.sort(arr, 0, hol);
        System.out.println(tot);
        System.out.println(arr[0]);

    }
}