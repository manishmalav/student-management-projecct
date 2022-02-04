package school.maganegent.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int FeesPaid;
    private int FeesTotal;

    /* to create a student object constructor creates new values for student by initializing*/


    public Student(int id, String name, int grade){

         this.FeesPaid = 0;
         this.FeesTotal = 50000;
         this.id = id;
         this.name = name;
         this.grade = grade;

    }

    public void setGrade(int grade){
        this.grade = grade;
    }
    public void payFees(int fees){
        FeesPaid+=fees;
        School.updateTotalMoneyEarned(FeesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return FeesPaid;
    }

    public int getFeesTotal() {
        return FeesTotal;
    }
    public int getRemainingFees(){
        return FeesTotal-FeesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : " + name + " Total fees paid so far " + FeesPaid;
    }
}
