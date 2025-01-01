class Solution {
    private int changeSecond(String time){
        String[] split = time.split(":");
        return ((Integer.parseInt(split[0])) * 60) + Integer.parseInt(split[1]);
    }
  
    private String reString(int sec) {
        String reStr = "";
        int mm = sec / 60;
        int ss = sec % 60;
        if(mm < 10 && ss < 10){
            return reStr = "0" + mm + ":" + "0" + ss;
        }else if(mm > 10 && ss < 10){
            return reStr = mm + ":" + "0" + ss;
        }else if(mm < 10 && ss > 10){
            return reStr = "0" + mm + ":" + ss;
        }else{
            return reStr = mm + ":" + ss;
        }
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int video_sec = changeSecond(video_len);
        int pos_sec = changeSecond(pos);
        int opstart_sec = changeSecond(op_start);
        int opend_sec = changeSecond(op_end);
        
        if (pos_sec >= opstart_sec && pos_sec <= opend_sec) pos_sec = opend_sec; // 시작 값 오프닝 구간 확인

        for (String command : commands) {
            if (command.equals("next")) pos_sec = pos_sec + 10 >= video_sec ? video_sec : pos_sec + 10;
            else pos_sec = pos_sec - 10 > 0 ? pos_sec - 10 : 0;

            if (pos_sec >= opstart_sec && pos_sec <= opend_sec) pos_sec = opend_sec; // 오프닝 구간 확인
            
            answer = reString(pos_sec);
        }
        return answer;
    }
}