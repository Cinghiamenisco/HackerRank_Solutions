    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        if (head.next == null) {
            System.out.println(head.data);
            return;
        }
        reversePrint(head.next);
        System.out.println(head.data);
        return;
    }
