import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class testing {
public static void main(String[] args) {
List<String> list = new ArrayList<>();
list.add("behold");
list.add("bend");
list.add("bet");
list.add("bear");
list.add("beat");
list.add("become");
list.add("begin");

List<String> matches = list.stream().filter(it -> it.contains("bea")).collect(Collectors.toList());
List<String> matchesz = phonebook.stream().filter(it -> it.contains("bea")).collect(Collectors.toList());

//phonebook

System.out.println(matches); // [bear, beat]
    
    }
}