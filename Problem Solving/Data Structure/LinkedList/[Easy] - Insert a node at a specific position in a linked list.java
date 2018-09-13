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
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        
        if (position == 0) {
            SinglyLinkedListNode replace = new SinglyLinkedListNode(data);
            replace.next = head;
            return replace;
        }
        head.next = insertNodeAtPosition(head.next, data, --position);
        return head;
    }
