import java.util.*;

public class PartitionIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        int n = scanner.nextInt();
        List<Integer> numbersLis = List.of(3, 3, 7, 2, 10, 14, 5);
        System.out.println(remainder(n, numbersLis));
    }

    public static List<Set<Integer>> remainder(int n, List<Integer> numbersLis) {
        List<Set<Integer>> finalList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> partialSet = new HashSet<>();
            for (int j = 0; j < numbersLis.size(); j++) {
                if (numbersLis.get(j) % n == i) {
                    partialSet.add(numbersLis.get(j));
                }
            }
            finalList.add(partialSet);
        }
        return finalList;
    }
}
