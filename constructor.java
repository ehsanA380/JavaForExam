/**
 * constructor
 */
public class constructor {
    public String name;
    public constructor(){

    }

    public  constructor(String string) {
        name = string;

    }

    
    
    void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        constructor emp= new constructor();
        constructor emp1= new constructor("ehsan Asnri");
        // emp.setName("Ehsan");
        System.out.println(emp.name);
        System.out.println(emp1.name);
    }
}