import java.util.ArrayList;
import java.util.function.Consumer;

public class Cunsumerinterface {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(5);
        number.add(9);
        number.add(10);
        number.add(15);
        Consumer<Integer> method = (n) -> {System.out.println(n);};
        number.forEach(method);
    }
}
