package org.com1027.formative.ng00367;

public class CompanyPosition {
	
	/** The Name of Employee's Position, which is default to an empty string. */
    private String positionName = " ";

    /**
     * Default constructor to create a positionName with its default values.
     */
    public CompanyPosition(){
        super();

    }

    /**
     * @return the Employee's Surname.
     */
    public String getPositionName(){
        return positionName;
    }

    /**
     * @param positionName
     *          sets the name of the position for the user.
     */
    public void setPositionName(String positionName){
        this.positionName = positionName;
    }

}
