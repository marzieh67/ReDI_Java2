package ArrayStack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArrayStackException {
        ArrayStack myList = new ArrayStack();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (input.length() != 0) {
            myList.push(input);
            input = scanner.nextLine();
        }
            System.out.println("empty: "+myList.empty());
            System.out.println("push result: " + myList);
            System.out.println("pop result: " + myList.pop());
            System.out.println("top result: " + myList.top());

    }
}
