public class recursion1 {
    public static void main(String[] args){
        int n=5;
        printnum(n,0);
    }
    public static void printnum(int n,int sum){
         
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        printnum(n-1,sum);
        
        
    }
}
