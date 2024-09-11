package ProgrammersLv3;
//어느 왕국에 하나 이상의 도시들이 있습니다. 왕국의 왕은 새 도시를 짓기로 결정하였습니다. 해당 도시를 짓기 위해서는 도시를 짓는 장소에 금 a kg과 은 b kg이 전달되어야 합니다.
// 각 도시에는 번호가 매겨져 있는데, i번 도시에는 금 g[i] kg, 은 s[i] kg, 그리고 트럭 한 대가 있습니다. i번 도시의 트럭은 오직 새 도시를 짓는 건설 장소와 i번 도시만을 왕복할
// 수 있으며, 편도로 이동하는 데 t[i] 시간이 걸리고, 최대 w[i] kg 광물을 운반할 수 있습니다. (광물은 금과 은입니다. 즉, 금과 은을 동시에 운반할 수 있습니다.) 모든 트럭은 같은 도로를 여러 번 왕복할 수 있으며 연료는 무한대라고 가정합니다.
// 정수 a, b와 정수 배열 g, s, w, t가 매개변수로 주어집니다. 주어진 정보를 바탕으로 각 도시의 트럭을 최적으로 운행했을 때, 새로운 도시를 건설하기 위해 금 a kg과 은 b kg을 전달할 수 있는 가장 빠른 시간을 구해 return 하도록 solution 함수를 완성해주세요.

// 제한사항
// 0 ≤ a, b ≤ 10^9
// 1 ≤ g의 길이 = s의 길이 = w의 길이 = t의 길이 = 도시 개수 ≤ 105
// 0 ≤ g[i], s[i] ≤ 109
// 1 ≤ w[i] ≤ 10^2
// 1 ≤ t[i] ≤ 10^5
// a ≤ g의 모든 수의 합
// b ≤ s의 모든 수의 합

//시간을 return
//풀이 방법 이진 탐색 풀이 min과 max 정하기 min = 1초 max = (금의 양 + 은의 양 )/ 한번에 옮길 수 있는 양 X time 
//(최악의 조건) 금 10^9 , 은 10^9 , 한번에 옮길 수 있는 양 = 1 ,time 왕복 2  

// public class Solution {
//     public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
//         long answer = -1;
//         int start = 0;
//         long end = (long)(10^9*2 * 10^5*2);
//         int city = g.length;

//         while(start <= end){
//             int s = 0;
//             int g = 0;
//             int move = 0;
//             long mid = (start+end)/2;
//             if(int i = 0;i <city;i++;){


//             }
//         }




//         return answer;
//     }
// }

public class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long answer = -1;
        long start = 0;
        long end = (long)(Math.pow(10, 9) * 2 * Math.pow(10, 5) * 2);
        int city = g.length;

        while (start <= end) {
            long mid = (start + end) / 2; 
            int totalGold = 0; 
            int totalSilver = 0; 
            int move = 0;

            for (int i = 0; i < city; i++) { 
                int 

                
            }

          
        }

        return answer;
    }
}