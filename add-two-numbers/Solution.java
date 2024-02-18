class Solution {
    public static void main(String[] args) {
        System.out.println("lol");

        addTwoNumbers(null, null);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int current = 0;

        var next = new ListNode();
        var result = next;

        while (l1 != null || l2 != null || current > 0) {
            if (l1 != null) {
                current += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                current += l2.val;
                l2 = l2.next;
            }

            next.next = new ListNode(current % 10);
            current = current / 10;
            next = next.next;
        }

        return result.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}