package ArraysAndStrings;

import java.util.ArrayList;

public class GetAllPossiblePlans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> result = getAllPossiblePlans(2);
		System.out.println(result);
	}
	
	public static ArrayList<ArrayList<Integer>> getAllPossiblePlans(int total) {
		ArrayList<Integer> validPath = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		dfs(total, validPath, result);
		return result;
	}
	
	private static void dfs(int total, ArrayList<Integer> validPath, ArrayList<ArrayList<Integer>> result) {
		if (total < 0) {
			return;
		}
		if (total == 0) {
			result.add(new ArrayList<Integer>(validPath));
		}
		for (int i = 1; i < 3; i++) {
			validPath.add(i);
			dfs(total - i, validPath, result);
			validPath.remove(validPath.size() - 1);
		}
	}


}
