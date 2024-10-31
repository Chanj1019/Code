package ProgrammersLv2;

import java.util.LinkedList;
import java.util.Queue;

class L2n6 {
    public int[] solution(int[] prices) {
        Queue<int[]> q = new LinkedList<>();
        int n = prices.length;
        int[] answer = new int[n];

        // 큐에 가격 추가
        for (int i = 0; i < n; i++) {
            q.add(new int[]{prices[i]});
        }

        // 가격 유지 시간 계산
        for (int i = 0; i < n; i++) {
            int currentPrice = prices[i];
            int time = 0;

            // 현재 가격 이후의 가격을 비교
            for (int j = i + 1; j < n; j++) {
                time++;
                if (prices[j] < currentPrice) {
                    break; // 가격이 떨어지면 종료
                }
            }
            answer[i] = time; // 각 가격에 대한 지속 시간 저장
        }

        return answer;
    }
}
