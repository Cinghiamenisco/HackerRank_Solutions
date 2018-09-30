// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        //Se il nodo è null, lo creo e lo assegno
        if (head == null) {
            head = new SinglyLinkedListNode(data);
            System.out.println("Creato primo nodo: ");
            return head;
        }
        
        if (head.next == null) {
            head.next = new SinglyLinkedListNode(data);
            return head;
        }
        
        insertNodeAtTail(head.next, data);
        return head;
    }
