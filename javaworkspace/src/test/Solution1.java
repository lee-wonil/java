package test;
// īī�� �ڵ� �׽�Ʈ ���� 1. �ؽ� > �������� ���� ����
import java.util.*;
class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList <String> array = new ArrayList<String>();     //arraylist�� �����ڸ� �켱 �����Ѵ�.
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