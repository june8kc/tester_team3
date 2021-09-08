package com.main;

import java.sql.SQLException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Student.controlTable();
        boolean isContinue = true;
        Scanner scan = new Scanner(System.in);
        while (isContinue) {
        System.out.println("=====Welcome to StudentDB=====");
		System.out.println("Menu");
        System.out.println("Add student                  (1)");
        System.out.println("Delete student               (2)");
        System.out.println("List students                (3)");
        System.out.println("!Delete all students!        (4)");
        System.out.println("Quit the app                 (5)");
        System.out.println("================================");
        System.out.println("Enter your selection...");
        int sel = scan.nextInt();
        System.out.println("================================");
        switch (sel) {
            case 1:
                System.out.println("Please enter student ID");
                int studentid = scan.nextInt();
                System.out.println("================================");
                System.out.println("Please enter student's First Name");
                String fname = scan.next();
                System.out.println("================================");
                System.out.println("Please enter student's Last Name ");
                String lName = scan.next();
                System.out.println("================================");
                System.out.println("Please enter average");
                int average = scan.nextInt();
                System.out.println("================================");
                Student.AddStudent(studentid, fname, lName, average);
                break;
            case 2:
                System.out.println("please enter the id of the student to be deleted");
                int id = scan.nextInt();
                System.out.println("================================");
                Student.DeleteStudent(id);
                break;
            case 3:
                Student.ListStudent();
                break;
            case 4:
                Student.deleteAllStudent();
                break;
            case 5:
                isContinue=false;
                break;
        }
        
        }
    }
}
