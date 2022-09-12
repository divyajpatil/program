import java.util.*;
public class sorting {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] n=new int[a];
        for(int e=0;e<a;e++){
            n[e]=s.nextInt();
        }
        // System.out.println();
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++){
                 if(n[i]>n[j]){
                    int m=n[i];
                    n[i]=n[j];
                    n[j]=m;
                 }
            }
        }
        s.close();
        for(int e=0;e<a;e++){
            System.out.print(n[e]+" ");
        }
    }
}
