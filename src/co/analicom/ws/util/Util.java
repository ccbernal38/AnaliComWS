/**
 * 
 */
package co.analicom.ws.util;

import java.util.Base64;

/**
 * @author Cristian Cruz
 */
public class Util {
	
	public static byte[] convertirABytes(String imgBase64) {
		
		byte[] imageByte = Base64.getDecoder().decode(imgBase64);		
		return imageByte;
	}
}
