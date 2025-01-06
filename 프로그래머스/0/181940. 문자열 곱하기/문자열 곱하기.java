class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int i = 0;
        if(1 <= my_string.length() && my_string.length() <= 100) {
            if(1 <= k && k <= 100){
                for(i = 0; i < k; i++) {
                    answer += my_string;
                }
            }
        }
        return answer;
    }
}