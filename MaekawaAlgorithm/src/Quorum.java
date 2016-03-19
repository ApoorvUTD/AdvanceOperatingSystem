
public class Quorum {
	int nodeId;
	MessageType requestStatus;
	
	public Quorum(int nodeId, MessageType requestStatus) {
		super();
		this.nodeId = nodeId;
		this.requestStatus = requestStatus;
	}
	public int getNodeId() {
		return nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public MessageType getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(MessageType requestStatus) {
		this.requestStatus = requestStatus;
	}

}
