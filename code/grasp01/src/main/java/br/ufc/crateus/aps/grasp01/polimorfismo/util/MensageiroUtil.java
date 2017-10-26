package br.ufc.crateus.aps.grasp01.polimorfismo.util;

public class MensageiroUtil {

	public static void enviarEmail(String mensagem, String destino) {
		System.out.println("Email '" + mensagem + "' enviada para '" + destino + "'");
	};
	
	public static void enviarSMA(String mensagem, String destino) {
		System.out.println("SMS '" + mensagem + "' enviado para '" + destino + "'");
	};
}
