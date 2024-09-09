/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = l1;
        ListNode h2 = l2;
        int ca = 0;
        ListNode cu = new ListNode();
        ListNode h = cu;
        while(h1!=null||h2!=null||ca==1){
            if(h1==null&&h2==null){
                cu.val = 1;
                return h;
            }
            if(h1==null){
                int temp = ca+h2.val;
                ca = temp/10;
                temp = temp%10;
                h2 = h2.next;
                cu.val = temp;
                if(ca==0&&h1==null&&h2==null) return h;
                cu.next = new ListNode();
                cu = cu.next;
                continue;
            }
            if(h2==null){
                int temp = ca+h1.val;
                ca = temp/10;
                temp = temp%10;
                h1 = h1.next;
                cu.val = temp;
                if(ca==0&&h1==null&&h2==null) return h;
                cu.next = new ListNode();
                cu = cu.next;
                continue;
            }
            int temp = ca+h1.val+h2.val;
            ca = temp/10;
            temp%=10;
            h1 = h1.next;
            h2 = h2.next;
            cu.val = temp;
            if(ca==0&&h1==null&&h2==null) return h;
            cu.next = new ListNode();
            cu = cu.next;
        } 
        return h;
    }
}
