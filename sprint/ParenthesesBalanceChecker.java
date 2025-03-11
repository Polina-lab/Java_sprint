package sprint;

public class ParenthesesBalanceChecker {
    public boolean isBalanced(String str) {
        if (str==null) return false;
        String parentheses = str.replaceAll("[^()]+","");

        return checkBalance(parentheses, 0, 0);
    }

    private boolean checkBalance(String str, int index, int balance) {
        if(str.length()==index){
            if (balance==0)return true;
            else return false;
        } else {
            if(index==0||str.charAt(index)=='('){
                return checkBalance(str, index+1, balance+1);
            }
            if(str.charAt(index)=='('){
                return checkBalance(str, index+1, balance+1);
            } else {
                return checkBalance(str, index+1, balance-1);
            }
        }
    }
}
