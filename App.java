import java.util.Random;

public class App {

    
    public static void main(String[] args) {
        int range_start = 1;
        int range_end = 100;

        int sum = 0;

        int[] arr = new int[range_end + 1 - range_start];
        for(int i = range_start; i < range_end+1; i++){
            arr[i - 1] = i;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
       

    }
}
