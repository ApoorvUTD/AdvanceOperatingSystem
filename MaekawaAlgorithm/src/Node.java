
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//import Message.MessageType;

public class Node implements Runnable {
	
	public int nodeId;
	private BlockingQueue<Message> failedqueue = new LinkedBlockingQueue<Message>(100);
	private BlockingQueue<Message> waitingqueue = new LinkedBlockingQueue<Message>(100);
	private BlockingQueue<Message> lockedqueue = new LinkedBlockingQueue<Message>(100);
	Node[] quorum;
	int[] quorumIds;
	List<Integer> quorumList = new ArrayList<Integer>() ;
	boolean curLockingStatus = false;
	boolean inCriticleSection = false;
	boolean releaseSent = false;
	boolean locked = false;
	
	
	
	

	public boolean isSearchSent() {
		return isSearchSent;
	}
	

	public void setSearchSent(boolean isSearchSent) {
		this.isSearchSent = isSearchSent;
	}

	public Node(int nodeId, int distFromSource, BlockingQueue<Message> queue,
			boolean isAwake, int parent, Node[] children, Node[] neighbours) {
		super();
		this.nodeId = nodeId;
		//this.queue = queue;
		this.isAwake = isAwake;
		this.parent = parent;
		//this.children = children;
		this.neighbours = neighbours;
	}

	


	@Override
	public void run() {
		
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

//		if (this.distFromSource == 0) {
//			System.out.println("Main thread is " + this.nodeId);
//			int[] neibhours = this.getNeighbourIds();
//			for (int i = 0; i < neibhours.length; i++) {
//				if (neibhours[i] == 1) {
//					try {
//						Thread.sleep(randNum());
//						Message rootMssg = new Message(this.nodeId, i, 0,
//								MessageType.SEARCH);
//						Messege.sendMessage(rootMssg);
//						Main.nodeArray[this.nodeId].isSearchSent=false;
//						Thread.sleep(15000);
//						System.out.println("node: " + this
//								+ " sending mssg to: " + i);
//						awakeNode(i);
//
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//
//		}
		
		// checks each and every node for new messages until the process is complete
		 while (isComplete)
		{
//			try {
//				if (!this.queue.isEmpty()) {
//					Messege incomingMssg = this.queue.take();
//					if (incomingMssg.msgType == MessageType.SEARCH) {
//						if (incomingMssg.distFromRoot+1 < Main.nodeArray[this.nodeId].distFromSource && !this.childList.contains(incomingMssg.sourceId)) {
//							Main.nodeArray[this.nodeId].distFromSource=incomingMssg.distFromRoot + 1;
//							//this.distFromSource = incomingMssg.distFromRoot + 1;
//							Messege ackMssg = new Messege(this.nodeId,incomingMssg.sourceId, MessageType.ACK); // send Ack to parent
//							System.out.println(this.nodeId+"ACK msg to"+incomingMssg.sourceId);
//							Messege.sendMessage(ackMssg);
//							Main.nodeArray[this.nodeId].parent = incomingMssg.sourceId;
//						}
//						else
//						{
//							Messege nackMssg = new Messege(this.nodeId,incomingMssg.sourceId, MessageType.NACK); // send Nack to parent											
//							Messege.sendMessage(nackMssg);
//							System.out.println(this.nodeId+"NACK msg to"+incomingMssg.sourceId);
//							
//						}
//					}
//					if (incomingMssg.msgType == MessageType.ACK) {
//						Main.nodeArray[this.nodeId].childList.add(incomingMssg.getSourceId());
//						
//					}
//					if (incomingMssg.msgType == MessageType.NACK) {
//						if(!Main.nodeArray[this.nodeId].childList.isEmpty())
//						{
//							Main.nodeArray[this.nodeId].childList.remove(incomingMssg.getSourceId());
//
//							
//						}
//						
//					}
//					System.out.println("Global array :"+this.nodeId);
//					for (int i = 0; i < Main.nodeArray.length; i++) {
//						System.out.println(Main.nodeArray[i]);
//					}
//
//				}
//				// allows every node to send the search message only once
//				if(Main.nodeArray[this.nodeId].isAwake)
//				{
//					
//				
//				if(Main.nodeArray[this.nodeId].isSearchSent)
//				{
//					int[] neibhours = this.getNeighbourIds();
//					
//					for (int i = 0; i < neibhours.length; i++) {
//						if (neibhours[i] == 1 &&  !(Main.nodeArray[this.nodeId].parent==i)) {
//							try {
//								Thread.sleep(randNum());
//								Messege searchMsg = new Messege(this.nodeId, i, Main.nodeArray[this.nodeId].distFromSource,MessageType.SEARCH);
//								Messege.sendMessage(searchMsg);
//								Main.nodeArray[this.nodeId].isSearchSent=false;
//								Thread.sleep(15000);
//								System.out.println("node: " + this
//										+ " sending mssg to: " + i+"yo yo honey singh 781227");
//								
//								System.out.println("node :" + this.nodeId+"Sending message to "+ i+" sylar");
//								awakeNode(i);
//
//							} catch (InterruptedException e) {
//								e.printStackTrace();
//							}
//						}
//					}
//
//					
//				}
//				}
//				
//				
//			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}

		}
		
//			}

	public boolean isComplete() {
		return isComplete;
	}

	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}

	public int randNum() {
		Random rNum = new Random();
		int randomNuber = 0;
		for (int i = 0; i < 12; i++) {
			randomNuber = rNum.nextInt(1500) + 1;
		}
		return randomNuber;
	}

	public void awakeNode(int nodeID) {
//		Main.nodeArray[nodeID].isAwake = true;
	}
	


}
