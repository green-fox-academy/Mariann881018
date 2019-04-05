public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int remainingSec = 60 - currentSeconds;
    int remainingMinutesSec = (59 - currentMinutes)*60;
    int remainingHoursSec = (23 - currentHours)* 3600;

    int remainingTotalSec = remainingSec + remainingMinutesSec + remainingHoursSec;
    System.out.println("If current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
    System.out.println("The remaining seconds from the day are: " + remainingTotalSec + " seconds");
  }
}

/* Write a program that prints the remaining seconds (as an integer)
  from a day if the current time is represented by the variables */