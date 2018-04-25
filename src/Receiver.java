import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Receiver extends Thread {
	private DatagramSocket socket;
	
	private byte[] buf = new byte[256];
	public Receiver(DatagramSocket  socket) {
		
		this.socket = socket;
		
	}
	public void run() {
		
		while(true){
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			try {
				
				socket.receive(packet);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	 
			String received = new String(packet.getData(), 0, packet.getLength());
			System.out.println("\n\t\t["+packet.getAddress()+": "+received+"]");
		}
	}
}
