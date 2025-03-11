package sprint;

import java.util.Scanner;

public class CypherTool {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);//create Scanner for using CLI

        String operation = "";//create variable for saving user choice of operation
        String cypher = "";//create variable for saving user choice of cypher
        String message = "";//create variable for saving user message

        System.out.println("Welcome to the Cypher Tool!");

        String question1 = "Select operation: \n1. Encrypt \n2. Decrypt";//create question for first input
        int operationChoice = (int) getInput(sc, question1, true, 1, 2);//create number where we save user choice of operation

        String question2 = "Select cypher: \n1. ROT13 \n2. AtBash \n3. Caesar";//create question for second input
        int cypherChoice = (int) getInput(sc, question2, true, 1, 3);//create number where we save user choice of cypher

        String question3 = "Enter the message: ";//create question for message input
        String str = (String) getInput(sc, question3, false, 0, 0);//create string where we save user message

        if (operationChoice==1){//check if operation equals 1 - encrypt
            operation="Encrypted";//name of operation for result output
            switch (cypherChoice) {//check what cypher user chose 
                case 1:
                    cypher="ROT13";
                    message=encryptRot13(str);
                    break;//if cypher chosen we stop the loop
                case 2:
                    cypher="AtBash";
                    message=encryptAtBash(str);
                    break;
                case 3:
                    cypher="Caesar";
                    message=encryptCaesar(str,3);
                    break;
            };
        } else { //if operation not equal 1, so it will be 2 - decrypt
            operation="Decrypted";
            switch (cypherChoice) {
                case 1:
                    cypher="ROT13";
                    message=decryptRot13(str);
                    break;
                case 2:
                    cypher="AtBash";
                    message=decryptAtBash(str);
                    break;
                case 3:
                    cypher="Caesar";
                    message=decryptCeasar(str,3);
                    break;
            };
        }
        
        System.out.println(operation+" message ("+cypher+"): \n"+message);//the final output, \n for enter the next line

    }

    public static Object getInput(Scanner sc, String question, boolean isNumeric, int min, int max) {//the method to get the proper value, the boolean is Numeric for checking the type of input, min and max only for number inputs, it it's string input we use 0, 0 
        while (true) {//Program keeps prompting when invalid input is entered
            System.out.println(question);
            System.out.print("Input the value: ");
            
                if (isNumeric) {//check if it's number input
                    String input = sc.nextLine().trim();//create firstly String value to check if user wants to exit the program

                    if (input.toLowerCase().equals("exit")) {
                        System.out.println("Thank you! Goodbye!");
                        System.exit(0);
                    }

                    if (!input.isEmpty()) {//check if input value is not empty
                        if (input.matches("[0-9]+")){//check if input is number
                            int number = Integer.parseInt(input);//convert to integer

                            if (number >= min && number <= max) {
                                System.out.println();
                                return number;//we return value and stop the loop
                            } else {
                                System.out.println("You need to input a number between " + min + " and " + max + ". Try again: ");
                            }
                        } else {
                            System.out.println("Input must be a number. Try again: \n");
                        }
                        
                    } else {
                        System.out.println("Input cannot be empty. Try again: \n");
                    }

                    
                } else {
                    String input = sc.nextLine().trim();//delete whitespace before and after

                    if (input.toLowerCase().equals("exit")) {
                        System.out.println("Thank you! Goodbye!");
                        System.exit(0);
                    }
                    
                    if (!input.isEmpty()) {
                        System.out.println();
                        return input;
                    } else {
                        System.out.println("Input cannot be empty. Try again: \n");
                    }
                }
        }
    }

    public static String encryptRot13(String s) {
            if (s == null) {
                return null;
            }
            //String test ="";
           StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'm') {
                    c += 13;
                } else if (c >= 'n' && c <= 'z') {
                    c -= 13;
                } else if (c >= 'A' && c <= 'M') {
                    c += 13;
                } else if (c >= 'N' && c <= 'Z') {
                    c -= 13;
                }
                sb.append(c);
                //test+=c;
            }
    
            return sb.toString();
    }

    public static String encryptAtBash(String s) {

        StringBuilder decoded = new StringBuilder();

        for (char c : s.toCharArray()) {
                    if (Character.isLetter(c)) {
                        if (c >= 'A' && c <= 'Z') {
                            int newChar = (char) ('Z' - (c - 'A'));
                            decoded.append((char) newChar);
                        } else if (c >= 'a' && c <= 'z') {
                            int newChar = (char) ('z' - (c - 'a'));
                            decoded.append((char) newChar);
                        }
                    } else {
                        decoded.append(c);
                    }
                }
                return decoded.toString();
    }

    public static String encryptCaesar(String s, int key) {
            if (s == null) {
                return null;
            }
    
            StringBuilder sb = new StringBuilder();
    
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    c += key;
                    if (c > 'z') {
                        c -= 26;
                    } else if (c < 'a') {
                        c += 26;
                    }
                } else if (c >= 'A' && c <= 'Z') {
                    c += key;
                    if (c > 'Z') {
                        c -= 26;
                    } else if (c < 'A') {
                        c += 26;
                    }
                }
                sb.append(c);
            }
    
            return sb.toString();
    }


    public static String decryptRot13(String s) {
        if (s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public static String decryptAtBash(String s) {
        return encryptAtBash(s);
    }

    public static String decryptCeasar(String s, int key) {
        
            return encryptCaesar(s, -key);
    }
}
