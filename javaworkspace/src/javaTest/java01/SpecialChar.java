package javaTest.java01;
class  SpecialChar{
	public static void main(String[] args) {
		String aa = "Ȭ����ǥ (\') ǥ���� = \\\' ";
		String bb = "�����ǥ (\") ǥ���� = \\\"";
		String cc = "�������� (\\) ǥ���� = \\";
		String dd = "tab (\t) ǥ���� = \\t";
		String ee = "backspace ((\b) ǥ���� = \\b";
		String ff = "�ٹٲ�\nǥ���� = \\n";
		String gg = "carriage return (\r) ǥ���� = \\r";

		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
		System.out.println(ff);
		System.out.println(gg);
	}
}
