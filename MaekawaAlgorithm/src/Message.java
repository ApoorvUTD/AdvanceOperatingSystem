import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

public class Message implements Serializable {

	int source;
	int sequenceNumber;
	int dest;
	int quorum;
	MessageType msgType;
	static int MAX_BUF_SIZE=1000;


	//constructor to pass details
	public Message(int source,int dest,MessageType msgType){

		this.source = source;
		this.dest = dest;
		this.msgType = msgType;

	}

	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getDest() {
		return dest;
	}
	public void setDestId(int dest) {
		this.dest = dest;
	}

	public static byte[] serialize(Object obj) throws IOException {
	    ByteArrayOutputStream out = new ByteArrayOutputStream();
	    ObjectOutputStream os = new ObjectOutputStream(out);
	    os.writeObject(obj);
	    return out.toByteArray();
	}
	
	public static Object deserialize(ByteBuffer parabyteBuffer) throws IOException, ClassNotFoundException {
		parabyteBuffer.position(0);
		parabyteBuffer.limit(MAX_BUF_SIZE);
		byte[] bufArr = new byte[parabyteBuffer.remaining()];
		parabyteBuffer.get(bufArr);
		
		ByteArrayInputStream in = new ByteArrayInputStream(bufArr);
	    ObjectInputStream is = new ObjectInputStream(in);
	    return is.readObject();
	}
	
	public static void sendMessage(Message message) {

		//Main.nodeArray[message.getDestId()].getQueue().add(message);
	}
	@Override
	public String toString() {
		return "Messege [source=" + source + ", dest=" + dest
				+ ", distFromRoot="  + ", msgType=" + 
				"]";
	}



}
