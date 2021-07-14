import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lambdatest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Anup", 1001);
        map.put("Rahul", 1002);
        map.put("Sumit", 1003);
        map.put("Ravi", 1004);
        map.put("Shree", 1005);
//        for (Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println("Name : " +entry.getKey() + ", Id Number : " + entry.getValue());}
        map.forEach((k, v) -> System.out.println("Name :" + k + ", Id Number :" + v));

        System.out.println("......................");


        List<String> student = new ArrayList<>();
        {
            student.add("Anup");
            student.add("Rahul");
            student.add("Ravi");
            student.add("Jhon");
            student.add("Sarkar");
            // lambda
            //student.forEach(s -> System.out.println(s));




            // method reference
        student.forEach(System.out::println);
        }
    }}
