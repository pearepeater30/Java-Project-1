package org.com1027.formative.ng00367;

public class Employee {
	/** The Employee's ID. */
    private int id;
    /** The Employee's Forename. */
    private String forename;
    /** The Employee's Surname. */
    private String surname;
    /** (Extension,The Employee's Salary. */
    private Salary salary;
    /** The Employee's Company Position. */
    private CompanyPosition companyPosition;

    /**
     * Parameterized Constructor to create a new Employee.
     * @param id
     *          The Employee's ID.
     * @param forename
     *          The Employee's Forename.
     * @param surname
     *          The Employee's Surname.
     * @param age
     * 			The Employee's Age (Extension).
     * @param salary
     *          The Employee's salary which is calculated by the class Salary.
     * @param companyPosition
     *          The Employee's company position.
     */
    public Employee(int id, String forename, String surname, Salary salary, CompanyPosition companyPosition){
        this.id = id;
        this.forename = forename;
        this.surname = surname;
        this.salary = salary;
        this.companyPosition = companyPosition;
    }
    /**
     * @return the Employee's ID.
     */
    public int getId(){
        return id;
    }

    /**
     * @return the Employee's Forename.
     */
    public String getForename(){
        return forename;
    }

    /**
     * @return the Employee's Surname.
     */
    public String getSurname(){
        return surname;
    }
    

    /**
     * @return the Employee's Salary.
     */
    public double getSalary(){
        return salary.getSalary();
    }

    /**
     * @return the Employee's CompanyPosition.
     */
    public String getPositionName(){
        return companyPosition.getPositionName();
    }

    /**
     * Determines whether an Employee is entitled to a bonus.
     *
     * @return Returns the fact whether the Employee is eligible for a bonus
     */
    public boolean eligibleForBonus(){

        double salary_value = this.salary.getSalary();

        boolean Bonus = false;

        if (salary_value >= 40000){
            Bonus = true;
        }
        return Bonus;
    }
    
    /**
     * toString method used to display the Employee's Surname, Forename, ID number, Company Position, Salary, Tax and bonus eligibility in that order.
     * An if method is used to determine if the Employee is eligible for a bonus.
     *
     * @return Returns the String used to represent the information above.
     */
    @Override
    public String toString(){
        boolean Bonus_variable = eligibleForBonus();
        String return_value = " ";

        if (Bonus_variable == true){
            return_value = getSurname() + ", " + getForename() + " (" + getId() + ")" + ": " + this.companyPosition.getPositionName() + " at " + "£" + this.salary.getSalary() + " (" + "£" + this.salary.calculateTax() + " tax" + ")" + " and is eligible for bonus.";
        }
        if (Bonus_variable == false){
            return_value = getSurname() + ", " + getForename() + " (" + getId() + ")" + ": " + this.companyPosition.getPositionName() + " at " + "£" + this.salary.getSalary() + " (" + "£" + this.salary.calculateTax() + " tax" + ")" + " and is not eligible for bonus.";

        }
    return return_value;

    }

}
