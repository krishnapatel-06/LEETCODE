//496
int* nextGreaterElement(int* nums1, int nums1Size, int* nums2, int nums2Size, int* returnSize) {
    *returnSize = nums1Size;
    int *storeNGE = (int*) malloc(nums2Size * sizeof(int)); 

    for(int i = 0; i< nums2Size; i++) {
        storeNGE[i]=-1;
    }

    for(int i = 0; i < nums2Size; i++) {
        for(int j = i+1; j < nums2Size; j++) {
            if(nums2[j] > nums2[i]) {
                storeNGE[i] = nums2[j];
                break;
            }
        }
    }

    for(int i = 0; i < nums2Size; i++) {
        printf("%d ", storeNGE[i]);
    }
    int *result = (int*) malloc(nums1Size * sizeof(int));

    for(int i = 0; i < nums1Size; i++) {
        for(int j = 0; j < nums2Size; j++) {
            if(nums1[i] == nums2[j]) {
                result[i] = storeNGE[j];
                break;
            }
        }
    }

    printf("\n");
    for(int i = 0; i < nums1Size; i++) {
        printf("%d ", result[i]);
    }

    return result;
}
