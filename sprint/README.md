# Notes Tool with CLI 📝

## Project Overview
This is a simple command-line note taking tool, which allows users to create, display and delete notes from a specific collection. Each collection is stored as a text file inside the notes_folder directory.

## Key Features 🔥
- Command-line interface for easy note management.
- Persistent storage for collections in text files.
- Simple and intuitive menu navigation.
- Program is continuously running until exited by the user.
- Implement input validation for commands and note entries.
- Error handling for invalid inputs. Provide clear error messages, gracefully recovering without crashing.
- Show Notes: Display all saved notes in a formatted list.
- Add Note: Add a new note to the collection.
- Delete Note: Delete a specific note from the collection.
- Load: Load existing notes when the application starts.
- Save: Save notes to a text file.
- Exit: Close the program.
- Help Message: View detailed usage instructions when needed.

## Requirements
Needs an editor with java jdk23 package.
Basic knowledge how to handle terminal command line.

## Installation 🚀
1. To run this code you need to have java (version 8 or later) and jdk 23 package installed in your computer.
2. Clone or download the project files.
3. Open a terminal and navigate to the project directory.
4. Compile the program:
~~~bash
javac Notes.java
~~~
to compile java code before first running a program. 

## Basic commands (Usage) 
java Notes.java - prompts usage view
1. Run the program:
~~~bash
java Notes.java [COLLECTION]
~~~
runs program, creates/opens collection specified where [COLLECTION] is the name of the file where notes will be stored.
### Example:
~~~bash
java Notes.java packing_list
~~~
### Available Commands:
1. Show notes – Displays the list of saved notes. input >1
2. Add a note – Allows you to enter a new note. input >2
3. Delete a note – Allows you to delete a note by its number. input >3
4. Exit – Closes the program. input >4

## Usage and Example Commands 
### Run the program and Show Notes:
~~~java
>java Notes.java test_list 

Welcome to the notes tool!

Collection: Test List

Select operation:

1. Show notes
2. Add a note
3. Delete a note
4. Exit
>1

Notes:
001 - Some note
002 - Second note
003 - Perfect
004 - I need to sleep
005 - fgh
006 - dfghjk
007 - fdkjf
~~~

### Add a note:
~~~java
Select operation:

1. Show notes
2. Add a note
3. Delete a note
4. Exit
>2

Enter the note or "exit" to cancel:
>I want a cup of coffee

"I want a cup of coffee" added to Test List
~~~

### Delete a note:
~~~java
Select operation:

1. Show notes
2. Add a note
3. Delete a note
4. Exit
>3

Notes:
001 - Some note
002 - Second note
003 - Perfect
004 - I need to sleep
005 - fgh
006 - dfghjk
007 - fdkjf
008 - I want a cup of coffee

Enter the number of the note to remove or 0 to cancel:
>005

"fgh" deleted from Test List
~~~

### Exit from program:
~~~java
Select operation:

1. Show notes
2. Add a note
3. Delete a note
4. Exit
>4
Goodbye!
~~~

## Contributors: 
### Polina Golubeva
#### diskord: golubiika005
### Jannela Kokla
#### diskord: pupsik098
### Vera Toomik
#### diskord: veratoomik
