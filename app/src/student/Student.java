/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 * @author Gebruiker
 */
public class Student {
    private String firstName;
    private String lastName;
    private int stNumber;

    public Student(String fName, String lName, int sNum) {
        this.firstName = fName;
        this.lastName = lName;
        this.stNumber = sNum;
    }

    /**
     * Sets the first name for the student
     * @param 'String' fName
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * Sets the last name for the student
     * @param 'String' lName
     */
    public void setLastName(String lName) {
        lastName = lName;
    }

    /**
     * @return 'int' stNumber
     */
    public int getStudNum() {
        return stNumber;
    }

    /**
     * @return 'String' {first_name last_name, student_number}
     */
    public String toString() {
        return firstName + " " + lastName + " " + ", s" + stNumber + "\n";
    }

}
