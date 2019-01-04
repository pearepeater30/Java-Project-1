package org.com1027.formative.ng00367;

public class Salary {
	/** The Salary of an Employee. */
    private double salary;

    /**
     * @return the Employee's Salary.
     */

    public double getSalary(){
        return salary;
    }

    /**
     * @param salary
     *          sets the salary of the Employee.
     *          checks if the salary is bigger than or equal to 0 
     */
    public void setSalary(double salary){
    	 if (salary > 0) {
         	System.out.println("Salary is greater than zero");
         	this.salary = salary;
         }
    	 
    	 else if (salary == 0.0){
         	System.out.println("Salary is equal to zero");
         	this.salary = salary;
         }
    	
    	
    }

    /**
     * Default constructor to create a salary with its default values.
     */
    public Salary(){
        super();
       
        
        
    }

    /**
     * Determines how much of your salary is taxable.
     * 9440 sterling pounds from salary is not taxed, whilst the remaining is taxed by 20%
     * If salary is over 32010 sterling pounds, then the salary excess is taxed by 40%.
     *(Extension, refer to extension file) If age of Employee is less than 65 years old, the personal allowance is set to £9440
     *If their age is over 65 but less than 75, the personal allowance is set to £10500
     *If their age is over 75, the personal allowance is set to £10660
     * @return The total tax cut
     */

    public double calculateTax(){        
    	double tax = 0;
        double excesstax = 0;
        
        double taxable_salary = salary - 9440;

        if (taxable_salary >= 32010) {
        	taxable_salary = salary - 9440;
        	tax = 32010 * 0.2;
            excesstax = (taxable_salary - 32010) * 0.4;
           
        }
        
        else if (taxable_salary < 0){
        	tax = 0;
        }
        
        else {
        	tax = taxable_salary * 0.2;
        }

        return (excesstax+tax);

    }

}
