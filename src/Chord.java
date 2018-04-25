import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Chord {
	
	public void createNodeID(Node node) throws NoSuchAlgorithmException {
		String text = node.getIPAddress().toString();
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
	}
	public void createRing() {
		
	}
	public void join() {
		
	}
}
