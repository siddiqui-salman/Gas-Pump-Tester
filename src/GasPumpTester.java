
public class GasPumpTester {

    public static void main(String[] args) {
        GasPumpDisplay d = new GasPumpDisplay(3);
        while (d.hasMoreElements()){
            String s = d.nextElement();
            System.out.print(s);
        }
    }
    
}
