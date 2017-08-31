package net.projecteuler.problems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class LargestProduct {
    private final String numbers;


    public LargestProduct(String numbers) {
        this.numbers = numbers;
    }

    public BigInteger findLargestProduct() {
        final List<Integer> window = new CircularQueue(12);
        //List<Integer> results = new ArrayList(12);
        BigInteger total = BigInteger.ZERO;

        for (char number : numbers.toCharArray()) {
            window.add(Character.getNumericValue(number));
            final BigInteger newProduct = getProduct(window);
            System.out.println("Current Total: " + total.toString());
            System.out.println("Current Series: " + window.toString());
            if (total.compareTo(newProduct) < 0) {
                total = newProduct;
                //results.clear();
                //results.addAll(window);
                System.out.println("Updated Total: " + total.toString());
                //System.out.println("Updated Series: " + results.toString());
            }
        }

        System.out.println("Total: " + total.toString());
        //System.out.println("Series: " + results.toString());

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
