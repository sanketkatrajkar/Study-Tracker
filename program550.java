import java.util.*;
import java.time.LocalDate;

class StudyLog
{
   public String Subject;
   public Double Duration;
   public String Discription;
   

   public StudyLog(String A, Double B , String C)
   {
      this.Subject = A;
      this.Duration = B;
      this.Discription = C;

   }

   public void Display()
   {
     System.out.println();
   }

    @Override
      public String toString()
      {
        return Subject + "|" +Duration +" | "+Discription;
      }

}


public class program550
{
    public static void main(String A[]) 
    {
        LocalDate lobj = LocalDate.now();

        System.out.println(lobj);
    }   
}
