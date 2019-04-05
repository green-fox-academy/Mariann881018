public class CodingHours {
  public static void main(String[] args) {
    int dailyCoding = 6;
    int workDays = 5;
    int semWeeks = 17;
    int averageWork = 52;
    int totalHours = dailyCoding * workDays * semWeeks;
    float fullSem;
    fullSem = (float) averageWork * semWeeks;
    float percentage;
    percentage = ((totalHours/fullSem)*100);

    System.out.println("Total hours spent with coding: " + totalHours + " hours.");
    System.out.println("Percentage of coding hours in the semester: " + percentage + "%");
  }
}
    /*
    An average Green Fox attendee codes 6 hours daily, the semester is 17 weeks long
    Print how many hours is spent with coding in a semester by an attendee, if the attendee only codes on workdays.
    Print the percentage of the coding hours in the semester if the average work hours weekly are 52
    */