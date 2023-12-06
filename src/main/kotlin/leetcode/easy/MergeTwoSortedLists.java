package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(
                1, new ListNode(2, new ListNode(4))
        );
        ListNode list2 = new ListNode(
                5, new ListNode(6, new ListNode(7))
        );
        ListNode head = mergeTwoLists(list1, list2);
        while (head != null) {
            System.out.print(head.val);
            head = head.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode curHead = preHead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curHead.next = list1;
                list1 = list1.next;
            } else {
                curHead.next = list2;
                list2 = list2.next;
            }
            curHead = curHead.next;
        }

        curHead.next = list1 == null ? list2 : list1;

        return preHead.next;
    }

    private static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        return list1 == null ? list2 : list1;
    }

    private static ListNode mergeTwoListsWithArrayList(ListNode list1, ListNode list2) {
        ListNode list3;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ArrayList<Integer> sortedList = new ArrayList<>();
        ListNode head = list1;
        while (head != null) {
            sortedList.add(head.val);
            head = head.next;
        }
        head = list2;
        while (head != null) {
            sortedList.add(head.val);
            head = head.next;
        }
        Collections.sort(sortedList);
        list3 = new ListNode(sortedList.get(0));
        ListNode curHead = list3;
        for (int i = 1; i < sortedList.size(); i++) {
            curHead.next = new ListNode(sortedList.get(i));
            curHead = curHead.next;
        }

        return list3;
    }
}
