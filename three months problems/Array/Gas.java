import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] gas = new int[n];

        int m = sc.nextInt();
        int [] cost = new int[m];


        for (int i = 0; i < n; i++) {
            gas[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            cost[i] = sc.nextInt();
        }

        Solution ob = new Solution();
       int result = ob.canCompleteCircuit(gas,cost);
        System.out.println(result);

    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int n = gas.length;
        int totalGas = 0;
        int totalCost= 0;
        int startIndex = 0;
        int currentGas = 0;

        for (int i = 0; i < n; i++) {

            totalGas  += gas[i];
            totalCost += cost[i];

            currentGas += gas[i]-cost[i];

            if(currentGas < 0){
                startIndex=i+1;
                currentGas = 0;
            }
        }
        if(totalGas<totalCost) return -1;

        return startIndex;


    }
}