import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sorting {
    public void solve(ArrayList<Integer> arr){
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
//        Arrays.sort(arr);
        Collections.sort(arr , Collections.reverseOrder());
        System.out.println(arr);
    }
}
