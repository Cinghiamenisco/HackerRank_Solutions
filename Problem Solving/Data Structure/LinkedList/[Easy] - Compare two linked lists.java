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
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        
        //Caso base
        if ((head1==null) && (head2==null)) return true;
        if ((head1==null) || (head2==null)) return false;
        if (head1.data != head2.data) return false;
        
        return compareLists(head1.next,head2.next);

    }
