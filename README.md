# Permutations
## https://leetcode.com/problems/permutations

Given a collection of **distinct** integers, return all possible permutations.
```
Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
```

# Implementation :

```java
class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    permute(result, new ArrayList<Integer>(), nums);
    return result;
  }

  private void permute(List<List<Integer>> result, List<Integer> permutation, int[] nums) {
      if(nums.length == 0){
        result.add(permutation);
        return;
      }
      for(int i=0; i < nums.length; i++){
    	 List<Integer> runningPermutation = new ArrayList<Integer>(permutation);
    	 runningPermutation.add(nums[i]);
         permute(result, runningPermutation, subArray(nums, i));
      }
  }
    
  private int[] subArray(int[] input, int skipIndex) {
      int subArraySize = input.length - 1;
      int[] subArray = new int[subArraySize];
      int index = 0;
      for(int i = 0; i < input.length; i++){
          if(i != skipIndex)
               subArray[index++] = input[i];
      }
      return subArray;
  }  

    
}
```
