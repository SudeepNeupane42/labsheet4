
package labsheet4;


public class Question1 {
    public static void main(String[] args) {
        HRManager hr=new HRManager();
        GeneralManager gm=new GeneralManager();
        hr.setId(100);
        hr.setName("sudeep");
        gm.setId(101);
        gm.setName("shrijana");
        hr.showHRMDetails();
        hr.display();
        gm.showGMdetails();
        hr.display();

        
    }
}
