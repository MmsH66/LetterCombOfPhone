class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String[]> map = new HashMap<>();
        map.put ('2', new String[]{"a", "b", "c"});
        map.put ('3', new String[]{"d", "e", "f"});
        map.put ('4', new String[]{"g", "h", "i"});
        map.put ('5', new String[]{"j", "k", "l"});
        map.put ('6', new String[]{"m", "n", "o"});
        map.put ('7', new String[]{"p", "q", "r", "s"});
        map.put ('8', new String[]{"t", "u", "v"});
        map.put ('9', new String[]{"w", "x", "y", "z"});

        int length = digits.length();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            String[] temp = map.get(digits.charAt(i));
            List<String> listTemp = new ArrayList<>();
            if (i == 0) {
                for (String s : temp) {
                    result.add(s);
                }
            } else {
                for (int j = 0; j < result.size(); j++) {
                    for (String s : temp) {
                        listTemp.add(result.get(j) + s);
                    }
                }
                result = listTemp;
            }
        }

        return result;
    }
}
