import java.util.*;

public class ListClass {

    public static void main(String args[]){
        //Linked List
        List<String> userName=new LinkedList<>();
        userName.add("1");
        userName.add("2");
        userName.add("3");
        userName.set(1,"23");

        //ArrayList
        List<Integer>userIds=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            userIds.add(i);
        }
        userIds.set(2,5);

        //Map
        Map<Integer, String> userMap = new HashMap<>();

        userMap.put(1,"Khushi");
        userMap.put(2,"Aroshi");
        userMap.put(3,"Sumitra");
        userMap.put(4,"Rishika");

        System.out.println(userMap.entrySet());
        System.out.println(userMap.keySet());
        System.out.println(userMap.get(1));
        userMap.clear();
        System.out.println(userMap);
        userMap.keySet().forEach(System.out::println);

        System.out.println(userIds);
        System.out.println(userName);
    }

}
