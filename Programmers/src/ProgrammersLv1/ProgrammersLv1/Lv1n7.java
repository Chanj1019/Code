package ProgrammersLv1;

import java.util.Arrays;

class Lv1n7 {
    public int[] solution(int[] num_list) {
        
        Arrays.sort(num_list);
        
     
        int size = Math.min(num_list.length, 5); 
        int[] answer = new int[size];
     
        for (int i = 0; i < size; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}
