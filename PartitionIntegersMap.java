import java.util.*;

public class PartitionIntegersMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter N");
        int n = scanner.nextInt();
        List<Integer> numbersLis = List.of(3, 3, 7, 2, 10, 14, 5);
        System.out.println(remainder(n, numbersLis));
    }

    public static Map<Integer, Set<Integer>> remainder(int n, List<Integer> numbersLis) {
        Map<Integer, Set<Integer>> finalMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> partialSet = new HashSet<>();
            for (Integer numbers : numbersLis) {
                if (numbers % n == i) {
                    partialSet.add(numbers);
                }
                finalMap.put(i, partialSet);
            }
        }
        return finalMap;
    }
}
