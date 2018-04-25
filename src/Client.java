import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;

public class Client {
	Node node;
	public void start() throws UnknownHostException, NoSuchAlgorithmException {
		node = new Node(InetAddress.getLocalHost());
		System.out.println("---C H O R D  P R O T O C O L ---");
		System.out.println("joining chord ring . . .");
		System.out.println(node.getID());
		
	}
	
	
	public static void main(String[] args) throws UnknownHostException, NoSuchAlgorithmException {
		new Client().start();
	}
	
	
}
