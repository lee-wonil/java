package test;
import java.util.*;
//���α׷��ӽ� �ؽ� > ���� ��

class Solution3 {
    public int solution(String[][] clothes) {
        HashMap<String,Integer> map = new HashMap<>();
        String Alltype[]=new String[clothes.length];        
        int count=0;
        for(int i=0;i<clothes.length;i++) {
        	String type = clothes[i][1];
        	if(map.getOrDefault(type, 0)==0) {
        		Alltype[count++]=type;
        	}
        	map.put(type, map.getOrDefault(type, 0)+1);        	
        }
        
    	int answer=1;
    	if(count ==1) 
    		return map.get(Alltype[0]);
        for(int i = 0;i<count;i++) {
        	int a = map.get(Alltype[i]);
        	answer = answer*(a+1);
        }
        return answer-1;
    }
}