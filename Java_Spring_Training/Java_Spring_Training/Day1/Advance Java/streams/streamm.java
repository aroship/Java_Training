import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class streamm {
    public static void main(String[] args ){
        List<Integer> lst = new LinkedList<>();
        for(int i=0;i<10;i++) {
            lst.add(i);
        }
        List<Integer> modified=lst.
                stream()
                .map(x -> x *x)
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(modified);

        List<String> strList = Arrays.asList("Aroshi",  "Khushi",  "Rishika", "Stm");



        List<String> filtered = strList.stream()
                                .filter(x -> x.length()>=5)
                                .collect(Collectors.toList());
        System.out.println(filtered);
        List<String> changed = strList.stream()

                .filter(x -> !x.contains( "a") &&!x.contains( "e")  && !x.contains( "i")  && !x.contains( "o")  && !x.contains( "u")  )
                .collect(Collectors.toList());
        System.out.println(changed);
        long num = strList.stream() .filter(x -> x.length()>=5) .count();




    }

}
