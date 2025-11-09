class Solution {
    public boolean backspaceCompare(String s, String t) {
        return validate(s).equals(validate(t));
    }

        public String validate(String str){

        StringBuilder result=new StringBuilder();

        for(char c:str.toCharArray()){
            if(c!='#'){
                result.append(c);
            }else if(result.length()>0){
                result.deleteCharAt(result.length()-1);
            }
        }

        return result.toString();
        }


}
