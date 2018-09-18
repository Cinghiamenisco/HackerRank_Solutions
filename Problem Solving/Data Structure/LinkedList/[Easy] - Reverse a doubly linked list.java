// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
                
        while (head.next != null) {
            
            DoublyLinkedListNode tmp = head.next;
            head.next = head.prev;
            head.prev = tmp;
            
            head = tmp;
        }
        
            DoublyLinkedListNode tmp = head.next;
            head.next = head.prev;
            head.prev = tmp;
        
        return head;
        
    }
