import java.util.ArrayList;

public class Testlambda {
    public static void main(String[] args){
        ArrayList<String> student = new ArrayList<String>();
        student.add("Anup");
        student.add("Ravi");
        student.add("Rahul");
        student.add("Kiran");
        student.add("Summit");
        student.forEach((s) -> {System.out.println(s);});
    }
}
