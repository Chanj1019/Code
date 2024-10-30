package stacknqueue;
import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        // 스택을 사용하여 연속된 숫자를 제거
        Stack<Integer> stack = new Stack<>();

        // 배열을 순회 만약 {1,1,2,2,3,3,4,4} 
        for (int num : arr) {
            // 스택이 비어있거나 스택의 가장 위 요소와 현재 숫자가 다를 경우
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num); // 스택에 추가
            }
        }

        // 스택에서 결과 배열로 변환
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i); // 스택의 요소를 배열에 복사
        }

        return answer; // 결과 반환
    }
}
