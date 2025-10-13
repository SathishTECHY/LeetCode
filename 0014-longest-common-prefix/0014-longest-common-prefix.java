class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder st=new StringBuilder();
        Arrays.sort(strs);
        char[] First=strs[0].toCharArray();
        char[] Last=strs[strs.length-1].toCharArray();
        for(int i=0;i<First.length;i++){
            if(First[i]!=Last[i]){
                break;
            }
                st.append(First[i]);
        }
        return st.toString();
    }
}