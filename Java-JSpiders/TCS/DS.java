import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DS {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);

        System.out.println(list);

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        System.out.println(stack);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Initial Queue: " + queue)

        ;

        // Remove an element from the queue
        int removedElement = queue.remove();
        System.out.println("Removed Element: " + removedElement);

        System.out.println("Queue after removal: " + queue);

        // Check the element at the front of the queue
        int head = !queue.isEmpty() ? queue.peek() : null;
        System.out.println("Head of the queue: " + head);
    }
}