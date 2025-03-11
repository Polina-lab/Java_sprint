package sprint;

import java.text.DecimalFormat;

public class AreaCalculator {
    //private static DecimalFormat roundTwo = new DecimalFormat("#.##");
    //square
    public static double calculateArea(double number){
        double square = Math.round((number*number)*100)/100.0;
        return square;
    }
    //reglangle
    public static double calculateArea(double number1, double number2){
        double reglangle = Math.round((number1*number2)*100)/100.0;
        return reglangle;
    }
    //circle
    public static double calculateArea(double radius, boolean isCircle){
        if (!isCircle) {
            return Double.NaN;
        }
        double circle = Math.round((Math.PI * (radius*radius))*100)/100.0;
        return circle;
    }
}
