package DSA.Dynamic_Programming;

import DSA.Strings.inp_str;

public class Knapsack {
    public static int knapsack(int weight[], int values[], int maxWeight) {
        return knapsack(weight, values, maxWeight, 0);
    }

    private static int knapsack(int[] weight, int[] values, int maxWeight, int i) {
        if (i == weight.length || maxWeight == 0) {
            return 0;
        }
        if (weight[i] > maxWeight) {
            return knapsack(weight, values, maxWeight, i + 1);
        } else {
            // include this item 
            int op1 = values[i] + knapsack(weight, values, maxWeight - weight[i], i + 1);
            //dont include
            int op2 = knapsack(weight, values, maxWeight, i + 1);
            return Math.max(op1, op2);
        }
    }

    public static void main(String[] args) {
        int weight[] = {6 , 1, 2, 4, 5};
        int values[] = { 10 , 5 , 4 , 8, 6};
        int maxWeight = 5; 
        System.out.println(knapsack(weight, values, maxWeight));
    }
}
