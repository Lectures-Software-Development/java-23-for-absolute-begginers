package data_types.wrapper_classes.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericListDemo {
    public static void runGenericListDemo() {
        List<String> stringList = new ArrayList<>();
        stringList.add("John");
        stringList.add("Fred");
        stringList.add("Sam");

        for(var s:  stringList){
            System.out.println(s);
        }

        stringList.forEach(el -> IO.println(el));
        IO.println("*******************************************");
        stringList.forEach(IO::println);

       /* IO.println("List of ******************************");
        stringList = List.of("Alinietwe","Kawalya", "Kabenge", "Mawanda");
        stringList.forEach(IO::println);
*/
       /* IO.println("Reversed List of ******************************");
        var reversed = stringList.reversed();
        IO.println(reversed);
        IO.println(reversed.getFirst());
        IO.println(reversed.getLast());
        reversed.addFirst("Zawedde");
        reversed.addLast("Bamusaliza");*/

        IO.println("Duplicates*****************************");
        stringList.add("John");
        stringList.forEach(IO::println);

        IO.println("Set No Duplicates **********************************");

        Set<String>  stringSet = new HashSet<>();
        stringSet.add("John");
        stringSet.add("Fred");
        stringSet.add("Sam");
        stringSet.add("John");
        stringSet.forEach(IO::println);
    }
}
