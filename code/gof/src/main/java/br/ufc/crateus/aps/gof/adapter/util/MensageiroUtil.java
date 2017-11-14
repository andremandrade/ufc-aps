package br.ufc.crateus.aps.gof.adapter.util;

public class MensageiroUtil {

	public static void enviarEmail(String mensagem, String destino) {
		System.out.println("Email '" + mensagem + "' enviada para '" + destino + "'");
	};
	
	public static void enviarSMS(String mensagem, String destino) {
		System.out.println("SMS '" + mensagem + "' enviado para '" + destino + "'");
	};
}
