import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<Integer> valid = new ArrayList<>();

        // Step 1: validation
        for (int i = 0; i < code.length; i++) {

            if (!isActive[i]) continue;
            if (code[i].length() == 0) continue;

            // code: letters, digits, underscore
            boolean validCode = true;
            for (char ch : code[i].toCharArray()) {
                if (!(Character.isLetterOrDigit(ch) || ch == '_')) {
                    validCode = false;
                    break;
                }
            }
            if (!validCode) continue;

            // allowed business lines only
            String bl = businessLine[i];
            if (!(bl.equals("grocery") ||
                  bl.equals("electronics") ||
                  bl.equals("pharmacy") ||
                  bl.equals("restaurant"))) {
                continue;
            }

            valid.add(i);
        }

        // Step 2: sort by businessLine, then by code
        Collections.sort(valid, (a, b) -> {
            int cmp = businessLine[a].compareTo(businessLine[b]);
            if (cmp != 0) return cmp;
            return code[a].compareTo(code[b]);
        });

        // Step 3: build result
        List<String> result = new ArrayList<>();
        for (int idx : valid) {
            result.add(code[idx]);
        }

        return result;
    }
}
