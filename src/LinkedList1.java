import java.util.*;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedList1 {

    static Node head = null, tail = null;

    static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    static void update(int index, int newPrice) {
        Node temp = head;
        int i = 0;

        while (temp != null && i < index) {
            temp = temp.next;
            i++;
        }

        if (temp != null) {
            temp.data = newPrice;
        }
    }

    static void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            insert(sc.nextInt());
        }

        int index = sc.nextInt();
        int newPrice = sc.nextInt();

        update(index, newPrice);
        display();
    }
}