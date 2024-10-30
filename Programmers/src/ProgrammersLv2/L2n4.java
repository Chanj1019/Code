package ProgrammersLv2;

import java.util.ArrayList;
import java.util.List;

public class L2n4 {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        int[] days = new int[n];
        
        // 각 기능의 남은 일수 계산
        for (int i = 0; i < n; i++) {
            days[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i]; // 올림 처리
        }
        
        List<Integer> answer = new ArrayList<>();
        int currentMax = days[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (days[i] <= currentMax) {
                count++;
            } else {
                answer.add(count);
                currentMax = days[i];
                count = 1;
            }
        }
        
        answer.add(count); // 마지막 그룹 추가

        // List를 int[]로 변환
        return answer.stream().mapToInt(i -> i).toArray();
    }

}