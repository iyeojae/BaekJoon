class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        for (int i = 0; i < schedules.length; i++) {
            int limit = add10Minutes(schedules[i]); // 희망시각 + 10분(시간 올림 처리)

            boolean okEmployee = true;

            for (int j = 0; j < 7; j++) {
                int day = (startday + j) % 7; // 0:일, 1:월, ... 6:토 (아래 기준으로 처리)
                if (day == 0 || day == 6) continue; // 주말 제외

                if (timelogs[i][j] > limit) { // limit보다 늦으면 탈락
                    okEmployee = false;
                    break;
                }
            }

            if (okEmployee) answer++;
        }

        return answer;
    }

    private int add10Minutes(int time) {
        int h = time / 100;
        int m = time % 100;

        m += 10;
        if (m >= 60) {
            h += 1;
            m -= 60;
        }
        return h * 100 + m;
    }
}
