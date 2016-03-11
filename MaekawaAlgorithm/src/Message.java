public class Message {
	
	public enum MessageType
	{
		REQUEST,RELEASE,INQUIRE,FAIL,LOCK;
	}
	
	int sourceId;
	int destId;
	int quorum;
	MessageType msgType;
	
	
	
	
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
	
	public MessageType getMsgType() {
		return msgType;
	}
	public void setMsgType(MessageType msgType) {
		this.msgType = msgType;
	}
	

	public static void sendMessage(Message message) {

		//Main.nodeArray[message.getDestId()].getQueue().add(message);
	}
	@Override
	public String toString() {
		return "Messege [sourceId=" + sourceId + ", destId=" + destId
				+ ", distFromRoot="  + ", msgType=" + msgType
				+ "]";
	}



}
