class intersectionOfTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //160
        ListNode pA = headA;
        ListNode pB = headB;
        
        while(pA != pB){
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        
        return pA;
    }
}