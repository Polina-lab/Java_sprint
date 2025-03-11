package sprint;

public class Converter {
    public int atoi(String str) {
        if (str.length()>0) {
            @SuppressWarnings("removal")
            int result = new Integer(str);
            return result;
        } else {
            return 0;
        }
    }

    public String itoa(int num) {
        return num+"";
    }
}
