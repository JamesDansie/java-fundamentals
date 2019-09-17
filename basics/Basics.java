import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Basics {

  public static String pluralize(String word, int count){
    if(count != 1){
      word += "s";
    }
    return word;
  }

  public static int randomInt(int max, int min){
    // from here; https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
    Random rand = new Random();
    return rand.nextInt((max-min) + 1) + min;
  }

  public static void flipNHeads(int cutOff){
    int count = 0;
    int heads = 0;
    int random;

    while(heads < cutOff){
      random = randomInt(1, 0);
      if(random == 1){
        System.out.println("Heads");
        heads++;
      } else {
        System.out.println("Tails");
      }
      count++;
    }
    System.out.println("It took " + count + " flips to flip " + cutOff + " heads in a row.");
  }

  public static void clock(){
    LocalDateTime now  = LocalDateTime.now();
    int secondOld = now.getSecond();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    int count = 0;

    System.out.println(time);
    while(true){
      count++;
      now = LocalDateTime.now();
      int secondNew = now.getSecond();
      if(secondOld != secondNew){
        secondOld = secondNew;
        time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(time + " " + (count/1000) + " kHz");

        count = 0;
      }
    }
  }

  public static void main(String[] args) {

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);

    clock();

  }
}