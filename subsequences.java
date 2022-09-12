public class subsequences {
    public static void subsequence(String s,int i,String ns){
        if(i==s.length()){
            System.out.println(ns);
            return;
        }
        char c=s.charAt(i);
        subsequence(s, i+1, ns+c);
        subsequence(s, i+1, ns);
    }
    public static void main(String args[]){
        subsequence("abc", 0, "");
    }
}
