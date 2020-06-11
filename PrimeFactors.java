import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number: ");
        int n = scanner.nextInt();
        System.out.println(primeFactors(n));
    }

    private static List<Integer> primeFactors(int n) {
        List<Integer> primeList = new ArrayList<>();
        int r = n / 2;
        for (int j = 2; j <= r; j++) {
            while (n % j == 0) {
                primeList.add(j);
                n = n / j;
            }
            if (n == 1){
                return primeList;
            }
        }
        if ((primeList.isEmpty() && (n != 1))){
            primeList.add(n);
        }
        return primeList;
    }
}
