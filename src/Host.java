import java.net.InetAddress;
import java.net.UnknownHostException;

public class Host {
	Node node;
	public void start() throws UnknownHostException {
		node = new Node(InetAddress.getLocalHost());
		System.out.println("---C H O R D  P R O T O C O L ---");
		System.out.println("creating chord ring . . .");
	}
}
