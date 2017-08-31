package net.projecteuler.problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class LargestProductTest {
    @Test
    public void findLargestProductTest() {
        // Find the thirteen adjacent digits in the 1000-digit number that have the greatest product.
        final String fileName = "src/main/resources/1000digitnumber";

        try (final Stream<String> stream = Files.lines(Paths.get(fileName))) {
            final List<Integer> integers = stream.mapToInt(Integer::getInteger).boxed().collect(Collectors.toList());
            final LargestProduct largestProduct = new LargestProduct(integers);
            largestProduct.findLargestProduct();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println("10001st prime is: " + entireString);
        //assertEquals(104743, result);
    }

    private void assertEquals(int i, int result) {
    }
}
