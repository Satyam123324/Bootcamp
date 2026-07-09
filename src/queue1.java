class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    // Enqueue
    void enqueue(int ticketId) {
        Node newNode = new Node(ticketId);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println("Processed Ticket ID: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // Display
    void display() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class queue1 {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(101);
        q.enqueue(102);
        q.enqueue(103);
        q.enqueue(104);
        q.enqueue(105);

        System.out.print("Queue: ");
        q.display();

        q.dequeue();

        System.out.print("After Dequeue: ");
        q.display();
    }
}