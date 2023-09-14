
package labsheet4;


public class Question3 {
    public static void main(String[] args) {
        Student st=new Student();
        Result r1=new Result();
        Result r2=new Result();
        r1.setRoll(10);
        r2.setRoll(11);
        r1.setMarks(85, 90);
        r2.setMarks(70, 86);
        r1.CalculatePercent();
        r2.CalculatePercent();
        System.out.println("roll= "+r1.getRoll()+" percentage= "+r1.getPercent());
        System.out.println("roll= "+r2.getRoll()+" percentage= "+r2.getPercent());   
                
    }
}
