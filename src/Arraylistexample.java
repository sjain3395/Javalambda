import java.util.ArrayList;

public class Arraylistexample
{
    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<>();    //list 1

        list1.add("Anup");
        list1.add("Brij");
        list1.add("Chintu");
        list1.add("Deep");

        list1.forEach(x-> System.out.println(x));
        System.out.println("..................");

        ArrayList<String> list2 = new ArrayList<>();    //list 2

        list2.add("Shivam");

        list1.addAll(list2);

        System.out.println(list1);      //combined list
    }
}