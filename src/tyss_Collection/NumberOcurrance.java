package tyss_Collection;

public class NumberOcurrance {

	public static void main(String[] args) {
		String str = "MOMmmmmmmmmmmmmmm";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if ((ch[i]+"").equalsIgnoreCase("m")) {
				count++;
			}
		}
		System.out.println("No. of Occ. of M: "+count);
	}
}