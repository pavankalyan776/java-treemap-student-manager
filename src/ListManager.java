import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ListManager {

    TreeMap studentsMap = new TreeMap();

    public ListManager(Student [] students){

        for (Student student : students) {
            studentsMap.put(student.lastName, student);
        }
    }

    public void listStudents( ) {
        if(studentsMap.isEmpty()){
            System.out.println("The system has no students in the waiting list");
        } else {
            System.out.println("Listing all Students\n");
            Set entries = studentsMap.entrySet();
            for (Object entry : entries) {
                Map.Entry mapEntry = (Map.Entry) entry;
                Student student = (Student)mapEntry.getValue();
                System.out.println(student);
            }
        }

    }

    public void findStudent(String lastName) {
        if(studentsMap.containsKey(lastName)){
            System.out.println("Student Found\n");
            Student student = (Student)studentsMap.get(lastName);
            System.out.println(student);
        }else{
            System.out.println("\nStudent with name '" + lastName + "' Does not exist.");
        }

    }

    public void updateStudentStatus(String lastName, String newStatus){
        Student student = (Student)studentsMap.get(lastName);
        if(student != null){
            String oldStatus = student.status;
            student.status = newStatus;
            studentsMap.put(lastName,student);
            System.out.println();
            System.out.println("Student ("+ lastName +") status was changed from '" + oldStatus + "'' to '" + newStatus + "'");
            System.out.println(student);
        }else {
            System.out.println();
            System.out.println("Student does not exist. Status was not updated.");
        }
    }

    public void removeStudent(String lastName) {
        Student studentRemoved = (Student)studentsMap.remove(lastName);
        if(studentRemoved != null){
            System.out.println();
            System.out.println("Student removed.");
            System.out.println(studentRemoved);
            System.out.println();
        }else{
            System.out.println("Student was not removed.");
        }
    }


    public void findFirstStudent(){

        Map.Entry firstEntry = (Map.Entry) studentsMap.firstEntry();
        if (firstEntry != null) {
            Student student = (Student) firstEntry.getValue();
            if (student != null) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("There are no students registered.");
    }

    public void findLastStudent(){

        Map.Entry lastEntry = (Map.Entry) studentsMap.lastEntry();
        if (lastEntry != null) {
            Student student = (Student) lastEntry.getValue();
            if (student != null) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("There are no students registered.");
    }

    public void findNextStudent(String searchString){

        Map.Entry nextEntry = (Map.Entry) studentsMap.higherEntry(searchString);
        if (nextEntry != null) {
            Student student = (Student) nextEntry.getValue();
            if (student != null) {
                System.out.println("The Next Student whose last name is greater than '" + searchString +"' is ...");
                System.out.println(student);
                return;
            }
        }
        System.out.println("There are no 'next' student.");
    }


    public void findPreviousStudent(String searchString) {

        Map.Entry previousStudent = (Map.Entry) studentsMap.lowerEntry(searchString);
        if (previousStudent != null) {
            Student student = (Student) previousStudent.getValue();
            if (student != null) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("There are no 'previous' student.");
    }
}