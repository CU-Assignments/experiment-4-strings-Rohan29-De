class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }
        int hayStackLength = haystack.length();
        int needleLength  =  needle.length();
               for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j;
            for (j=0; j<needleLength; j++){
                if(haystack.charAt(i+j) !=needle.charAt(j)){
                    break;
                }
            }
            if(j==needlength){
                return i;
            }
        }
        return -1;
    }
}
