package MODULE2.HasARelation;

class Department{
    void teach(){
        System.out.println("Teaching");
    }
}
class Student{
    void study(){
        System.out.println("Studying");
    }
}

class College{
    Department d= new Department();//college had a department : Composition
    Student s;//college has a student : Aggregation
        College(Student s){
            this.s=s;
        }

}
public class MainClass6 {
    public static void main(String[] args) {
        Student s1= new Student();
        College c1= new College(s1);
        c1.d.teach();
        c1.s.study();
    }
}
