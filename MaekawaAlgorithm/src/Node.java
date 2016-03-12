
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


public class Node implements Runnable {

	public int nodeId;
	private BlockingQueue<Message> failedqueue = new LinkedBlockingQueue<Message>(100);
	private BlockingQueue<Message> waitingqueue = new LinkedBlockingQueue<Message>(100);
	private BlockingQueue<Message> lockedqueue = new LinkedBlockingQueue<Message>(100);
	Node[] quorum;
	int[] quorumIds;
	int totalQuorum;
	List<Integer> quorumList = new ArrayList<Integer>() ;
	boolean curLockingStatus = false;
	boolean inCriticleSection = false;
	boolean releaseSent = false;
	boolean locked = false;
    int ts;//time stamp

	//constructor for initial setup
	public Node(int nodeID,Node [] quorum,int totalQuorum){
		this.nodeId = nodeID;
		this.quorum = quorum;
		this.totalQuorum = totalQuorum;

	}
	
	//Adding another constructor 
	public Node(int nodeID,int[] quorumIDs){
	this.nodeId = nodeId;
	this.quorumIds=quorumIds;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		//get the time=stamp thing sorted out and Logicalclock(nodeId,ts)
		//
		
		//if got all the locked from quorum members then enter critical section 
		if (this.lockedqueue.size()==totalQuorum){
			Maekawa.csEnter(this.nodeId);
			inCriticleSection = true;
	    }
		
		if (this.failedqueue.size() != 0){
			
		}

		//check if current locking status is false

		//if request comes in


	}


	public int getNodeId() {
		return nodeId;
	}


	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}


	public BlockingQueue<Message> getFailedqueue() {
		return failedqueue;
	}


	public void setFailedqueue(BlockingQueue<Message> failedqueue) {
		this.failedqueue = failedqueue;
	}


	public BlockingQueue<Message> getWaitingqueue() {
		return waitingqueue;
	}


	public void setWaitingqueue(BlockingQueue<Message> waitingqueue) {
		this.waitingqueue = waitingqueue;
	}


	public BlockingQueue<Message> getLockedqueue() {
		return lockedqueue;
	}


	public void setLockedqueue(BlockingQueue<Message> lockedqueue) {
		this.lockedqueue = lockedqueue;
	}


	public Node[] getQuorum() {
		return quorum;
	}


	public void setQuorum(Node[] quorum) {
		this.quorum = quorum;
	}


	public int[] getQuorumIds() {
		return quorumIds;
	}


	public void setQuorumIds(int[] quorumIds) {
		this.quorumIds = quorumIds;
	}


	public int getTotalQuorum() {
		return totalQuorum;
	}


	public void setTotalQuorum(int totalQuorum) {
		this.totalQuorum = totalQuorum;
	}


	public List<Integer> getQuorumList() {
		return quorumList;
	}


	public void setQuorumList(List<Integer> quorumList) {
		this.quorumList = quorumList;
	}


	public boolean isCurLockingStatus() {
		return curLockingStatus;
	}


	public void setCurLockingStatus(boolean curLockingStatus) {
		this.curLockingStatus = curLockingStatus;
	}


	public boolean isInCriticleSection() {
		return inCriticleSection;
	}


	public void setInCriticleSection(boolean inCriticleSection) {
		this.inCriticleSection = inCriticleSection;
	}


	public boolean isReleaseSent() {
		return releaseSent;
	}


	public void setReleaseSent(boolean releaseSent) {
		this.releaseSent = releaseSent;
	}


	public boolean isLocked() {
		return locked;
	}


	public void setLocked(boolean locked) {
		this.locked = locked;
	}


	@Override
	public String toString() {
		return "Node [nodeId=" + nodeId + ", failedqueue=" + failedqueue + ", waitingqueue=" + waitingqueue
				+ ", lockedqueue=" + lockedqueue + ", quorum=" + Arrays.toString(quorum) + ", quorumIds="
				+ Arrays.toString(quorumIds) + ", totalQuorum=" + totalQuorum + ", quorumList=" + quorumList
				+ ", curLockingStatus=" + curLockingStatus + ", inCriticleSection=" + inCriticleSection
				+ ", releaseSent=" + releaseSent + ", locked=" + locked + "]";
	}

}
