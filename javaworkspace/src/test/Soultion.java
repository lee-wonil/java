package test;
class Solution
{
	public int solution(String s)
	{
		int answer = 0;
		int firstIdx=0;
		boolean b =false;
		String k;
		for(int i=0;i<s.length();i++){
			if(i%2!=0){
				String b1= s.substring(firstIdx,i/2-1);
				String b2 = s.substring(i/2+1,i);
				System.out.print(b1+" "+b2);
			}
			else{
				k=s.substring(firstIdx,i);
			}
		}


		return answer;
	}
}