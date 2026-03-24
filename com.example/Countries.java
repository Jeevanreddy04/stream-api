import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Countries {
    public static void main(String[] args) {
        List<String> c=new ArrayList<>();
        c.add("India");
        c.add("Germany");
        c.add("Nepal");
        c.add("Italy");

       List<String> sc= c.stream()
                        .map(s->s.toUpperCase())
                        .filter(s->!s.startsWith("G"))
                        .sorted()
                        .collect(Collectors.toList());

    System.out.println(sc);
    }
}
