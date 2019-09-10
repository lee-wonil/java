package java0902;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
		final int [] timeUnit = {86400,3600,60,1};
		String [] timeNameUnit = {"일","시간","분","초"};
		Calendar chritsmas = Calendar.getInstance();
		chritsmas.set(2019, 11, 24);
		Calendar today = Calendar.getInstance();
		
		long diffence = (chritsmas.getTimeInMillis()-today.getTimeInMillis())/1000;
		long day = diffence / 86400;
		System.out.println("D-day : "+(day+1));
		String txt = "";
		for(int i=0;i<timeUnit.length;i++) {
			txt+=(diffence/timeUnit[i])+timeNameUnit[i];
			diffence %= timeUnit[i];
		}
		System.out.println(txt);
	}
}
