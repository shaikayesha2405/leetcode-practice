import java.util.*;
public class leetcode39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }
    public void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result)
    {
        if (target == 0){
            result.add(new ArrayList<>(current));
            return;
        }   
        for (int i = start; i < candidates.length; i++){
            if (target - candidates[i] <0)
            {
                continue;
            }
            current.add(candidates[i]);
            backtrack(candidates, target - candidates[i], i, current, result); 
            current.remove(current.size() - 1);
        }
    }
}