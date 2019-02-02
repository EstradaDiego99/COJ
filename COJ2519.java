import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

import sun.misc.Queue;
public class COJ2519{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        short t = Short.valueOf(scan.nextLine());
        while(t>0){
            String line = scan.nextLine();
            String[] operations = line.split("\\s");
            try {
                System.out.print(stackOperation(operations)+" ");
                System.out.print(queueOperation(operations)+" ");
                System.out.println(priqueueOperation(operations));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            t--;
        }
        
    }

    public static int stackOperation(String[] operations){

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<operations.length; i++){
            int a, b;
            switch(operations[i]){
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b+a);
                break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b-a);
                break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b*a);
                break;
                default:
                    stack.push(Integer.valueOf(operations[i]));
                break;
            }
        }

        return stack.pop();

    }

    public static int queueOperation(String[] operations) throws InterruptedException {

        Queue<Integer> queue = new Queue<>();
        for(int i=0; i<operations.length; i++){
            int a, b;
            switch(operations[i]){
                case "+":
                    a = queue.dequeue();
                    b = queue.dequeue();
                    queue.enqueue(b+a);
                break;
                case "-":
                    a = queue.dequeue();
                    b = queue.dequeue();
                    queue.enqueue(b-a);
                break;
                case "*":
                    a = queue.dequeue();
                    b = queue.dequeue();
                    queue.enqueue(b*a);
                break;
                default:
                    queue.enqueue(Integer.valueOf(operations[i]));
                break;
            }
        }

        return queue.dequeue();

    }

    public static int priqueueOperation(String[] operations) throws InterruptedException {

        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for(int i=0; i<operations.length; i++){
            int a, b;
            switch(operations[i]){
                case "+":
                    a = pQueue.poll();
                    b = pQueue.poll();
                    pQueue.add(b+a);
                break;
                case "-":
                    a = pQueue.poll();
                    b = pQueue.poll();
                    pQueue.add(b-a);
                break;
                case "*":
                    a = pQueue.poll();
                    b = pQueue.poll();
                    pQueue.add(b*a);
                break;
                default:
                    pQueue.add(Integer.valueOf(operations[i]));
                break;
            }
        }

        return pQueue.poll();

    }
}
    