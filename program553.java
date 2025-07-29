import java.util.*;
import java.time.LocalDate;

class StudyLog
{
   public LocalDate Date;
   public String Subject;
   public Double Duration;
   public String Discription;
   
   public StudyLog( LocalDate A, String B, Double C , String D)
   {
      this.Date =  A;
      this.Subject = B;
      this.Duration = C;
      this.Discription = D;
   }

   public void Display()
   {
     System.out.println();
   }

    @Override
      public String toString()
      {
        return Date + "| "+Subject + "|" +Duration +" | "+Discription;
      }

      public LocalDate getDate()
      {
         return Date;
      }

      public String getSubject()
      {
         return Subject;
      }

      public double getDuration()
      {
         return Duration;
      }

      public String getDiscription()
      {
         return Discription;
      }
}

class StudyTracker
{
   //Data structure to hold the data about the study 
   private ArrayList<StudyLog> Database = new ArrayList<StudyLog>();

   public void InsertLog()
   {
      Scanner Scannerobj = new Scanner(System.in);

      System.out.println("--------------------------------------------------------------------------");
      System.out.println("Please the Enter the valid Details of your study : ");
      System.out.println("--------------------------------------------------------------------------");

      LocalDate Dataobj = LocalDate.now();

      System.out.println("Please provide the name of the subject like C,C,Java,OS,DS");
      String sub = Scannerobj.nextLine();

      System.out.println("Enter the time period if you study in hours : ");
      double dur = Scannerobj.nextDouble();
      Scannerobj.nextLine();

      System.out.println("Please provide the Discription about the study for the future referance : ");
      String desc = Scannerobj.nextLine();

      StudyLog Studyobj = new StudyLog(Dataobj, sub, dur, desc);

      Database.add(Studyobj);

      System.out.println("study Log get store succesfully : ");
      System.out.println("--------------------------------------------------------------------------");
   } 
}


public class program553 //StudytrackerStarter
{
    public static void main(String A[]) 
    {
        StudyTracker stobj = new StudyTracker();

        stobj.InsertLog();
    }   
}
