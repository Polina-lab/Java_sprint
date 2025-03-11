package sprint;

public class SignPost {
    public int getArea(String str) {

        if (str.length()<=0) {
            return 0;
        }

        int maxLength = 0;
        int area = 0;
        
        if (str.contains("\n")) {
            String[] lines = str.split("\n");

            for (String line : lines) {
                maxLength = Math.max(maxLength, line.length());
            }

            int height = lines.length;
            area = maxLength * height;
        } else {
            area = str.length();
        }

        return area;
    }
}
