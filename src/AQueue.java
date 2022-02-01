import java.util.Arrays;

public class AQueue {
    // Java program to implement a queue using an array

    private static int front, rear, capacity;
    private static int[] queue;

    AQueue(int c)
    {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    // function to state whether the
    // is full or not
    private static boolean isFull() {
        boolean flag = false;
        // check queue is full or not
        if (capacity == rear) {
            flag = true;
        }
        else if (capacity > rear) {
            flag = false;
        }
        return flag;
    }

    // function to insert an element
    // at the rear of the queue
    static void Enqueue(int data)
    {
        // insert element at the rear
        // if array is not full
        // else increase array size by 5
        if (isFull()) {
            // copies original queue array to a
            // remake of queue and increase the size of
            // queue and capacity by 5 while still adding
            // the added item to the array
            queue = Arrays.copyOf(queue, queue.length + 5);
            capacity+=5;
            queue[rear] = data;
            rear++;
        }
        else if (capacity > rear){
            queue[rear] = data;
            rear++;
        }
    }

    // function to delete an element
    // from the front of the queue
    static void Dequeue()
    {
        // if queue is empty
        if (front == rear) {
            System.out.println("\nQueue is empty\n");

        }

        // shift all the elements from index 2 till rear
        // to the right by one
        else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }

            // store 0 at rear indicating there's no element
            if (rear < capacity)
                queue[rear] = 0;

            // decrement rear
            rear--;
        }
    }

    // print queue elements
    static void queueDisplay()
    {
        int i;
        if (front == rear) {
            System.out.println("\nQueue is Empty");
        }

        // traverse front to rear and print elements
        for (i = front; i < rear; i++) {
            System.out.printf("%d <-- ", queue[i]);
        }
        System.out.println();
    }

    // print front of queue
    static void queueFront()
    {
        if (front == rear) {
            System.out.println("\nQueue is Empty\n");
            return;
        }
        System.out.printf("\nFront Element is: %d", queue[front]);
        System.out.println("\n");
    }
}


