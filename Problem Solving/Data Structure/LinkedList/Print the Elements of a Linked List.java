    static void printLinkedList(SinglyLinkedListNode head) {
        
        System.out.println(head.data);
        if (head.next != null) {
            printLinkedList(head.next);   
        }
        return;
    }
