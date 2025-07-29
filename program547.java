import java.util.*;

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

    @Override
      public String toString()
      {
        return Subject + "|" +Duration +" | "+Discription;
      }

}


public class program547
{
    public static void main(String A[]) 
    {
        StudyLog sobj1 = new StudyLog("C", 2.5,"Pointer and array");
        StudyLog sobj2 = new StudyLog("C++", 2.0,"Interface");
        StudyLog sobj3 = new StudyLog("java", 3.0,"Pointer and array");
        StudyLog sobj4 = new StudyLog("C", 2.5,"Pointer and array");
        StudyLog sobj5 = new StudyLog("C++", 2.0,"Interface");

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
