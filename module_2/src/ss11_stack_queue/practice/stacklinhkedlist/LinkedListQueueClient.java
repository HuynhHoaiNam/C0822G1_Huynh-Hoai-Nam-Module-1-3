package ss11_stack_queue.practice.stacklinhkedlist;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(30);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(2);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);

    }
}
