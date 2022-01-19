package school.management.system;

/**
 * This class is responsible for kkeping the track of teacher's name,id,salary.
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Create a new Teacher object
     * @param id id for the teacher
     * @param name name of the teacher
     * @param salary salary for the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id= id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     * return the name of the teacher
     * @return
     */
    public  String getName(){
        return name;
    }

    /**
     * @return the id of the teacher
     */
    public int getId(){
        return id;
    }

    /**
     * @return the salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

    /**
     * set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * add to the salary.
     * removes from the totalMoneyEarned
     * @param salary
     */
    public void recieveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the teacher: "+ name +
                "Total salary earned so far: $ " +salaryEarned;
    }
}
