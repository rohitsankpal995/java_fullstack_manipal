package CodingQue;


public class LongestSubstring {

    private String inputString;

    public LongestSubstring(String inputString) {
        this.inputString = inputString;
    }
    public String getLongestSubstring() {
        int n = inputString.length();

        int start = 0, end = 0, maxLen = 0;
        String str ="";
        int[] freq = new int[26]; // assuming ASCII characters

            while (end < n) {
                char c = inputString.charAt(end);
                freq[c]++;


                while (freq[c] > 1) { // move the start pointer until we have unique characters
                    char d = inputString.charAt(start);
                    freq[d]--;
                    start++;
                }

                int len = end - start + 1;
                if (len > maxLen) {
                    maxLen = len;
                    str=inputString.substring(start, start + maxLen);
                }

                end++;
            }
        return str;
    }

}
