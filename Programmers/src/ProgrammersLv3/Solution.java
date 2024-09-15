//프로그래머스 금과은 운반하기
package ProgrammersLv3;

import java.util.Scanner;

public class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long start = 0; // 최솟값
        long end = (long) (10e9 * 2 * 10e5 * 2);
        long answer = (long) (10e9 * 2 * 10e5 * 2);
        int city = g.length; // 도시 개수

        while (start <= end) {
            long mid = (start + end) / 2; // 중간값 계산
            int gold = 0; // 금 변수 초기화
            int silver = 0; // 은 변수 초기화
            int mount = 0; // 운반된 양
            for (int i = 0; i < city; i++) {
                int totalGold = g[i]; // 현재 도시의 금
                int totalSilver = s[i]; // 현재 도시의 은
                int weight = w[i]; // 현재 도시의 화물 무게
                long time = t[i]; // 현재 도시의 시간

                long count = mid / (time * 2); // 이동 횟수 계산
                if (mid % (time * 2) >= time) {
                    count++; // 남은 시간이 이동 시간 이상이면 한 번 더 이동
                }
                
                // 각 도시에서 최대 수송량을 계산
                gold += Math.min(totalGold, count * weight);
                silver += Math.min(totalSilver, count * weight);
                mount += Math.min(totalGold + totalSilver, count * weight);
            }
            
            // 조건 확인: 금, 은, 총 수송량
            if (gold >= a && silver >= b && mount >= (a + b)) {
                answer = Math.min(mid, answer); // 최소값 업데이트
                end = mid - 1; // 조건을 만족하면 감소
            } else {
                start = mid + 1; // 조건을 만족하지 않으면 증가
            }
        }
        
        return answer; // 결과 반환
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        scanner.nextLine(); // 다음 줄로 이동

        System.out.print("g (공백으로 구분): ");
        int[] g = readArray(scanner);
        System.out.print("s (공백으로 구분): ");
        int[] s = readArray(scanner);
        System.out.print("w (공백으로 구분): ");
        int[] w = readArray(scanner);
        System.out.print("t (공백으로 구분): ");
        int[] t = readArray(scanner);
        
        // Solution 객체 생성 및 결과 계산
        Solution solution = new Solution();
        long result = solution.solution(a, b, g, s, w, t);
        
        // 결과 출력
        System.out.println("결과: " + result);
        
        scanner.close();
    }

    private static int[] readArray(Scanner scanner) {
        String line = scanner.nextLine();
        if (line.trim().isEmpty()) {
            return new int[0]; // 빈 배열 반환
        }
        String[] parts = line.split(" ");
        int[] array = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        return array;
    }
}
