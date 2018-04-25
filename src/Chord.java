public class Chord {
	private static int count = 0;
	public static void createRing(Node node) {
		node.setIsConnected(true);
		node.setPredecessor(node);
		node.setSuccessor(node);
		count++;
		System.out.println("Successfully created chord ring with host "+node.getID());
	}
	public static void join() {
		
	}
	
	public static int getConnectedNodesCount() {
		return count;
	}
}
