
class Lv1n4 {
    public int solution(String[] babbling) {
        int result = 0; 
        String[] validWords = {"aya", "ye", "woo", "ma"};  
        
       
        for (String babble : babbling) {
           
            for (String word : validWords) {
               
                if (babble.indexOf(word) > -1) {
                    // 유효한 단어를 빈칸으로 대체
                    babble = babble.replace(word, " ");
                }
            }
         
            if (babble.trim().length() == 0) {
                result++;  
            }
        }
        
        return result;  
    }
}