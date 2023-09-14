package labsheet4;


public class Question2 {
    public static void main(String[] args) {
        
    
    Teacher t = new Teacher();
    t.teach();
    t.setDetails("ram", 1, 20000);
    t.display();
    
    Accountant a= new Accountant();
    a.calculate();
    a.setDetails("sam", 2, 15000);
    a.display();
    
    Coordinator c=new Coordinator();
    c.organize();
    c.setDetails("hari", 3, 22000);
    c.display();
    
    }   
}
