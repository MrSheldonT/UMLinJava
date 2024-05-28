package UML_1;

public class PartTimeEmp extends Employee{
    private int nbWorkHours ;
    private int rate ;

    PartTimeEmp(String name, int id, int nbWorkingHours, int rate){
        super(name, id);
        this.nbWorkHours = nbWorkingHours ;
        this.rate = rate ;
    }
    PartTimeEmp(PartTimeEmp p){
        super(p.getName(), p.getId());
        this.nbWorkHours = p.getNbWorkHours() ;
        this.rate = p.getRate() ;
    }

    @Override
    public void display(){
        System.out.println("Name: " + this.getName()  + " ID: " + this.getId() + " Number of work hours: " + this.nbWorkHours + " Rate: " + this.getRate());
        
    }

    @Override
    public double calculatePay(){
        return rate * nbWorkHours ;
    }

    public int getNbWorkHours() {
        return nbWorkHours;
    }
    public int getRate() {
        return rate;
    }
}
