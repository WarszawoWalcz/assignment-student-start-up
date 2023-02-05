/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author Gebruiker
 */
public class Group {
    private Student[] all;
    private int numStud;

    public Group(int amount) {
        all = new Student[amount];
        numStud = 0; //amount?
    }

    /**
     * Sets the size of the group - the number of students.
     * @param 'number' number
     */
    public void setNumStud(int number) {
        numStud = number;
    }

    /**
     * Adds to the group Student object.
     * @param 'Student' name
     * @param 'int' place
     */
    public void addStudent (Student name, int place) {
       all[place] = name;
    }

    /**
     * Returns string representation of the whole group.
     * @return 'String' list
     */
    public String toString(){
        String list = "";
        for (int i = 0; i < numStud; i++){
            list += all[i].toString() + "\n";
        }
        return list;
    }

    /**
     * Changes the student first name and last name for given Student object.
     * @param 'Student' student
     * @param 'String' fNameNew
     * @param 'String' lNameNew
     */
    public void changeStudent(Student student, String fNameNew, String lNameNew){
        student.setFirstName(fNameNew);
        student.setLastName(lNameNew);
    }

    /**
     * Returns the Student object that matches given student number.
     * @param 'int' sNum
     * @return Student' student
     */
    public Student getStudent(int sNum) {
        for (Student student:
             all) {
            if (student.getStudNum() == sNum){
                return student;
            }
        }
        System.out.println("Student not found");
        return null;
    }
}
