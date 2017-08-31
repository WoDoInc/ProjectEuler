package net.projecteuler.problems;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestProductTest {
    @Test
    public void findLargestProductTest() {
        // Find the thirteen adjacent digits in the 1000-digit number that have the greatest product.
        final String fileName = "src/main/resources/1000digitnumber";
        BigInteger result = BigInteger.ZERO;

        try (final Stream<String> stream = Files.lines(Paths.get(fileName))) {
            final String integerString = stream.collect(Collectors.joining());
            final LargestProduct largestProduct = new LargestProduct(integerString);
            result = largestProduct.findLargestProduct();
        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals(new BigInteger("23514624000"), result);
    }
}
