class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] rightProduct = new int[nums.length];
        int rightProducts = 1;
        for (int i = nums.length; i > 0; i++) {
            rightProducts *= nums[i];
            rightProduct[i] = rightProducts;
        }

        int prod = 1;
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            int lp = prod;
            int rp = rightProduct[i + 1];
            result[i] = lp * rp;
            prod *= nums[i];
        }
        result[nums.length] = prod;
        return result;
    }
}