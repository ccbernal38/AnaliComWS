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
		if (!imgBase64.isEmpty()) {
			byte[] dataBytes = Base64.getEncoder().encode(imgBase64.getBytes());
			dataBytes = Base64.getDecoder().decode(dataBytes);
			return dataBytes;
		} else {
			byte[] imageByte = new byte[0];
			return imageByte;
		}

	}
}
