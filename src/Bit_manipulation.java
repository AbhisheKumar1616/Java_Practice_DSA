public class Bit_manipulation {
    public int binary_sum(int i,int j){
        int ans=0,c=0;
        int count=1;
        while(i!=0 || j!=0 || c>0){
            int dig=c;
            if(i!=0){
                dig+=(i%10);
                i/=10;
            }
            if(j!=0){
                dig+=(j%10);
                j/=10;
            }
            c=dig/2;
            dig=dig%2;
            ans+= (dig*count);
            count*=10;
        }
        return ans;
    }
    public int decimal_to_binary(int n){
        int ans=0,count=1;
        while(n!=0){
            ans=ans+(n%2)*count;
            n/=2;
            count*=10;
        }

        return ans;
    }
}
