package studentdatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses = "";
    private String studentID;
    private int costOfCourse = 600;
    private int tuitionBalance = 0;
    private static int id = 1000;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter the last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("1- Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nSelect course:");
        this.gradeYear = scanner.nextInt();

        setStudentID();

        System.out.println(firstName +" "+ lastName +" "+ gradeYear + " "+studentID);

    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll(){
        do {
            System.out.println("Enter course to enroll(Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                System.out.println("Break!");
                break;
            }
        } while (1!=0);
        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);
    }

    //view balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition(int payment){
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

}
