package test;
// 카카오 코딩 테스트 연습 1. 해쉬 > 완주하지 못한 선수
import java.util.*;
class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList <String> array = new ArrayList<String>();     //arraylist에 참가자를 우선 저장한다.
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0;i<participant.length;i++){
        	if(i==participant.length-1) {
        		return participant[i];
        	}
        	if(!participant[i].equals(completion[i])) {
            	return answer=participant[i];
        	}
        }
        return answer;
        /*
        for(int i=0;i<participant.length;i++){
            array.add(participant[i]);      
        }
         for(int i=0;i<completion.length;i++){
             array.remove(completion[i]);
        }
        answer = array.get(0);
        */
       
    }
}