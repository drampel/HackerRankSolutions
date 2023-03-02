package Java.DataStructures;

import java.util.BitSet;
import java.util.EnumMap;
import java.util.Scanner;
import java.util.function.BiConsumer;

enum Operation {
    AND, OR, XOR, SET, FLIP
}

public class JavaBitSet {
    /* For Java 7, use the first version of the main() method. */
    public static void main(String[] args) {                                                                            //1
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            if (n >= 1 && m >= 1) {
                BitSet[] bitSets = new BitSet[]{new BitSet(n), new BitSet(n)};
                while (m-- > 0) {
                    String operation = scan.next();
                    int indexOne = scan.nextInt();
                    int indexTwo = scan.nextInt();
                    try {
                        switch (Operation.valueOf(operation.toUpperCase())) {
                            case AND:
                                bitSets[indexOne - 1].and(bitSets[indexTwo - 1]);
                                break;
                            case OR:
                                bitSets[indexOne - 1].or(bitSets[indexTwo - 1]);
                                break;
                            case XOR:
                                bitSets[indexOne - 1].xor(bitSets[indexTwo - 1]);
                                break;
                            case SET:
                                bitSets[indexOne - 1].set(indexTwo);
                                break;
                            case FLIP:
                                bitSets[indexOne - 1].flip(indexTwo);
                                break;
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid operation name entered.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Invalid indexes entered.");
                    }
                    System.out.printf("%d %d%n", bitSets[0].cardinality(), bitSets[1].cardinality());
                }
            }
        }
    }

    /* For Java 8 and Java 15, it's also possible to use the second version of the main() method. */

//    public static void main(String[] args) {                                                                          //2
//        try (Scanner scan = new Scanner(System.in)) {
//            int n = scan.nextInt();
//            int m = scan.nextInt();
//            if (n >= 1 && m >= 1) {
//                BitSet[] bitSets = new BitSet[]{new BitSet(n), new BitSet(n)};
//                EnumMap<Operation, BiConsumer<Integer, Integer>> enumMap = new EnumMap<>(Operation.class);
//                enumMap.put(Operation.AND, (indexOne, indexTwo) -> bitSets[indexOne - 1].and(bitSets[indexTwo - 1]));
//                enumMap.put(Operation.OR, (indexOne, indexTwo) -> bitSets[indexOne - 1].or(bitSets[indexTwo - 1]));
//                enumMap.put(Operation.XOR, (indexOne, indexTwo) -> bitSets[indexOne - 1].xor(bitSets[indexTwo - 1]));
//                enumMap.put(Operation.SET, (indexOne, indexTwo) -> bitSets[indexOne - 1].set(indexTwo));
//                enumMap.put(Operation.FLIP, (indexOne, indexTwo) -> bitSets[indexOne - 1].flip(indexTwo));
//                while (m-- > 0) {
//                    String operation = scan.next();
//                    int indexOne = scan.nextInt();
//                    int indexTwo = scan.nextInt();
//                    try {
//                        enumMap.get(Operation.valueOf(operation.toUpperCase())).accept(indexOne, indexTwo);
//                    } catch (IllegalArgumentException e) {
//                        System.out.println("Invalid operation name entered.");
//                    } catch (IndexOutOfBoundsException e) {
//                        System.out.println("Invalid indexes entered.");
//                    }
//                    System.out.printf("%d %d%n", bitSets[0].cardinality(), bitSets[1].cardinality());
//                }
//            }
//        }
//    }
}