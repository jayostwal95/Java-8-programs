//Java program to read contentts and display from a stream/file.
package collection;
import java.util.AbstractMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class readfile {
	public static Map<String, String> getDetails()
    {
        return Stream.of(
                new AbstractMap.SimpleEntry<>("Name", "Manoj"),
                new AbstractMap.SimpleEntry<>("Age", "25"),
                new AbstractMap.SimpleEntry<>("Gender", "Male")
        )
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    // Return multiple values from a method in Java
    public static void main(String[] args)
    {
        Map<String, String> person = getDetails();

        for (String key : person.keySet()) {
            System.out.println(key + " : " + person.get(key));
        }
    }
}