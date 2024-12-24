import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution obj = new Solution();
        obj.generate(n);

        System.out.println(Arrays.toString(new List[]{obj.generate(n)}));

    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if(numRows == 0) return result;

        List<Integer>firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1) return result;

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i-1);

            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 0; j < i-1; j++) {
                row.add(prevRow.get(j)+ prevRow.get(j+1));
            }
            row.add(1);

            result.add(row);
        }
        return result;


    }
}