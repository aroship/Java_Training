
import java.util.*;
public class Generics{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		MyLinkedList<? super Number> ml = new MyLinkedList<>();
//		ml.insertAtEnd(10);
//		ml.insertAtEnd(18);
//		ml.insertAtEnd(16);
//		ml.display();
//		System.out.println();

        List list = new ArrayList();
        list.add(12);
        list.add("10");
        list.add(24);
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                sum += (Integer) list.get(i);

            }
        }
        System.out.println(sum);

    }


}











