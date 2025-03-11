package sprint;

public class BasicCalc {
    public int doOperation(int a, char op, int b) {
        int result = 0;
        try {
            switch(op){
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '/':
                    result = a / b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '%':
                    result = a % b;
                    break;
                default:
                    result=0;
            }
        } catch (ArithmeticException ae) {
            return 0;
        }
        return result;
    }
}
