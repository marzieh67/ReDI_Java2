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
        for (Integer number : numbersLis) {
            int i = number % n;
            if (!finalMap.containsKey(i)) {
                finalMap.put(i, new HashSet<>());
            }
            finalMap.get(i).add(number);
        }


        return finalMap;
    }
}
