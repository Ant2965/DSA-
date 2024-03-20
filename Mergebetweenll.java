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

 /*1669. Merge In Between Linked Lists
Solved
Medium
Topics
Companies
Hint
You are given two linked lists: list1 and list2 of sizes n and m respectively.

Remove list1's nodes from the ath node to the bth node, and put list2 in their place.

The blue edges and nodes in the following figure indicate the result:


Build the result list and return its head.

 

Example 1:


Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
Output: [10,1,13,1000000,1000001,1000002,5]
Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result. */
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