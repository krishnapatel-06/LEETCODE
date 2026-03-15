//19
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int totalElement = 0;
        struct ListNode *current = head;

        while(current != NULL){
            totalElement++;
            current = current->next;
        }
        if(totalElement == n){
            return head->next;
        }
        int post = totalElement - n;
        int i=1;
        current = head;
        while(i < post){
            current = current->next;
            i++;
        }
        if(current->next != NULL)
        current->next = current->next->next;
        return head;
        
    }
};