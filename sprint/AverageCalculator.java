package sprint;

public class AverageCalculator {
    
    public float calculateAverage(float num1, float num2, float num3) {
        int count = 3;
        float sum=num1+num2+num3;
        float result=sum/count;

        return result;
    }
}
