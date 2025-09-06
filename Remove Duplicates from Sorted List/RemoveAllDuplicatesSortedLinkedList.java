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

public class RemoveAllDuplicatesSortedLinkedList {

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

    // Method to print linked list
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

    // Remove all duplicates (delete nodes with duplicate values entirely)
    public static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) return head;

        Node dummy = new Node(-1); // Dummy node to handle head removals
        dummy.next = head;
        Node prev = dummy;
        Node cur = head;

        while (cur != null && cur.next != null) {
            if (cur.data == cur.next.data) {
                // Skip all nodes with the same value
                while (cur.next != null && cur.data == cur.next.data) {
                    cur = cur.next;
                }
                prev.next = cur.next; // Remove duplicates
            } else {
                prev = prev.next; // Move to next distinct node
            }
            cur = cur.next;
        }

        return dummy.next;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.println("Enter elements for the sorted linked list (-1 to end):");
        while (true) {
            int value = sc.nextInt();
            if (value == -1)
                break;
            head = insert(head, value);
        }

        System.out.print("Original Linked List: ");
        printList(head);

        head = removeDuplicates(head);

        System.out.print("After removing all duplicates: ");
        printList(head);

        sc.close();
    }
}
