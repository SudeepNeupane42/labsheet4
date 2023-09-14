
package labsheet4;


public class Employee {
    private int id;
    private String name;
    private int salary;
    
    public void display(){
        System.out.println("my name is "+name+" my id is "+id+" my salary is "+salary);
    }
    
    public void setDetails(String n,int i,int s){
        this.name=n;
        this.id=i;
        this.salary=s;
    }
}
