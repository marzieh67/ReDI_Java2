package ArrayStack;

import java.util.HashMap;
import java.util.Map;

public class IsBalanced {
    public static void main(String[] args) throws ArrayStackException {

        System.out.println(isBalanced("{{([][])}()}"));
    }

    public static boolean isBalanced(String input) throws ArrayStackException {
        Map<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('{', '}');
        bracketMap.put('[', ']');
        bracketMap.put('(', ')');
        ArrayStack nestedBrackets = new ArrayStack();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (bracketMap.containsKey(current)) {
                nestedBrackets.push(current);
            } else if ((bracketMap.get(nestedBrackets.top())) == current) {
                nestedBrackets.pop();

            } else return false;


        }
        return nestedBrackets.empty();
    }
}
