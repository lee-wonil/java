package kakaoTest;

class Solution {
	public int solution(int cacheSize, String[] cities) {
		if(cacheSize == 0)return (cities.length)*5;
		String cache[] = new String[cacheSize];
		int count=0;
		for(int i=0;i<cities.length;i++){
			if(cache[i%cacheSize]==null){// 비어있는 경우 
				cache[i%cacheSize]= cities[i].toLowerCase();// 캐시에삽입
				count+=5;
			}
			else{
				boolean find = false;
				for(int j=0;j<cacheSize;j++){
					if(cache[j].equalsIgnoreCase(cities[i])) {
						find= true;
					}					
				}
				cache[i%cacheSize]= cities[i];
				if(find) {
					count++;
				}
				else {
					count+=5;
				}				
			}
		}		
		return count;
	}
}