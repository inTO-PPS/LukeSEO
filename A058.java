import DS.ListNode;

class A058 {

    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode current=head;
        ListNode next=head.next;
        ListNode temp;
        head.next=null;
        while(next!=null){
            temp=next.next;
            next.next=current;
            current=next;
            next=temp;
        }
        return current;
    }
    
}