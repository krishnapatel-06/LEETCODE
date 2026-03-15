#include <stdlib.h>

// Comparator function for qsort
// 217
int cmp(const void* a, const void* b) {
    int x = *(int*)a;
    int y = *(int*)b;
    if (x < y) return -1;
    else if (x > y) return 1;
    else return 0;
}

bool containsDuplicate(int* nums, int numsSize) {
    if (numsSize <= 1) return false;

    // Sort the array
    qsort(nums, numsSize, sizeof(int), cmp);

    // Check adjacent elements for duplicates
    for (int i = 1; i < numsSize; i++) {
        if (nums[i] == nums[i - 1]) {
            return true;
        }
    }

    return false;
}