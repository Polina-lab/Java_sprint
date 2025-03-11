package sprint;

public class Test {
    public boolean isBalanced(String str) {
        if (str.length()==0) return true;
        char[] brackets = str.toCharArray();
        int openCount = 0;
        int closeCount = 0;
        String brState = "";

        for (char bracket : brackets) {
            switch (bracket) {
                case '(':
                    openCount++;
                    brState="round";
                    break;
                case '[':
                    openCount++;
                    brState="regtangle";
                    break;
                case '{':
                    openCount++;
                    brState="figure";
                    break;
                case ')':
                    if (brState==""||brState=="round"){
                        closeCount++;
                        brState="close";
                        break;
                    }else {
                        return false;
                    }
                case ']':
                    if (brState==""||brState=="regtangle"){
                        closeCount++;
                        brState="close";
                        break;
                    }else {
                        return false;
                    }
                case '}':
                    if (brState==""||brState=="figure"){
                        closeCount++;
                        brState="close";
                        break;
                    }else {
                        return false;
                    }
                default:
                    break;
            }
        }
        if (openCount==closeCount){
            return true;
        }else {
            return false;
        }
        
    }
}
