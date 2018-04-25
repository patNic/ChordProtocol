import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.NoSuchAlgorithmException;

public class Client {
	Node node;
	Sender send;
	Receiver receive;
	int port = 8888;
	
	public Client() throws UnknownHostException, NoSuchAlgorithmException {
		start();
		DatagramSocket clientSocket;
		try {
			clientSocket = new DatagramSocket(port);
			String message = "Hello Host!";
			byte[] buf = message.getBytes();
			InetAddress address = InetAddress.getLocalHost();
			send = new Sender(clientSocket, buf, address, port);
			send.start();
		} catch (SocketException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public void start() throws UnknownHostException, NoSuchAlgorithmException {
		node = new Node(InetAddress.getLocalHost());
		System.out.println("---C H O R D  P R O T O C O L ---");
		System.out.println("joining chord ring . . .");
		System.out.println(node.getID());
		
	}
	
	
	public static void main(String[] args) throws UnknownHostException, NoSuchAlgorithmException {
		new Client();
	}
	
	
}
