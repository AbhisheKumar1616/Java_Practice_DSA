import java.util.Arrays;

public class Nobel {
    public int solve(int[] A){
//        System.out.println(A);
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        int small_count=0, ans=0;
        for(int i=0;i<A.length;i++){
            if(i==A[i]){
                small_count=i;
                ++ans;
            } else if (small_count==A[i]) {
                ++ans;
            }
        }
        return ans;
    }
}
