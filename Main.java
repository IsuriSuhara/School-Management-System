package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy=new Teacher(1,"Lizzy",500);
        Teacher melista =new Teacher(2,"melista",1000);
        Teacher vanderban=new Teacher(3,"vanderban",1500);





        List<Teacher> teacherList= new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melista);
        teacherList.add(vanderban);

        Student isuri = new Student(1,"Isuri",4);
        Student pathum = new Student(2,"Pathum",5);
        Student jane = new Student(3,"Jane",9);

        List<Student> studentList=new ArrayList<>();
        studentList.add(isuri);
        studentList.add(pathum);
        studentList.add(jane);

        School anula = new School(teacherList,studentList);

        Teacher megan=new Teacher(6,"Megan",900);

        anula.addTeachers(megan);
        System.out.println("Anula has earned: $"+anula.getTotalMoneyEarned());

        isuri.payFees(5000);
        pathum.payFees(15000);
        System.out.println("Anula has earned: $"+anula.getTotalMoneyEarned());

        System.out.println("------------------------Make Anula pay the saries------------------------");
        lizzy.recieveSalary(lizzy.getSalary());
        System.out.println("Anula has spent for salary to "+lizzy.getName()+" and now has "+anula.getTotalMoneyEarned());

        vanderban.recieveSalary(vanderban.getSalary());
        System.out.println("Anula has spent for salary to "+ vanderban.getName()+ " and now has "+anula.getTotalMoneyEarned() );

        System.out.println(lizzy);
        melista.recieveSalary(melista.getSalary());
        System.out.println(melista);


    }
}
