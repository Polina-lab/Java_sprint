package sprint;

import java.util.*;
import java.io.*;

public class Notes {
    private final String collections;//create the string for parameters when starting the fail "java Notes.java notes_list" notes_list - is collection
    private static final String folder_name = "notes_folder";//create the folder name for our notes
    private static final Scanner scanner = new Scanner(System.in);//create the scanner for reading user inputs from console
    private final File file;//create variable file without anything, after we define exactly
    private final List<String> notes;//create variable for notes (this is list/array where are stored our notes), after we add each note if we have some
    

    public Notes(String collections){//create Object Notes in brackets we give our collection which user input with "java Notes.java notes_list", go to the "public void main" to see how it looks
        this.collections=collections;
        //it's like we want to create variable and save the value after we input something in the console. If we do the declaration before, we cant use text file for notes from console
        this.file = new File(folder_name,collections+".txt");
        /*as as said we define what file we need. we create variable File in folder name notes_folder and file name collection
        (java Notes.java notes_list for this collection will be notes_list then just add the .txt
        if this file already in folder so we don't create new, just define that we have this
        if no, the system creates new file with this name*/
        this.notes = new ArrayList<>();//we create the new array for our notes, after we will use if for showing, deleting, adding and so on
        //also i need to create this function loadNotes() for saving all existing notes to notes array. also this function check if file or folder exist
        loadNotes();
    }

    private void loadNotes(){
        if(file.getParentFile().exists()){//check if folder exist (file.getParentFile - give us the folder which contains our file)
            if(file.exists()){//check if file exist
                try(BufferedReader reader_For_Notes = new BufferedReader(new FileReader(file))){/*firstly we need to define that FileReader will read the notes
                    after BufferedReader will read the FileReader
                    we need to use BufferedReader for read the file by lines, also we need try and catch, because without we cant use BurrefedReader/* */
                    String line;//we create line which we will use every time
                    while((line=reader_For_Notes.readLine())!=null){//we create also while loop, it says that while this line is contain something
                        //("!=null" means that line is not null)
                        notes.add(line);//if line is not null we add the note(line) to our notes array 
                    }
                    reader_For_Notes.close();//we need to close this BufferedReader because it working always when we declare it
                } catch (IOException any_exception){/*//we need to catch some exception in any case. IOException means
                    Some common reasons why IOException takes place are:
                    File not found.
                    False user input.
                    Bad URL for downloading files.
                    File permission causes.
                    Input/Output device issues.
                    we need this because our files could contain everythink, and also BufferedReader doesn't work without it*/
                    System.out.println("Something went wrong: "+any_exception.toString());
                }
            } else return;//if file is not found we just exit from programm
        } else {
            file.getParentFile().mkdirs();//if folder is'n exist we create new with this .mkdirs()
        }
    }

    private void saveNotes() {
        BufferedWriter writer = null;
        try {
            // Create a BufferedWriter to write to a file
            writer = new BufferedWriter(new FileWriter(file));//we already have the file name in our variable file :)

            // Loop through all notes and write each one to the file
            for (String note : notes) {
                writer.write(note);  // Write the note
                writer.newLine();     // Move to the next line after each note
            }

            // Close the BufferedWriter to save changes
            writer.close();
            //System.out.println("Notes saved successfully.");

        } catch (IOException e) {
            // Handle any exceptions during file writing
            System.out.println("An error occurred while saving notes: " + e.getMessage());
        } finally {
            // Ensure the writer is closed even if an error occurs
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the writer: " + e.getMessage());
            }
        }
    }

    private void showNotes(){
        if (notes.isEmpty()) { // 1. We need to check if notes is empty ".isEmpty()"
            System.out.println("\nYou don't have any notes. Try to add something."); // If empty just Print out something like "You don't have note, try to add something"
        } else { // 2. Then we need statement else
            System.out.println("\nNotes:"); //  print out line "Notes" as in task
            for (int c = 0; c < notes.size(); c++) { // then we need to use for loop with iteration from 0 to notes size ".size()" for helping
                int number = c + 1; // in the loop we need create integer for save the number of note, because we start from 0, but acctually we need 1,
                String zeros = ""; // then create the String for zeros with value "", just create like data_type some_name= value;

                if (number < 10) { // then we need to check if number less then 10, we define that our string zeros equals 00 because if it's one digit number we need 001 for example
                    zeros = "00";
                } else if (number < 100) { // then if else number less then 100, we define zeros 0, because two digit number 029 for example
                    zeros = "0";
                }
                System.out.println(zeros + number + " - " + notes.get(c)); // after we need just print some line like zeros + " - " + our note (for get the note from array use "arrayName.get(index)")
            }
        }
    }

   
    private void addNote(){
        while (true) { //  1.for this we need to create also while loop and check if while is true we do something, if return we just quit 
            System.out.println("\nEnter the note or \"exit\" to cancel:");  // in while firstly we need print "Enter the note:" 
            String our_note = scanner.nextLine().trim(); // 2.then create string for note and use scanner reading "scanner.nextLine()" also we need use .trim() for delete all whitespaces before and after
            if (our_note.equalsIgnoreCase("exit")) { // I added exit just in case. 
                System.out.println("\nCancelled adding note.");
                return;
            }
            if (our_note.isEmpty()) { // 3.then we check that our input is empty, is yes print something like "The note can't be empty! Try again"
                System.out.println("The note cannot be empty! Please try again");
            } else {
                notes.add(our_note); //  else if not empty we just add our note to our array notes with .add(our_string)
                saveNotes(); // 4.then we need use function saveNotes() for saving to our file
                System.out.println("\n\"" + our_note + "\" added to " + getFileName(collections)); // 5.and then print some text like "our_string_name+" added to"+collection" that means the text of our note added to our file name
                return; // 6.then just type return; without anything for quit from while loop
            }
        }
    }

        private void deleteNote() {
            if (notes.isEmpty()) {
                System.out.println("\nNo notes to delete. Try adding something first.");
                return;
            }
            showNotes();
            while (true) {
                System.out.println("\nEnter the number of the note to remove or 0 to cancel:");
                String input = scanner.nextLine().trim();
                if (input.equals("0")) {
                    System.out.println("\nCancelling delete operation.");
                    return;
                }
                if (!input.isEmpty()) { //I divide this if into two, because we need check it separately and two else also separatelly
                    if (input.matches("[0-9]+")){
                        int index = Integer.parseInt(input)-1;
                        if (index >= 0 && index < notes.size()) {
                            String deletedNote = notes.get(index); //we need to create string and get this note before deleting
                            notes.remove(index);//deleting with .remove and all
                            saveNotes();
                            System.out.println( "\n\""+deletedNote + "\" deleted from " + getFileName(collections));//we need to use our variables plus some text
                            return;
                        } else {
                            System.out.println("\nYou need to input a number between 1 and " + notes.size() + ". Or 0 to cancel. Try again: ");
                        }

                    } else {
                    System.out.println("\nInput must be a number. Try again: ");
                    }
                } else {
                    System.out.println("\nInput can't be empty! Try again:");
                }
        }
    }

    private String getFileName(String file){
        String[] words = file.split("_");
        String fileName="";
        for(String word : words){
            fileName+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
        }
        return fileName;
        
    }

    private void run(){
        System.out.println(
            "\nWelcome to the notes tool!\n\n"+
            "Collection: "+getFileName(collections)
        );
        while(true){
            System.out.println(
                "\nSelect operation:\n\n"+
                "1. Show notes\n"+
                "2. Add a note\n"+
                "3. Delete a note\n"+
                "4. Exit"
            );
            String input = scanner.nextLine().trim();
            if(!input.isEmpty()){
                if(input.matches("[0-9]+")){
                    int value = Integer.parseInt(input);
                    switch (value) {
                        case 1:
                            showNotes();
                            break;
                        case 2:
                            addNote();
                            break;
                        case 3:
                            deleteNote();
                            break;
                        case 4:
                            System.out.println("Goodbye!");
                            System.exit(0);
                        default:
                            System.out.println("\nYou need to input a number between 1 and 4! Try again:");
                            break;
                    }
                } else System.out.println("\nInput must to be a number! Try again:");
            } else System.out.println("\nInput can not be empty! Try again: ");

        }
    }

    public static void main(String[] args) {
        if(args.length!=1||args[0].equals("-h")||args[0].equals("--help")){
            System.out.println(
                "Usage: java Notes.java [COLLECTION]\n\n"+
                "This tool allows users to manage short single-line notes within a collection.\n\n"+
                "Options:\n"+
                "-h, --help       Show this help message and exit\n"+
                "[COLLECTION]     The name of the collection to manage\n"
            );
        } else new Notes(args[0]).run();
    }
}
