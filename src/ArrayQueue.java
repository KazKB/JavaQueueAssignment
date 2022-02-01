public class ArrayQueue {

    // Driver code
    public static void main(String[] args)
    {
        // Create a queue of capacity 5
        AQueue q = new AQueue(5);

        // print Queue elements
        q.queueDisplay();

        // inserting elements in the queue
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);

        // print Queue elements
        q.queueDisplay();

        // insert element in the queue
        q.Enqueue(60);

        // print Queue elements
        System.out.println();
        q.queueDisplay();

        // removes elements at the front
        q.Dequeue();
        q.Dequeue();
        System.out.printf("\nafter two node deletion\n\n");

        // print Queue elements
        q.queueDisplay();

        // print front of the queue
        q.queueFront();

        // inserting elements in the queue
        q.Enqueue(60);
        q.Enqueue(70);
        q.Enqueue(80);
        q.Enqueue(90);
        q.Enqueue(100);

        // print Queue elements
        q.queueDisplay();
    }
}
