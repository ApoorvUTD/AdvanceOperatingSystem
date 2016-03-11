
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
	

	//constructor for initial setup
	public Node(int nodeID,Node [] quorum,int totalQuorum){
		this.nodeId = nodeID;
		this.quorum = quorum;
		this.totalQuorum = totalQuorum;
		
	}
	

	
	

	

	
	


}
