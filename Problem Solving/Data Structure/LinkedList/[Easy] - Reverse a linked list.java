// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        
        if(head.next.next == null) {
            head.next.next = head;
            return head.next;
        }
        SinglyLinkedListNode newhead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newhead;
    }
