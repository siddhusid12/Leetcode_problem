// Last updated: 9/3/2025, 10:07:52 AM
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
       Map<String, Integer> mp = new HashMap<>();
        
        // Convert paragraph to lowercase and replace all non-alphabetic characters with spaces
        String str = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        
        // Split the cleaned string into words
        String[] words = str.split(" ");
        
        // Count the occurrence of each word
        for (String word : words) {
            if (word.length() > 0) {
                mp.put(word, mp.getOrDefault(word, 0) + 1);
            }
        }
        
        // Remove all banned words from the map
        for (String ban : banned) {
            if (mp.containsKey(ban)) {
                mp.remove(ban);
            }
        }
        
        // Find the word with the highest count
        String ans = "";
        int max = 0;
        for (String word : mp.keySet()) {
            int count = mp.get(word);
            if (count > max) {
                max = count;
                ans = word;  // Assign the word directly to ans
            }
        }
        
        return ans;
    }
}