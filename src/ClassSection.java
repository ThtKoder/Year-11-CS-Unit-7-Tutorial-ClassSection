import java.util.*;

public class ClassSection {
    private String subject;

    private int capacity;

    private int yearLevel;

    static ArrayList<Student> students = new ArrayList<>();

    ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student addStudent) {
        if (addStudent.getYearLevel() == this.yearLevel) {
            for(Student s : students){
                if(s.equals(addStudent)){
                    return;
                }
            }
            /*System.out.println(students);
            System.out.println(addStudent);*/

            students.add(addStudent);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public boolean isStudentEnrolled(Student student){
        if(students.equals(student)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ClassSection{" +
                "subject='" + subject + '\'' +
                ", capacity=" + capacity +
                ", yearLevel=" + yearLevel +
                ", students=" + "[]" + '}';
    }
}
