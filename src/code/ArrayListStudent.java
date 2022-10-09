package code;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudent {

    private Stringa StdName;
    private int StdId;
    private boolean CourseRegister;

    public ArrayListStudent(Stringa stdName, int stdId, boolean courseRegister) {
        this.StdName = stdName;
        this.StdId = stdId;
        this.CourseRegister = courseRegister;
    }

    public Stringa getStdName() {
        return StdName;
    }

    public void setStdName(Stringa stdName) {
        StdName = stdName;
    }

    public int getStdId() {
        return StdId;
    }

    public void setStdId(int stdId) {
        StdId = stdId;
    }

    public boolean isCourseRegister() {
        return CourseRegister;
    }

    public void setCourseRegister(boolean courseRegister) {
        CourseRegister = courseRegister;

    }
}

class tester{
    public static void main(String[] args) {
        List<ArrayListStudent> list1 = new ArrayList<ArrayListStudent>();

        list1.add(new ArrayListStudent("aditya",101,true));
        list1.add(new ArrayListStudent("rachit",102,true));
        list1.add(new ArrayListStudent("harsh",103, false));
        list1.add(new ArrayListStudent("rishu ",104,false));

        System.out.println(list1);

        List<ArrayListStudent> list2 = new ArrayList<>();

        for(ArrayListStudent l : list2){
            list2.set(list2.set());

            System.out.println("Student Name :" + l.getStdName());
            System.out.println(" Student Id " +l.getStdId());
            System.out.println("Course Registered : " +l.isCourseRegister());

        }

        System.out.println("Student Names : " );
    }
}
