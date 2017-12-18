package chunk;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;


public class ChunkTest {

    private Chunk chunk;

    @BeforeEach
    void setUp() {
        chunk = new Chunk();
    }

    @Test
    public void test_chunk_divides_an_array_of_10_elements_with_chunk_size_2() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer size = 2;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1, 2))));
        expected.add(new ArrayList<>((Arrays.asList(3, 4))));
        expected.add(new ArrayList<>((Arrays.asList(5, 6))));
        expected.add(new ArrayList<>((Arrays.asList(7, 8))));
        expected.add(new ArrayList<>((Arrays.asList(9, 10))));

        assertIterableEquals(expected, chunk.chunk(arr, size));
    }

    @Test
    public void test_chunk_divides_an_array_of_3_elements_with_chunk_size_1() {
        Integer[] arr = new Integer[]{1, 2, 3};
        Integer size = 1;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1))));
        expected.add(new ArrayList<>((Arrays.asList(2))));
        expected.add(new ArrayList<>((Arrays.asList(3))));

        assertIterableEquals(expected, chunk.chunk(arr, size));
    }

    @Test
    public void test_chunk_divides_an_array_of_5_elements_with_chunk_size_3() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        Integer size = 3;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1, 2, 3))));
        expected.add(new ArrayList<>((Arrays.asList(4, 5))));

        assertIterableEquals(expected, chunk.chunk(arr, size));
    }

    @Test
    public void test_chunk_divides_an_array_of_13_elements_with_chunk_size_5() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Integer size = 5;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1, 2, 3, 4, 5))));
        expected.add(new ArrayList<>((Arrays.asList(6, 7, 8, 9, 10))));
        expected.add(new ArrayList<>((Arrays.asList(11, 12, 13))));

        assertIterableEquals(expected, chunk.chunk(arr, size));
    }

    @Test
    public void test_chunk2_divides_an_array_of_10_elements_with_chunk_size_2() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer size = 2;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1, 2))));
        expected.add(new ArrayList<>((Arrays.asList(3, 4))));
        expected.add(new ArrayList<>((Arrays.asList(5, 6))));
        expected.add(new ArrayList<>((Arrays.asList(7, 8))));
        expected.add(new ArrayList<>((Arrays.asList(9, 10))));

        assertIterableEquals(expected, chunk.chunk2(arr, size));
    }

    @Test
    public void test_chunk2_divides_an_array_of_3_elements_with_chunk_size_1() {
        Integer[] arr = new Integer[]{1, 2, 3};
        Integer size = 1;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1))));
        expected.add(new ArrayList<>((Arrays.asList(2))));
        expected.add(new ArrayList<>((Arrays.asList(3))));

        assertIterableEquals(expected, chunk.chunk2(arr, size));
    }

    @Test
    public void test_chunk2_divides_an_array_of_5_elements_with_chunk_size_3() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        Integer size = 3;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1, 2, 3))));
        expected.add(new ArrayList<>((Arrays.asList(4, 5))));

        assertIterableEquals(expected, chunk.chunk2(arr, size));
    }

    @Test
    public void test_chunk2_divides_an_array_of_13_elements_with_chunk_size_5() {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Integer size = 5;

        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>((Arrays.asList(1, 2, 3, 4, 5))));
        expected.add(new ArrayList<>((Arrays.asList(6, 7, 8, 9, 10))));
        expected.add(new ArrayList<>((Arrays.asList(11, 12, 13))));

        assertIterableEquals(expected, chunk.chunk2(arr, size));
    }
}