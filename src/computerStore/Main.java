package computerStore;

public class Main {

	public static void main(String[] args) {
		GraphicCard gk1 = new GraphicCard();
		gk1.name = "Nvidia rtx 3060";
		gk1.memory = 16;
		gk1.bit = 256;
		gk1.hdmi = false;
		gk1.vga = true;
		gk1.brand = "Lares";
		GraphicCard gk2 = new GraphicCard();
		gk2.name = "GeForce gtx 1050";
		gk2.memory = 32;
		gk2.bit = 384;
		gk2.hdmi = true;
		gk2.vga = false;
		gk2.brand = "Burakonaldo";
		System.out.print(gk1.name);
		System.out.println(" " + gk1.memory + "GB " + gk1.bit + "bit" + (gk1.hdmi ? "HDMI" : "")
				+ (gk1.vga ? "VGA" : "") + "Marka:Nvidia");
		System.out.println(gk2.name);
		System.out.println(" " + gk2.memory + "GB " + gk2.bit + "bit" + (gk2.hdmi ? "HDMI" : "")
				+ (gk1.vga ? "VGA" : "") + "Marka:GeForce");

		Processor islemci = new Processor();
		islemci.name = "intel Core i9";
		islemci.numberOfCourse = 4;
		islemci.ghz = 3.5;
		islemci.cacheSocket = "LGA1200";

		System.out.println(islemci.name + islemci.numberOfCourse + islemci.ghz + islemci.cacheSocket);
	}

}
