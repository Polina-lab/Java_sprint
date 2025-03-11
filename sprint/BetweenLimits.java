package sprint;

public class BetweenLimits {
    public String findRange(char from, char to) {
        String result="";
        int between;

        if (from>to) {
            between=from-to;
            for (int i=1; i<between;i++) {
                result+=Character.toString((char) (to+i));
            }

        } else {
            between=to-from;
            System.out.println(between);
            for (int i=1; i<between;i++) {
                result+=Character.toString((char) (from+i));
            }
        }
        return result;
    }
}
