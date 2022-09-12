public class power1 {
    public static void main(String args[]){
        int m=powercal(2,0);
        System.out.println(m);
    }
    public static int powercal(int x,int n)
    {
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        return (x*powercal(x,n-1));
    }
}
