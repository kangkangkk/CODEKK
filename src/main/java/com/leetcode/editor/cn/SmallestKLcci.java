package com.leetcode.editor.cn;

//设计一个算法，找出数组中最小的k个数。以任意顺序返回这k个数均可。 
//
// 示例： 
//
// 输入： arr = [1,3,5,7,2,4,6,8], k = 4
//输出： [1,2,3,4]
// 
//
// 提示： 
//
// 
// 0 <= len(arr) <= 100000 
// 0 <= k <= min(100000, len(arr)) 
// 
// Related Topics 数组 分治 快速选择 排序 堆（优先队列） 👍 128 👎 0

public class SmallestKLcci{
    public static void main(String[] args) {
        Solution solution = new SmallestKLcci().new Solution();
        
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] smallestK(int[] arr, int k) {
        return null;
    }
    public void quickSort(int [] arr,int k){
        int temp=arr[k];
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[j]>temp){

            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}