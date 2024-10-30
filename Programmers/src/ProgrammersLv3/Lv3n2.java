package ProgrammersLv3;

import java.util.LinkedList;
import java.util.Queue;

public class Lv3n2 {
    String word;
    int count;

    public Lv3n2(String word, int count) {
        this.word = word;
        this.count = count;
    }

}

class Solution {

    public int solution(String begin, String target, String[] words) {
        Queue<Lv3n2> queue = new LinkedList<>();
        queue.offer(new Lv3n2(begin, 0));
        boolean[] visited = new boolean[words.length];

        while (!queue.isEmpty()){
            Lv3n2 data = queue.poll();
            if (data.word.equals(target)) {
                return data.count;
            }

            for (int i = 0; i < words.length; i++){
                if (!visited[i] && check(data.word, words[i])){
                    queue.offer(new Lv3n2(words[i], data.count + 1));
                    visited[i] = true;
                }
            }      
        }

        return 0;
    }


    private boolean check(String first, String second){
        int cnt = 0;

        for (int i = 0; i < first.length(); i++){
            if (first.charAt(i) != second.charAt(i)) cnt++;
        }

        return cnt == 1 ? true : false;
    }

}