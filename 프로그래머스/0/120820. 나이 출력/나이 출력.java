class Solution {
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
}
/*
class Solution {
    public int solution(int age) {
        int answer = 0;
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        answer = year - age + 1;
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Solution p = new Solution();
        System.out.println("현재 나이를 입력하시오 : ");
        int age = a.nextInt();
        int birth_year = p.solution(age);
        System.out.println("태어난 년도는 : " + birth_year);
    }
}
*/
//현재 년도(시스템 값) + 자기 태어난 년도 출력 프로그램도 제작해보았습니다.
