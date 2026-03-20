import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int[]arr = new int[9];
        int sum = 0; 
        int fake1 = 0;
        int fake2 = 0;
        
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        
        Arrays.sort(arr);
        
        int result = sum-100;
        
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (arr[i] + arr[j] == result) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
            if(fake1 != 0 | fake2 != 0)break;
        }
        
        for (int i = 0; i < 9; i++) {
            if (i == fake1 || i == fake2) continue;
                System.out.println(arr[i]);
            }
        }
}