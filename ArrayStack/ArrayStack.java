package ArrayStack;

import java.util.ArrayList;

public class ArrayStack extends ArrayList {
    /**
     * defining different methods of array stack
     */

    public boolean empty() {
        return isEmpty();
    }

    /**
     *
     * @return removes the last element and return the rest list
     * @throws ArrayStackException
     */
    public Object pop() throws ArrayStackException {
        int n = size();
        if (n <= 0) {
            throw new ArrayStackException();
        } else
            return remove(n - 1);
    }

    /**
     *
     * @param item is the element that is going to be added to the list
     * @return
     */
    public Object push(Object item) {
        add(item);
        return item;
    }

    /**
     *
     * @return returns the top element
     * @throws ArrayStackException
     */
    public Object top() throws ArrayStackException {
        int n = size();
        if (n <= 0) {
            throw new ArrayStackException();
        } else
            return get(n - 1);
    }
}
