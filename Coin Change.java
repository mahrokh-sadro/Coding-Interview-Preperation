// You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.

// Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

// You may assume that you have an infinite number of each kind of coin.


class Solution {
    public int coinChange(int[] coins, int amount) {
        return coinChange(coins, amount, new HashMap<Integer,Integer>());
    }

    private int coinChange(int[] coins, int amount, Map<Integer,Integer>map){
        if(amount<-1){
            return -1;
        }

        if(amount==0){
            return 0;
        }

        if(map.containsKey(amount)){
            return map.get(amount);
        }

        int min=-1;
        for(int i=0;i<coins.length;i++){
            int subAmount=amount-coins[i];
            int subCoin=coinChange(coins, subAmount, map);

            if(subCoin!=-1){
                int total=subCoin+1;
                if(min==-1 || min>total){
                    min=total;
                }
            }
        }

        map.put(amount,min);
        return min;
    }
}