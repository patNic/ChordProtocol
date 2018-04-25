import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Node {
	private Node successor, predecessor;
	private InetAddress ip;
	private boolean isConnected;
	private String id;
	
	public Node(InetAddress ip) throws NoSuchAlgorithmException {
		this.ip = ip;
		isConnected = false;
		createNodeID();
	}
	
	private void createNodeID() throws NoSuchAlgorithmException {
		String text = this.getIPAddress().toString();
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
		this.setID(hash.toString());
		
	}
	
	public Node getSuccessor() {
		return successor;
	}
	
	public void setSuccessor(Node node) {
		this.successor = node;
	}
	
	public Node getPredecessor() {
		return predecessor;
	}
	
	public void setPredecessor(Node node) {
		this.predecessor = node;
	}
	
	public InetAddress getIPAddress() {
		return ip;
	}
	
	
	public boolean getIsConnected() {
		return isConnected;
	}
	
	public void setIsConnected(boolean bool) {
		this.isConnected = bool;
	}
	
	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
}
