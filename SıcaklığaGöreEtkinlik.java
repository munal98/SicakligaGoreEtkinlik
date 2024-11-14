import java.util.Scanner;

public class SıcaklığaGöreEtkinlik {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Derece : ");
		int sicaklik = sc.nextInt();
		String event = "";
		
		if (sicaklik < 5) {
			event = "Kayak";
		} else if (sicaklik < 15) {
			event = "Tiyatro";
		}else if (sicaklik < 25) {
			event = "Mangal";
		}else {
			event = "Yüzme";
		}
		
		System.out.println("Önerilen Etkinlik : " + event);
	}

}
