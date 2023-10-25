package leetcode.easy;

import java.util.ArrayList;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        ListNode headNode = new ListNode(
                1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))
        );
        System.out.print(middleNode(headNode).val);
    }

    private static ListNode middleNode(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        int length = 0;
        while (head != null) {
            nodes.add(head);
            head = head.next;
            length++;
        }
        return nodes.get(length / 2);
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}