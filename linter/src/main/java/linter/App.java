/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static String linter(Scanner sc){
        int lineCount = 0;
        String output = "";
        while(sc.hasNext()){
            lineCount++;

            String line = sc.nextLine();
//            System.out.println(line);

            int lineLength = line.length();

            if(lineLength > 0){
                char lastChar = line.charAt(lineLength -1);
                if((lastChar != '}') && (lastChar != '{')){
                    boolean containsIfElse = false;
                    Scanner word =  new Scanner(line);
                    while(word.hasNext()){
                        String wordthing = word.next();
                        if(wordthing.equals("if") || wordthing.equals("else")){
                            containsIfElse = true;
                        }
                    }
                    if(!containsIfElse && (lastChar != ';')){
//                        System.out.println("Does not end with ;");
                        output += String.format("Line %d: Missing semicolon.\n", lineCount);
                    }
//                    System.out.println(lineLength);
//                    System.out.println(line.charAt(lineLength -1));

                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        try {
            Scanner sc = new Scanner(new File("/Users/jamesdansie/codefellows/401/java-fundamentals/linter/src/main/resources/gates.js"));
            System.out.println(linter(sc));
        } catch (FileNotFoundException e){
            System.out.println(("could not find file"));
        }
    }
}
