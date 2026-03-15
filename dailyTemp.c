//739

int* dailyTemperatures(int* temp, int tempSize, int* returnSize) {
    *returnSize = tempSize;

    int * stack = (int*) malloc(tempSize * sizeof(int));
    int top = -1;

    int *result = (int*) malloc(tempSize * sizeof(int));
    for(int i = tempSize -1;i>=0;i--){
        while(top>=0&& temp[i]>=temp[stack[top]]){
        top--;    
        }
        result[i] = top == -1 ? 0 : stack[top] -i;
        top++;
        stack[top] = i;
    }
    return result;
}