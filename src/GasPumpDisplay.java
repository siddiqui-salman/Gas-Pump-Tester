
public class GasPumpDisplay {

    private int digits;
    private GasPumpDisplay tail;
    private int currentDigit;
    private static final int MAX_DIGIT = 4;

    public GasPumpDisplay(int nDigits) {
        digits = nDigits;
        currentDigit = 0;
        if (nDigits > 1) {
            tail = new GasPumpDisplay(nDigits - 1);
        }
    }

    public String nextElement() {
        if (tail == null) {
            return Integer.toString(currentDigit++) + " ";
        }
        if (tail.hasMoreElements()) {
            return currentDigit + tail.nextElement();
        }
        currentDigit++;
        if (currentDigit <= MAX_DIGIT) {
            tail = new GasPumpDisplay(digits - 1);
            return currentDigit + tail.nextElement();
        }
        return ".";
    }

    public Boolean hasMoreElements() {
        if (tail == null){
            return currentDigit <= MAX_DIGIT;
        }
        else{
            if (currentDigit < MAX_DIGIT)
            {
                return true;
            }
            else{
                return tail.hasMoreElements();
            }
        }
    }
}
