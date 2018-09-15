// Autore:      Christian Luzzetti
// Mail:        Christian.luzzetti@gmail.com
// HackerRank:  https://www.hackerrank.com/Cinghiamenisco

// Floyd’s Cycle detection algorithm

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {

        SinglyLinkedListNode slow;
        SinglyLinkedListNode fast;
        
        slow = head;
        fast = head;
        
        while(fast.next != null && fast.next.next != null) {
            
            slow=slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
