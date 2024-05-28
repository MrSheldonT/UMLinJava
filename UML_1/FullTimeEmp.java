package UML_1;

public class FullTimeEmp extends Employee{
    private int salary ;

    FullTimeEmp(String name, int id, int salary){
        super(name, id) ;
        this.salary = salary;
    }
    FullTimeEmp(FullTimeEmp f){
        super(f.getName(),f.getId());
        this.salary = f.getSalary() ;
    }
    @Override
    public void display() {
        //super.display();
        System.out.println("Name: " + getName()  + " ID: " + getId() + " Salary: " + getSalary());
    }
    @Override
    public double calculatePay() {
        
        return salary == 0 ? 0.0: salary * 1; // Definido así por la falta de definición de cómo es la forma de calcularlo.
    }

    public int getSalary() {
        return salary;
    }
}
