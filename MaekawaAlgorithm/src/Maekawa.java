import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Maekawa {
	//AD COMMENTS
	//blocking queue

	
	
	
	
	
	public void readNodeConfig(){
		
		//Configuration file format
		//node_id ipaddress:port total message
		//node_id ipaddress:port total message
		//node_id ipaddress:port total message
		//node_id ipaddress:port total message
		
		BufferedReader br = null;
		//object with detail about tcp channel and nodes.
		 Node node = null;
		 Quorum quorum =null;
		 String sCurrentLine;
		 node.totalNodeCount = 0 ;
		 node.IPAddressMap = new ArrayList<Node>();
		 String [] Hold;
		 String fileName = "src/config.txt";
		 try {
				br = new BufferedReader(new FileReader(fileName));
			    while ((sCurrentLine = br.readLine()) != null) 
				 {Hold=sCurrentLine.split(" ");
				  node=new Node(Hold[0],Hold[1],SctpChannel null, Hold[2]);
				  //IPAddressNodeMap.add(totalNodeCount, tmpMap);
				  node.IPAddressMap.add(node.totalNodeCount,node);
				  node.totalNodeCount++;
				 } 
			    node.ServerPort=Integer.parseInt(node.IPAddressMap.get(node.nodeId).nodeAddress.split(":")[1]);
			    quorum.addNewQuorumRequest(node.nodeId);
				}catch (Exception e) {e.printStackTrace();}  finally 
		 {	try {if (br != null)br.close();}
		 catch (IOException ex) {ex.printStackTrace();}}
			
	}
	
	
	public void readQuorumConfig(){
		
	}
	
	
	public static void csEnter(int nodeID){
		//enter in to critical section

		

	}
	
	public static void csLeave(){
		//leave the critical section

	}
	
	public static void main(String[] args) {
		//readNodeConfig()
		//readQuorumConfig()
		//connectToQuorum()
		//printQuorumToFile()
		//checkQuorumProperty() i.e q1 q2 intersection is not phi if not satisfied shut it down
		//newCSReq-->sendReq OR Release {REQUEST or RELEASE}
		//
		
	}
}
