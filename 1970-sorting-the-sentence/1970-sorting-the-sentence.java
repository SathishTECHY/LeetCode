class Solution {
    public String sortSentence(String s) {
        String words[]=s.split(" ");
        String result[]=new String[words.length];

        for(String w:words){
            int len=w.length();

            int pos=w.charAt(len-1)-'0';

            String pure="";
            for(int i=0;i<len-1;i++){
                pure+=w.charAt(i);
            }
            result[pos-1]=pure;

        }
        String finalAns = "";
        for (int i = 0; i < result.length; i++) {
            finalAns += result[i];
            if (i != result.length - 1) finalAns += " ";
        }

        
        return finalAns;
    }
    
}