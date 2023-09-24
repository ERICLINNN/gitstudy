
public class Main {
    public static void main(String[] args) {
        String s ="a,b,c,d,e,f,g";
        String[ ] s1 =s.split(",") ;
        for (String string : s1) {
            System.out.println(string + "1");
        }
    }

}
