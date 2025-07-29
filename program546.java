import java.util.*;

class StudyLog
{
   public String Subject;
   public Double Duration;
   public Double Discription;

   public StudyLog(String A, Double B , Double C)
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


public class program546
{
    public static void main(String A[]) 
    {
        StudyLog sobj1 = new StudyLog("C", 2.5,"Pointer and array");
        StudyLog sobj2 = new StudyLog("C++", 2.0,"Interface");
        StudyLog sobj3 = new StudyLog("java", 3.9,"Pointer and array");

        System.out.println(sobj1);
        System.out.println(sobj2);
        System.out.println(sobj3);


    }
    
}
