package student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        welcome();
    }

    /**
     * Enters the group size, and sets the group to that size.
     * If the user inputs a string instead of a number, an error message is displayed, and the user tries again.
     */
    public static void welcome() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Welcome, how big do you want the group to be?");
                int size = scan.nextInt();
                setGroup(size, scan);
                break;
            } catch (Exception e) {
                System.out.println("You need to enter a number, not a string. Try again.");
                scan.nextLine();
            }
        }
    }

    /**
     * Creates a new `Group` object with the specified size, and adds `Student` objects to the group.
     * If the user inputs a string instead of a number, an error message is displayed, and the user tries again.
     * Finally, the group is displayed and the method `makeChanges` is called.
     *
     * @param size The size of the group to be created.
     * @param scan The `Scanner` object used to get user input.
     */
    private static void setGroup(int size, Scanner scan) {
        Group group = new Group(size);
        group.setNumStud(size);

        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.println("Enter a student as follows: student number first name last name \n then click Enter");
                    int sNum = scan.nextInt();
                    String fName = scan.next();
                    String lName = scan.next();
                    Student student = new Student(fName, lName, sNum);
                    group.addStudent(student, i);
                    break;
                } catch (Exception e) {
                    System.out.println("You need to enter a number for student number, not a string. Try again.");
                    scan.nextLine();
                }
            }
        }
        System.out.println("Now the group contains: \n" + group);
        makeChanges(group, scan);
    }

    /**
     * Changing the student by entering their student number.
     * If the user inputs a string instead of a number, an error message is displayed, and the user tries again.
     * Works until the user inputs -1.
     *
     * @param `Group` object to modify.
     * @param `Scanner` object used to get user input.
     */
    private static void makeChanges(Group group, Scanner scan) {
        int sNum = 0;
        while (sNum != -1) {
            while (true) {
                System.out.println("Please enter a student number: ");
                sNum = scan.nextInt();
                if (sNum == -1) break;
                Student name = group.getStudent(sNum);
                if (name != null) {
                    System.out.println("Please for student fill in as follow: first name last name \n then click Enter");
                    String fNameNew = scan.next();
                    String lNameNew = scan.next();

                    group.changeStudent(name, fNameNew, lNameNew);
                    System.out.println("Now the group contains: \n" + group);
                }
            }
        }
    }
}
