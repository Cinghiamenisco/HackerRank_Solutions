// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        SinglyLinkedListNode tmp;
        
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        if(head1.data > head2.data) {
            tmp = new SinglyLinkedListNode(head2.data);
            tmp.next = mergeLists(head1,head2.next);
        } else {
            tmp = new SinglyLinkedListNode(head1.data);
            tmp.next = mergeLists(head1.next,head2);
        }
        
        return tmp;
        
    }
