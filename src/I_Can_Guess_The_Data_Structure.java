import java.util.*;
public class I_Can_Guess_The_Data_Structure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            boolean isStack = true, isQueue = true, isPriorityQueue = true;

            Stack<Integer> stack = new Stack<>();
            Queue<Integer> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < n; i++) {
                int command = scanner.nextInt();

                if (command == 1) {
                    int x = scanner.nextInt();
                    stack.push(x);
                    queue.offer(x);
                    priorityQueue.offer(x);
                } else {
                    int x = scanner.nextInt();
                    if (stack.isEmpty() && queue.isEmpty() && priorityQueue.isEmpty()) {
                        isStack = isQueue = isPriorityQueue = false;
                    } else {
                        if (!stack.isEmpty() && stack.pop() != x) isStack = false;
                        if (!queue.isEmpty() && queue.poll() != x) isQueue = false;
                        if (!priorityQueue.isEmpty() && priorityQueue.poll() != x) isPriorityQueue = false;
                    }
                }
            }

            if (isStack && !isQueue && !isPriorityQueue) {
                System.out.println("stack");
            } else if (!isStack && isQueue && !isPriorityQueue) {
                System.out.println("queue");
            } else if (!isStack && !isQueue && isPriorityQueue) {
                System.out.println("priority queue");
            } else if (!isStack && !isQueue && !isPriorityQueue) {
                System.out.println("impossible");
            } else {
                System.out.println("not sure");
            }
        }
    }
}
