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

   public void DisplayLog()
   {
       System.out.println("--------------------------------------------------------------------------");
       if(Database.isEmpty())
       {
         System.out.println("Nothing to display as database is empty ");
         System.out.println("--------------------------------------------------------------------------");
         return;
       }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Log Report for Marvellous study tracker ");
        System.out.println("--------------------------------------------------------------------------");

        for(StudyLog sobj : Database)
        {
             System.out.println(sobj);
        }

        System.out.println("--------------------------------------------------------------------------");

   }
}


public class program555 //StudytrackerStarter
{
    public static void main(String A[]) 
    {
        StudyTracker stobj = new StudyTracker();

        Scanner Scannerobj = new Scanner(System.in);

        int iChoice = 0;

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Welcome to Marvellous study tracker application...!");
        System.out.println("--------------------------------------------------------------------------");

        do
        {
            System.out.println("Please Select the approprete option : ");
            System.out.println("1 : Insert new study log into database ");
            System.out.println("2 : View All study Logs");
            System.out.println("3 : Summary of study log by date");
            System.out.println("4 : Summary of study log Subject ");
            System.out.println("5 : Export study log is file ");
            System.out.println("6 : Exit the application ");

            iChoice = Scannerobj.nextInt();

            switch (iChoice) 
            {
                    case 1:  //Insert new study log into database 
                    
                    stobj.InsertLog();   
                    break;

                    case 2:  //View All study Logs
                    stobj.DisplayLog();
                    break;

                    case 3:   //Summary of study log by date
                    
                    break;

                    case 4:  //Summary of study log Subject
                    
                    break;

                    case 5: // export study log is file
                    
                    break;

                    case 6:
                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("thank you for using marvellous study log apllication..!");  
                    System.out.println("--------------------------------------------------------------------------");
                    break;
            
                default:
                 
                System.out.println("Please select the valid option ");
            }

        }while(iChoice != 6);



    }   
}
