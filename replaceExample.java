import java.util.*;

public class replaceExample {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        final String replaces=ins.nextLine();
        String n="";
        for (int i = 0; i < replaces.length(); i++) {
            if (replaces.charAt(i) == 'd') {
                n+= 'i';
            } else {
                n += n.charAt(i);
            }
        }
        ins.close();
        System.out.println(n);
    }
}