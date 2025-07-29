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

}


public class program551
{
    public static void main(String A[]) 
    {
        // LocalDate lobj = new Localdate();

        StudyLog sobj1 = new StudyLog(LocalDate.now() ,"C",2.5,"Pointer and array");
        StudyLog sobj2 = new StudyLog(LocalDate.now(),"C++", 2.4,"Interface");
        StudyLog sobj3 = new StudyLog(LocalDate.now(),"java", 3.6,"Pointer and array");
        StudyLog sobj4 = new StudyLog(LocalDate.now(),"C", 2.5,"Pointer and array");
        StudyLog sobj5 = new StudyLog(LocalDate.now(),"C++", 2.8,"Interface");

        ArrayList <StudyLog>aobj = new ArrayList<StudyLog>();
       

        aobj.add(sobj1);
        aobj.add(sobj2);
        aobj.add(sobj3);
        aobj.add(sobj4);
        aobj.add(sobj5);

        for(StudyLog sobj :aobj)
        {
            System.out.println(sobj);
        }
    }   
}
