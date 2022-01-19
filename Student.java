package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
//To create a new @param id,name and grade

    /**
     * To create new Student by initializing.
     * Fees for every studnet is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
    //Not going to alter student's name, id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Keep adding the fees to the feesPaid field.
     * feespaid=10,000 +5,000+15,000
     * Add the feess to the fees paid.
     *The school is going to recieve the funds
     * @param fees
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * @return the id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return the fees paid by the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return remaining fees
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name:"+name+
                " ,Total fees paid so far $"+feesPaid;
    }
}
