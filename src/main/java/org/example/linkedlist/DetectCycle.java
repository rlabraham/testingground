package org.example.linkedlist;

import java.util.HashSet;
import java.util.Set;

/*Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed).
It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.*/
public class DetectCycle {
    public static ListNode simple(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();

        if (head != null) {
            while (head.next != null) {
                if (listNodes.contains(head.next)) {
                    return head.next;
                } else {
                    listNodes.add(head);
                    head = head.next;
                }
            }
        }
        return null;
    }

    public ListNode optimal(ListNode head) {
        ListNode slow = head, fast = head;

        //detects if there is a loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        //return null if no loop
        if (fast == null || fast.next == null) return null;

        //find start of loop. the distance between the intersection of slow and fast in the first while loop would always be the same as the distance between the head of the list and the beginning of the cycle.
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }

}
