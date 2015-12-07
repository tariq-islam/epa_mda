import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class CompanyEncoder {
	private static String encodingFormat = "UTF-8";
	private static String toReturn = "no value";
	
	public static String encodeString(String toEncode) {
		try {
			toReturn = URLEncoder.encode(toEncode, encodingFormat);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return toReturn;
	}
}
