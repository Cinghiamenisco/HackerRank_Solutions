// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

    static void printLinkedList(SinglyLinkedListNode head) {
        
        System.out.println(head.data);
        if (head.next != null) {
            printLinkedList(head.next);   
        }
        return;
    }
