package UML_1;

public class Company {
    private String name ;
    private Employee []arrEmployee ;
    private int nbEmployee ; // número de empleados.

    Company(String name, int size){
        this.name = name ;
        this.nbEmployee = 0 ;
        this.arrEmployee = new Employee[size] ;
        
    }
    public void displayAll(){
        System.out.println("Company name:" + name);
        System.out.println("Number of employees:" + nbEmployee);

        for( Employee e : arrEmployee)
        {
         if(e != null)
            e.display();
        }
    }

    public void addEmployee(Employee e){
        for(int c = 0 ; c < arrEmployee.length ; c++ ){
            if(arrEmployee[c] == null)
            {
                arrEmployee[c] = e ;
                nbEmployee++;
                return;
            }
        }
                
    }

    public int searchName(String name)
    {
        for(int c = 0 ; c < arrEmployee.length ; c++){
            if(arrEmployee[c] != null && arrEmployee[c].getName().equals(name))
                return c ;
        }
        return -1;
    }

    public void deleteEmployee(String name){
        int index = searchName(name) ;
        if( index != -1)
        {
            arrEmployee[index] = null;
            nbEmployee -- ;
            System.out.println("The employee was successfully deleted.");
            return;
        }
        System.out.println("The employee to be deleted was not found.");

    }
    public double getYearlyPay(String name){
        int index = searchName(name) ;
        if(index != -1)
            return arrEmployee[index].calculatePay() ;
        return 0.0;
    }

    public double calAvgPayForPartTime(){
        double totalPay = 0.0;
        for(Employee e : arrEmployee){
            if(e != null && e instanceof PartTimeEmp)
                totalPay+=e.calculatePay();
            
        }
        return nbEmployee == 0? 0.0: totalPay / nbEmployee;
    }
    

    
}

