
/*
Questa soluzione è stata trovata qui:
https://stackoverflow.com/questions/1594061/check-if-two-linked-lists-merge-if-so-where/14956113#14956113

Non ho resistito ad usarla, perché era tremendamente bella.

Sul motivo per cui questo algoritmo funzioni, sono tutt'ora indeciso.
*/



static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
SinglyLinkedListNode currentA = head1;
SinglyLinkedListNode currentB = head2;

//Do till the two nodes are the same
while(currentA != currentB){
    //If you reached the end of one list start at the beginning of the other one
    //currentA
    if(currentA.next == null){
        currentA = head2;
    }else{
        currentA = currentA.next;
    }
    //currentB
    if(currentB.next == null){
        currentB = head1;
    }else{
        currentB = currentB.next;
    }
}
return currentB.data;

}
