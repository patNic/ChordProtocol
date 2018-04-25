import java.net.InetAddress;

public class Node {
	private Node successor, predecessor;
	private InetAddress ip;
	
	public Node(InetAddress ip) {
		this.ip = ip;
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
	
	
}
