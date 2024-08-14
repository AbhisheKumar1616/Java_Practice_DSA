import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        Pattern p1= new Pattern();
//        p1.pattern1(n);

//
//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(3);
//        arr.add(2);
//        arr.add(5);
//
//        sorting sc=new sorting();
//        sc.solve(arr);

//
//        int [] A= {2,2,5,5,5,5,-3,0,8,8,10,10,10,14};
//        Nobel nobel=new Nobel();
//        int ans=nobel.solve(A);
//        System.out.println(ans);
//
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
//        String p1= isprime(n);
//        System.out.println(p1);
//    }
//    public static String isprime(int n){
//        int f=factors(n);
//        if(f==2)
//            return "Prime";
//        return "Not Prime";
//    }
//    public static int factors(int n){
//        int c=0;
//        for (int i = 1; i*i < n; i++) {
//            if(n%i==0){
//                if(i*i==n)
//                    c+=1;
//                else
//                    c+=2;
//            }
//        }
//        return c;
//        int [] ans= new int[2];
//        System.out.println(ans)

        Bit_manipulation sol=new Bit_manipulation();
//        int ans=sol.binary_sum(11,11);
//        System.out.println(ans);
        System.out.println(sol.decimal_to_binary(20));
    }
}