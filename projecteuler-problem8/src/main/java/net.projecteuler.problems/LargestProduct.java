package net.projecteuler.problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LargestProduct {
    private final List<Integer> numbers;


    public LargestProduct(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public BigInteger findLargestProduct() {
        List<Integer> window = new CircularQueue(13);
        List<Integer> results = new ArrayList(13);
        BigInteger total = BigInteger.ZERO;

        for (final Integer number : numbers) {
            results.add(number);
            final BigInteger newProduct = getProduct(window);
            if (total.compareTo(newProduct) < 0) {
                total = newProduct;
                results = window;
            }
        }

        System.out.println("Total: " + total.toString());
        System.out.println("Series: " + results.toString());

        return total;
    }

    private BigInteger getProduct(List<Integer> queue) {
        return queue.stream()
            .map(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    private class CircularQueue<K> extends ArrayList<K> {

        private int maxSize;

        public CircularQueue(int size){
            this.maxSize = size;
        }

        public boolean add(K k){
            boolean r = super.add(k);
            if (size() > maxSize){
                removeRange(0, size() - maxSize - 1);
            }
            return r;
        }

        public K getYongest() {
            return get(size() - 1);
        }

        public K getOldest() {
            return get(0);
        }

        public String getSeries() {
            return super.toString();
        }
    }
}
