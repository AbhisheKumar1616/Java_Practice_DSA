public class Solution {
    public String addBinary(String Aa, String Bb) {
        String A=reverse(Aa);
        System.out.println("A"+A);
        String B=reverse(Bb);
        System.out.println("B"+B);
        String ans="";
        int c=0;
        int i=0,j=0;
        while (i<A.length() || j<B.length() || c>0){
            int dig=c;
            if(i<A.length()){
                System.out.println("i "+A.charAt(i));
                if(A.charAt(i)=='1')
                    dig+=1;
                i++;
            }
            if(j<B.length()){
                System.out.println("j "+B.charAt(j));
                if(B.charAt(j)=='1')
                    dig+=1;
                j++;
            }
            c=dig/2;
            System.out.println("c=="+c);
            dig=dig%2;
            System.out.println("Before ans + dig:"+ans+ " "+ dig);
            ans+=dig;
            System.out.println("After ans + c:"+ans+ " "+ c);
        }
        return reverse(ans);

    }
    public String reverse(String S){
        String rs="";
        for(int i=S.length()-1;i>=0;i--){
            rs+=S.charAt(i);
        }
        return rs;
    }
}
