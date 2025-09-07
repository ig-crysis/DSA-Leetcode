//Complete Code
import java.util.Scanner;

// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class OddevenLinkedList {

    // Method to insert node at end
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    // Method to print linked list using temp node
    public static void printList(Node head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Method to rearrange list in odd-even position order
    public static Node oddeven(Node head) {
        if (head == null || head.next == null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.println("Enter elements for the linked list (-1 to end):");
        while (true) {
            int value = sc.nextInt();
            if (value == -1)
                break;
            head = insert(head, value);
        }

        System.out.print("Original LL: ");
        printList(head);

        head = oddeven(head);

        System.out.print("Odd-Even LL:");
        printList(head);

        sc.close();
    }
}
