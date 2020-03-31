class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p2 = 0;
        while(p2 < nums2.length){
            nums1[m] = nums2[p2];
            p2 += 1;
            m += 1;
        }
        Arrays.sort(nums1);
    }
}
