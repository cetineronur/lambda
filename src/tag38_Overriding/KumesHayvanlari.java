package tag38_Overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
		KumesHayvanlari kms1 = new KumesHayvanlari();
		
		kms1.beslenme();
		kms1.hareket();
		kms1.solunum();
		Kuslar kms2 = new KumesHayvanlari();
		
		kms2.beslenme(); 
		kms2.hareket();
		kms2.solunum();
		
		Kuslar kms3 = new Kuslar();
		kms3.beslenme(); 
		kms3.hareket();
		kms3.solunum();
		

	}
	public void hareket() {
		System.out.println("Kumes hayvanlari yuruyerek hareket eder");
	}


	

}
