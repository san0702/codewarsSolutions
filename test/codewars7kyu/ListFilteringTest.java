package codewars7kyu;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListFilteringTest {
    @Test
    public void examples() {
        assertEquals(List.of(1, 2), ListFiltering.filterList(List.of(1, 2, "a", "b")));
        assertEquals(List.of(1, 0, 15), ListFiltering.filterList(List.of(1, "a", "b", 0, 15)));
        assertEquals(List.of(1, 2, 123), ListFiltering.filterList(List.of(1, 2, "aasf", "1", "123", 123)));
    }
}
