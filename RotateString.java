class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()){
            return false;
        }
        String combined = s+s;
        return combined.contains(goal);        
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.rotateString("abcde","cdeab"));
        System.out.println(solution.rotateString("abcde","abced"));
    }
}
