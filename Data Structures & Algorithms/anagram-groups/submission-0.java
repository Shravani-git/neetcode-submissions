class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> h = new HashMap<>();
        for(String i:strs){
            char[] c = i.toCharArray();
            Arrays.sort(c);
            String sorted =new String(c);
            if(!h.containsKey(sorted)){
                h.put(sorted,new ArrayList<>());
            }
            h.get(sorted).add(i);
        }
        return new ArrayList<>(h.values());
    }
}
