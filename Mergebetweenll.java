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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p , q, prev1=null;
        p=list1;
        q=list1;
        int count =0;
        while(count<=b){

            if(count<a){
                prev1= p;
                p=p.next;


            }
            // prev2=q;
            q=q.next;
            count++;
        }
        // System.out.println(p.val);
        // System.out.println(q.val);

        prev1.next=list2;
        while(list2.next!=null){
            list2=list2.next;

        }
        list2.next=q;

        return list1;
    }
    
}