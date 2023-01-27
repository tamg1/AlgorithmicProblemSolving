//7:52 PM - 8:40 (code 2, watched 2 times)


/*
// BRUTE FORCE
class Solution {
    public int maxProfit(int[] prices) {
        
        int largestDifference = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > largestDifference){
                
                    largestDifference = prices[j] - prices[i];
                }
            }
        }
        
        return largestDifference;
        
    }
}*/





// OPTIMAL
class Solution {
    public int maxProfit(int[] prices) {
        
        int largestDifference = 0;
        int minSoFar = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++){
            
            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            }
            
            largestDifference = Math.max(prices[i] - minSoFar, largestDifference);   
        }
        
        return largestDifference;
    }
} 