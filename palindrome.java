//package java2024;

public class palindrome{
	
		public static class node{
			int data;
			node next;
			public node(int data) {
				this.data=data;
				this.next=null;
			}
		}
		public static node head = null;;
		public static node tail = null;
		
		
		public static void add(int data) {
			node newn=new node(data);

			if(head==null) {
				head=newn;
				tail=newn;
			}
			else {
				tail.next=newn;
				tail=tail.next;
			}
			
			
		}
		
		
		public static node mid(node head) {
			
			node slow =head;
			node fast= head;
			while(fast!=null&&fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
				
			}
			return slow;
			
		}
		
		public static node reverse(node mid){
			node prev = null;
			node ne= null;
			node curr = mid;
			
			
			
			while(curr!= null) {
				ne=curr.next;
				curr.next=prev;
				prev=curr;
				curr=ne;
				
				
			}
			
			return prev;
			
			
			
			
			
		}
		
		public static boolean check(node temphead,node tempnewhead,node mid) {
			
			while(temphead!=mid && tempnewhead !=null) {
				if(temphead.data!=tempnewhead.data) {
					return false;
				}
				
				temphead=temphead.next;
				tempnewhead=tempnewhead.next;
				
				
			}
			return true;
			
			
			
		}
		
		public static void main(String agrs[]) {
			
			add(43);
			add(44);
			add(44);
			add(43);
			
			node temp =head;
			
			while(temp!=null) {	
				
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		node getmid= mid(head);
		
			
		node newhead = reverse(getmid);
		
		
		System.out.println(getmid.data);
		
		System.out.println(newhead.data);
		
		System.out.println(check(head,newhead,getmid));
		
		


			
			
			
			
			
		}

}
