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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        
        if (data < head.data) {
            DoublyLinkedListNode nodone = new DoublyLinkedListNode(data);
            
            nodone.next = head;
            nodone.prev = head.prev;
            
            head.prev = nodone;
            return nodone;
        } 
        
        if (head.next == null) {
            
            DoublyLinkedListNode nodone = new DoublyLinkedListNode(data);
            
            head.next = nodone;
            nodone.prev = head;
            
            nodone.next = null;
            
            return head;
        }
        
        head.next = sortedInsert(head.next, data);
        return head;
    }
