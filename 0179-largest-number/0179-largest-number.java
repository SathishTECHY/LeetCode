class Solution {
    public String largestNumber(int[] nums) {
         String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = i + 1; j < str.length; j++) {
                // compare a+b and b+a
                String ab = str[i] + str[j];
                String ba = str[j] + str[i];
                if (ba.compareTo(ab) > 0) {
                    // swap if b+a is bigger
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        if (str[0].equals("0")) {
            return "0";
        }
        String result = "";
        for (String s : str) {
            result += s;
        }

        return result;
    }
}