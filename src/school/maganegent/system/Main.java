package school.maganegent.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher manish  = new Teacher(1,"Manish",3000);
        Teacher piyush = new Teacher(2,"Piyush",4000);
        Teacher chriag = new Teacher(3,"Chriag",3500);
        Teacher disha  = new Teacher(4,"Disha",4000);


        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(manish);
        teacherList.add(piyush);
        teacherList.add(chriag);
        teacherList.add(disha);


        Student govind = new Student(1,"Govind",9);
        Student uma  = new Student(2,"Uma",9);
        Student keshav = new Student(3,"Keshav",8);
        Student kush = new Student(4,"Kush",9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(govind);
        studentList.add(uma);
        studentList.add(uma);
        studentList.add(keshav);
        studentList.add(kush);

        School ips = new School(teacherList,studentList);
        govind.payFees(5000);
        uma.payFees(5000);
        keshav.payFees(4000);
        kush.payFees(7000);

        System.out.println("IPS School earned Rs " + ips.getTotalMoneyEarned());

        System.out.println("----------School pay Salary---------");
        disha.receiveSalary(disha.getSalary());
        System.out.println("IPS has spent salary to " + disha.getName() + " and now has " + ips.getTotalMoneyEarned());

        manish.receiveSalary(manish.getSalary());
        System.out.println("IPS has spent salary to " + manish.getName() + " and now has " + ips.getTotalMoneyEarned());

        System.out.println(kush);
        System.out.println(disha);
        System.out.println(piyush);

    }
}
