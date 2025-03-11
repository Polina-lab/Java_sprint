package sprint;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotesSecond {
    private static final Scanner sc = new Scanner(System.in);//create the constant Scanner for using the CLI and read the inputs
    private static final String DATA_FOLDER = "notes";
    private final String collection;
    private final String collectionView;
    private final File file;
    private final List<String> notes;

    public NotesSecond(String collection) {
        this.collection=collection;
        String temp = "";
        for(String s : collection.split("_")){
            temp+=s.substring(0,1).toUpperCase()+s.substring(1)+" ";
        }
        this.collectionView=temp;
        this.file=new File(DATA_FOLDER, collection+".txt");
        this.notes=new ArrayList<>();
        loadNotes();

    }

    private void loadNotes(){
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if(!file.exists()) return;
        try(BufferedReader readNotes = new BufferedReader(new FileReader(file))){
            String line;
            while((line=readNotes.readLine())!=null){
                notes.add(line);
            }
            readNotes.close();
        } catch (IOException ea) {
            System.out.println("Something went wrong");
        }
        
    }

    private void saveNotes(){
        try(BufferedWriter writeNotes = new BufferedWriter(new FileWriter(file))){
                for (String note : notes){
                    writeNotes.write(note);
                    writeNotes.newLine();
                }
                writeNotes.close();
            
        }
         catch (IOException ea) {
            System.out.println("Something went wrong");
        }
    }

    private void showNotes(){
        if(notes.isEmpty()){
            System.out.println("\nNo notes to show. Try to add something.");
        } else {
            System.out.println("\nNotes:");
            String zeros = "";
            for (int i = 0;i<notes.size();i++){
                int num=i+1;
                if(num<10){
                    zeros="00";
                } else if(num<100){
                    zeros="0";
                }
                System.out.println(zeros+num+" - "+notes.get(i));
            }
        }
    }

    private void addNote(){
        //boolean check = true;
        while(true){
            System.out.println("\nEnter the note or 0 to cancell: ");
            String note = sc.nextLine().trim();
            if(note.isEmpty()){
                System.out.println("The note can't be empty! Try again");
                //continue;
            } else {
                notes.add(note);
                saveNotes();
                System.out.println("\n\""+note+"\" added to "+collectionView.trim());
                return;
            }
        }
        
    }

    private void deleteNote(){
        if(notes.isEmpty()){
            System.out.println("\nNo notes to delete. Try to add something.");
            return;
        }
        showNotes();
        while(true){
            System.out.println("\nEnter the number of the note to remove or 0 to cancel:");
            String input = sc.nextLine().trim();
            System.out.println();
            if(input.equals("0")){//input=="0" not fitted
                System.out.println("Cancelled.");
                return;
            }
            //input=input.replaceAll("0", "");
            if(!input.isEmpty()){
                if(input.matches("[0-9]+")){
                    int value = Integer.parseInt(input);
                    
                    if(value<0||value>notes.size()){
                        System.out.println("You need to input a number between 1 and " + notes.size() + ". Or 0 to cancel. Try again: ");
                        continue;
                    }
                    String note = notes.get(value-1);
                    notes.remove(value-1);
                    saveNotes();
                    System.out.println("\n\""+note+"\" deleted from "+collectionView.trim());
                    return;

                } else {
                    System.out.println("Input must be a number. Try again: ");
                }
            } else {
                System.out.println("Input can't be empty! Try again:");
            }
            
        }
    }

    private void run(){
        System.out.println("Welcome to the notes tool!\n\n"+
                            "Collection: "+collectionView.trim()+"\n");
        while(true){
            System.out.println("Select operation:\n\n"+
                            "1. Show notes\n"+
                            "2. Add a note\n"+
                            "3. Delete a note\n"+
                            "4. Exit");
            String input = sc.nextLine().trim();
            if(!input.isEmpty()){
                if(input.matches("[0-9]+")){
                    int value = Integer.parseInt(input);
                    if(value==4){
                        System.out.println("Thank you! Goodbye!");
                        System.exit(0);
                        return;
                    }
                    if(value<0||value>4){
                        System.out.println("You need to input a number between 1 and 4. Try again: ");
                        continue;
                    }
                    switch (value) {
                        case 1:
                            showNotes();
                            System.out.println("\n---\n");
                            break;
                        case 2:
                            addNote();
                            System.out.println("\n---\n");

                            break;
                        case 3:
                            deleteNote();
                            System.out.println("\n---\n");

                            break;
                        default:
                            System.out.println("Invalid input. Try again ");
                    }

                } else {
                    System.out.println("Input must be a number. Try again: ");
                }
            } else {
                System.out.println("Input can't be empty! Try again: ");
            } 
        }
        
    }


    public static void main(String[] args) {
        if(args.length != 1|| args[0].equals("-h")||args[0].equals("--h")){
            System.out.println("Usage: java Notes.java [COLLECTION]\n"+
                                "This tool allows users to manage short single-line notes within a collection.\n"+
                                "Options:"+
                                "-h, --help       Show this help message and exit\n"+
                                "[COLLECTION]     The name of the collection to manage\n");
            return;
        } else {
            //System.out.println(collection);
            new NotesSecond(args[0]).run();
        }
    }
}
