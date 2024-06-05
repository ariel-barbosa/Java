package aplicacao;

import dispositivos.DeviceCombo;
import dispositivos.ImpressoraDevice;
import dispositivos.ScannerDevice;

public class Program {

	public static void main(String[] args) {

		ImpressoraDevice i = new ImpressoraDevice("1080");
		i.processarDocumento(" My Letter");
		i.print(" My Letter");

		System.out.println();
		ScannerDevice s = new ScannerDevice("2003");
		s.processarDocumento(" My Email");
		System.out.println(" Scan result: " + s.scan());
		
		System.out.println();
		DeviceCombo c = new DeviceCombo("2081");
		c.processarDocumento(" My dissertation");
		c.print(" My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}