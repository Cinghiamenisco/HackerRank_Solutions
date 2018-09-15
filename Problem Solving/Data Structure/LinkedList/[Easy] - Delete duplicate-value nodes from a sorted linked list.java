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
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

    if ((head == null) || (head.next == null)) return head;
    if (head.data == head.next.data) {
        head.next = head.next.next;
        removeDuplicates(head);
    } else {
        removeDuplicates(head.next);
    }
        return head;      
    }
