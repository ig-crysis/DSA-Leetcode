Skip to main content
Google Classroom
Classroom
SJT103
G2(MCA)
Home
Calendar
Enrolled
To-do
S
SJT103
G2(MCA)
Archived classes
Settings
Stream
Classwork
People
SJT103
G2(MCA)
Upcoming
Woohoo, no work due soon!

Announce something to your class

Post by vijaykumar kalluri
vijaykumar kalluri
Created YesterdayYesterday
Stack Programs

Basic Calculator.txt
Text

EvalRPN.txt
Text

Add class comment…


Post by vijaykumar kalluri
vijaykumar kalluri
Created Sep 1Sep 1
Min stack Program 
TC: O(1)
SC:O(n)

Min Stack Program.txt
Text

Add class comment…


Post by vijaykumar kalluri
vijaykumar kalluri
Created Aug 28Aug 28
Add Two Numbers

Add Two Numbers.txt
Text

Add class comment…


Post by vijaykumar kalluri
vijaykumar kalluri
Created Aug 26Aug 26
Partition list

partition List.txt
Text

Add class comment…


Post by vijaykumar kalluri
vijaykumar kalluri
Created Aug 14Aug 14
Practice Links
https://leetcode.com/problem-list/n4pcgjs3/

https://www.hackerrank.com/contests/vit-bsts301p/challenges
2nd page 4th Program onwards.

Algorithm_Complexity_Sheet.pdf
PDF

bs.txt
Text

Delete Middle Node d.txt
Text

DeleteMiddleNode.txt
Text

Linked list pallindrom ot not.txt
Text

Max SubArray Program.txt
Text

Maximum_sum_of_hour_glass_in_matrix.txt
Text

Merge 2 sorted Linked Lists.txt
Text

Odd even Linkedlist.txt
Text

Remove all duplicaties.txt
Text

RemoveNodefromend.txt
Text

Reverse Linked List.txt
Text

Rotate Linked List.txt
Text

Spiral Matrix.txt
Text

Swap Elements.txt
Text

Mahreen AishaAug 22
sir will direct questions be asked for the 2 coding questions? or will it be scenario-based or asked in a differet way?

Add class comment…

Assignment: "Assignment -1 "
vijaykumar kalluri posted a new assignment: Assignment -1
Created Aug 12Aug 12 (Edited Aug 13)

Post by vijaykumar kalluri
vijaykumar kalluri
Created Aug 9Aug 9
Technical Slot : 
Dear Student,
 
I hope this email finds you well.
 
I am writing to inform you of some important upcoming assessment updates. Firstly, I want to share the pattern for CAT 1, which will consist of 10 multiple-choice questions each carrying 6 marks and 2 coding questions each carrying 20 Marks to be completed within 75 minutes.
 
Moreover, Assessment 1 (15 MCQ - 15 Marks) has been scheduled for "
Assessment Dates: 
F1,F2 - 13 Aug 2025
E1,E2,D1,D2,G1,G2 - 14 Aug", and it covers the same syllabus as CAT 1. This assessment is important in our academic calendar, and we encourage you to prepare diligently for it.
 
Materials will be share in this Google class room and will Update in VTOP. I would highly recommend you review these materials to make sure you are prepared for the assessments and CAT exam.
 
CAT 1 Syllabus: Topics covered August 12 ,2025. 
 
Students with valid proof will be allowed to write a Reassessment. 
If you have any questions or need additional clarification regarding the updated material or assessment schedule, please feel free to contact us at vitfaceprepassistance@gmail.com. Our team is here to assist you and address any concerns you may have.
 
Thank you for your attention to this matter, and I wish you the best of luck with your preparations for the upcoming assessments.
 
Note : 
Attendance will be provided only if you are physically present.
In case of any attendance for OD or medical leave please contact your HOD or proctor.

Add class comment…


Post by vijaykumar kalluri
vijaykumar kalluri
Created Aug 7Aug 7
Swapping and removing  the elements in the Linked List

RemoveElementsLinkedList.java
Java

SwapKthNodeLinkedList.java
Java
1 class comment

Mahreen AishaAug 9
Thank you, Sir.

Add class comment…


Post by vijaykumar kalluri
vijaykumar kalluri
Created Aug 6Aug 6
Odd Even Linked List

Odd even Linkedlist.txt
Text

Add class comment…


Post by vijaykumar kalluri
vijaykumar kalluri
Created Aug 4Aug 4
Syllabus

Find Greatest Common Divisor of Array
Block Swap Algorithm
Max product subarray
Maximum sum of hour glass in matrix
Reverse Linked List
Merge Two Sorted Lists
Palindrome Linked List
Remove Linked List Elements
Rotate List
Odd Even Linked List
Swapping Nodes in a Linked List
Delete the Middle Node of a Linked List
Remove Nth Node From End of List
Remove Duplicates from Sorted List II

Add class comment…

View class information
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {

    // Method to check if the linked list is a palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;

        // Step 1: Find middle of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        Node secondHalf = reverse(slow.next);

        // Step 3: Compare the first and second halves
        Node firstHalf = head;
        Node temp = secondHalf;
        while (temp != null) {
            if (firstHalf.data != temp.data)
                return false;
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    // Insert at end
    public static Node insert(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) return newNode;
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
        return head;
    }

    // Print the list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.println("Enter elements of the linked list (enter -1 to stop):");
        while (true) {
            int value = sc.nextInt();
            if (value == -1)
                break;
            head = insert(head, value);
        }

        System.out.print("Linked List: ");
        printList(head);

        if (isPalindrome(head))
            System.out.println("The linked list is a palindrome.");
        else
            System.out.println("The linked list is NOT a palindrome.");
    }
}
Linked list pallindrom ot not.txt
Displaying Linked list pallindrom ot not.txt.
