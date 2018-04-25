import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class Node {
	private Node successor, predecessor;
	private InetAddress ip;
	private boolean isConnected;
	private BigInteger id;
	
	public Node(InetAddress ip) throws NoSuchAlgorithmException {
		this.ip = ip;
		isConnected = false;
		createNodeID();
	}
	
	private void createNodeID() throws NoSuchAlgorithmException {
		String text = this.getIPAddress().toString();
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		byte[] hash = digest.digest(text.getBytes(StandardCharsets.UTF_8));
		StringBuffer hex = new StringBuffer();
		
		for(int i = 0; i< hash.length; i++) {
			String s = Integer.toHexString(0xff & hash[i]);
			if(hex.length() == 1) hex.append('0');
			hex.append(s);
		}
		
		this.setID(new BigInteger(hex.toString(),16));
		
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
	
	public BigInteger getID() {
		return id;
	}
	
	public void setID(BigInteger id) {
		this.id = id;
	}
	
}
