import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        LinkedList<Integer> linkedList2 = new LinkedList<>();

        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);

        linkedList2.add(6);
        linkedList2.add(7);
        linkedList2.add(8);
        linkedList2.add(9);
        linkedList2.add(10);

        linkedList1.addAll(linkedList2);

        System.out.println(linkedList1);
    }
}
