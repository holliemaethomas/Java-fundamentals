import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.util.Date;  
import java.time.*; 

public class Main {
  public static void main(String[] args) {
    int dogCount = 1;

    System.out.println("I own " + dogCount+ " " + pluralize("dog", dogCount) + ".");
    
    int catCount = 2;

    System.out.println("I own " + catCount+ " " + pluralize("cat", catCount) + ".");

     int turtleCount = 0;

    System.out.println("I own " + turtleCount+ " " + pluralize("turtle", turtleCount) + ".");
    
    flipNHeads(6);
    clock();
  }
  public static String pluralize(String word, int count) {
    if (count >= 2 || count == 0) {
      return (word + "s");
    } else {
      return (word);
    }
  }
  

// I got help on this lab from code review/ front row

public static void flipNHeads(int n) {
  int consecutiveHeads = 0;
  int totalFlips = 0;
  while (consecutiveHeads < n) {
    if (Math.random() < 0.5) {
      System.out.println("tails");
      consecutiveHeads = 0;
    } else {
      System.out.println("heads");
      consecutiveHeads++;
    }
    totalFlips++;
  }
  System.out.println("it took " + totalFlips + " flips to  get " + consecutiveHeads + " heads in a row");
}
public static void clock() {
  LocalDateTime now = LocalDateTime.now();
  int hour = now.getHour();
  int minutes = now.getMinute();
  int lastSecond = now.getSecond();
      System.out.println(hour);
      System.out.println(minutes);
      System.out.println(lastSecond);
  while(true) {
    now = LocalDateTime.now();
    if (now.getSecond() != lastSecond){
      hour = now.getHour();
      minutes = now.getMinute();
      lastSecond = now.getSecond();
    }
  }
}
}



