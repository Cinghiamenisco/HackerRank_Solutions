// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco


// Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        if(llist == null) {
            llist = new SinglyLinkedListNode(data);
            return llist;
        }
        
        SinglyLinkedListNode newHead = new SinglyLinkedListNode(data);
        newHead.next = llist;
        
        return newHead;
        

    }
