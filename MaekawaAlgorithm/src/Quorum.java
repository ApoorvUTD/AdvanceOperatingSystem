
public class Quorum {
	int nodeId;
	MessageType requestStatus;
	Node node;
	
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
	
	
	public synchronized void addNewQuorumRequest(int nodeId){
		boolean isPresent=false;
		int loop =0;
		while (loop <node.quorumMemberRequest.size() ){
			if (node.quorumMemberRequest.get(loop)[0] == node.nodeId){
				isPresent=true;
				break;
			}
			loop++;
			}if(!isPresent){
				int[] newMemebrRequest ={node.nodeId,Integer.parseInt(node.IPAddressMap.get(node.nodeId).totalMessagestoSend)};
				node.quorumMemberRequest.add(newMemebrRequest);
			}
		
	}

}
