import java.io.Serializable;

public class Message implements Serializable {

	int sourceId;
	int destId;
	int quorum;
	MessageType msgType;


	//constructor to pass details
	public Message(int sourceId,int destID,MessageType msgType){

		this.sourceId = sourceId;
		this.destId = destID;
		this.msgType = msgType;

	}

	public int getSourceId() {
		return sourceId;
	}
	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}
	public int getDestId() {
		return destId;
	}
	public void setDestId(int destId) {
		this.destId = destId;
	}


	public static void sendMessage(Message message) {

		//Main.nodeArray[message.getDestId()].getQueue().add(message);
	}
	@Override
	public String toString() {
		return "Messege [sourceId=" + sourceId + ", destId=" + destId
				+ ", distFromRoot="  + ", msgType=" + 
				"]";
	}



}
