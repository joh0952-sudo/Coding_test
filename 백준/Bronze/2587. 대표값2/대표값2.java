import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[5];
        int tot = 0;
        
        for(int i = 0; i < 5; i++){
            int n = sc.nextInt();
            arr[i] = n;
            tot+=n;
        }
        
        Arrays.sort(arr);
        System.out.println(tot/5);
        System.out.println(arr[2]);
    }
}