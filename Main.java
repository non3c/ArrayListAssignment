import javax.swing.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = bigInt("11233");
        ArrayList<Integer> array2 = bigInt("449");
        System.out.println(add(array1, array2));
        System.out.println(SieveOfEratosthenes(50));
        System.out.println(GoldbachConjecture(120));
    }


    public static ArrayList SieveOfEratosthenes(int n) {
        ArrayList<Integer> outcome = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) outcome.add(i);

        for (int i = 0; i < outcome.size(); i++) {
            for (int p = i + 1; p < outcome.size(); p++) {
                if (outcome.get(p) % outcome.get(i) == 0) {
                    outcome.remove(p);
                    p--;
                }
            }
        }
        return outcome;
    }

    public static String GoldbachConjecture(int n) {
        ArrayList<Integer> prime = SieveOfEratosthenes(n);
        int d = 0;
        for (int i : prime) {
            d = n - i;
            if (prime.contains(d)) return i + " + " + d;
        }
        return null;
    }

//    public static ArrayList<Integer> add(ArrayList<Integer> first, ArrayList<Integer> second) {
//        int size = Math.max(first.size(), second.size());
//        ArrayList<Integer> outcome = new ArrayList<Integer>(size+1);
//        for (int i = 0; i < size; i ++) {
//            outcome.add(0);
//        }
//
//        for (int i = size-1;i >= 0; i --) {
//            if (first.size() >= second.size()) outcome.set(i, outcome.get(i) + first.get(i) + second.get(i-(size-second.size())));
//            else outcome.set(i, outcome.get(i) + first.get(i-(size-first.size())) + second.get(i));
//            if (outcome.get(i) >= 10) {
//                if (i > 0) outcome.set(i-1, 1);
//                outcome.set(i, outcome.get(i)-10);
//            }
//        }
//        if (outcome.get(0) == 0) outcome.remove(0);
//        return outcome;
//    }

    public static ArrayList<Integer> add(ArrayList<Integer> first, ArrayList<Integer> second) {
        int size = Math.min(first.size(), second.size());
        for (int i: first) {
            first.set(i, );
            if ()
        }
    }

    public static ArrayList<Integer> bigInt(String n) {
        ArrayList<Integer> outcome = new ArrayList<Integer>();
        for (int i = 0; i < n.length(); i++) outcome.add(Integer.parseInt(n.substring(i, i + 1)));
        return outcome;
    }
}