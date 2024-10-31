package ProgrammersLv2;

import java.util.LinkedList;
import java.util.Queue;

public class L2n5 {
    
    public int solution(int[] priorities, int location) {
        // 큐를 사용하여 프로세스를 저장
        Queue<int[]> queue = new LinkedList<>();
        
        // 프로세스를 큐에 저장 (우선순위, 원래 인덱스)
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
        }
        
        int answer = 0; // 실행된 프로세스의 수
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // 현재 프로세스 꺼냄
            
            // 나머지 프로세스 중 더 높은 우선순위가 있는지 확인
            boolean hasHigherPriority = false;
            for (int[] process : queue) {
                if (current[0] < process[0]) {
                    hasHigherPriority = true; // 더 높은 우선순위가 존재
                    break;
                }
            }
            
            if (hasHigherPriority) {
                // 더 높은 우선순위가 있다면 다시 큐의 끝으로 넣음
                queue.add(current);
            } else {
                // 현재 프로세스를 실행
                answer++;
                // 만약 현재 프로세스가 찾고자 하는 프로세스라면
                if (current[1] == location) {
                    return answer; // 몇 번째로 실행되었는지 반환
                }
            }
        }
        
        return answer; // 기본적으로 실행된 프로세스 수를 반환
    }
}
