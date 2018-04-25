import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;

public class Host {
	Node node;
	public void start() throws UnknownHostException, NoSuchAlgorithmException {
		node = new Node(InetAddress.getLocalHost());
		System.out.println("---C H O R D  P R O T O C O L ---");
		System.out.println("creating chord ring . . .");
		Chord.createRing(node);
	}
	
	public static void main(String[] args) throws UnknownHostException, NoSuchAlgorithmException {
		new Host().start();
	}
	
}
