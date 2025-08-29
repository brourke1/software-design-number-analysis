import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int range_start = 1;
        int range_end = 100;

        int sum = 0;

        ArrayList<Integer> AL = new ArrayList();
        for(int i = range_start; i < range_end+1; i++){
            AL.add(i);
        }
        System.out.println(AL);
    }
}
