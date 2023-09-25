import java.util.*;

public class Binaryfun {

    static void decTobinary(int n){
        int[] Arr = new int[1000];
        int i = 0;
        while(n > 0){
            Arr[i] = n % 2;
            n = n/2;
            i++;
            
        }
    
        for(int j = i-1; j >= 0; j--){
            System.out.print(Arr[j]);
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        decTobinary(num);
        sc.close();
    }
}
