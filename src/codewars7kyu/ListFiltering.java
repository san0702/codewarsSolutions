package codewars7kyu;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * https://www.codewars.com/kata/53dbd5315a3c69eed20002dd/train/java
 */
public class ListFiltering {

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(x -> x instanceof Integer).collect(Collectors.toList());
            }

}
