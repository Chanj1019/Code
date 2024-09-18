package ProgrammersLv1;

//평균 구하기
public class Lv1n3 {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int num:numbers){
            answer += num;
        }
        return answer/numbers.length;
    }    
}
