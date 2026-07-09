/*
cretae reversed linked list using front insertion 
create evenhead, oddhead, eventail
 */
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class linkedlist5 {

    static Node rearrange(Node head) {
        Node evenHead = null;
        Node oddHead = null;

        Node curr = head;

        while (curr != null) {
            Node nextNode = curr.next;

            if (curr.data % 2 == 0) {
                curr.next = evenHead;
                evenHead = curr;
            } else {
                curr.next = oddHead;
                oddHead = curr;
            }

            curr = nextNode;
        }

        if (evenHead == null)
            return oddHead;

        Node temp = evenHead;
        while (temp.next != null)
            temp = temp.next;

        temp.next = oddHead;

        return evenHead;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            Node node = new Node(sc.nextInt());

            if (head == null) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }

        head = rearrange(head);
        print(head);
    }
}