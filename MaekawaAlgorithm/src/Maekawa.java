import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;

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
		//		#STRUCTURE:TRIANGLE
		//		#ROW:LHS
		//		#COLUMN:COMPLETE
		//		0
		//		1 2
		//		3 4 5

	}

	public Node getIp(String Address){
		Node node = null;
		for (Node n: node.IPAddressMap ){
			if (Address.split(":")[0].contains(n.nodeAddress.split(":")[0]))
				return n;
		}

		return null;

	}


	public static void csEnter(int nodeid,int sequenceNumber,int startTime,int endTime){
		//enter in to critical section lets enterrrrrrr wohooooo
		String fileName = "criticleSection.txt";
		File fout=new File("./",fileName);
		Writer writer;
		FileOutputStream filestream = new FileOutputStream)(fileName,true);
		writer = new BufferedWriter(new OutputStreamWriter(filestream, "UTF-8"));
		writer.append(nodeid+","+sequenceNumber+","+"ENTER"+","+startTime);
		writer.append("\n");
		writer.close();

		//SLEEP for a while
		Thread.sleep(1000);

		//WXITING finally huh		
		//should we have a method for END and start timestamp;
		Calendar lCDateTime = Calendar.getInstance();
		long currentTimeStamp = lCDateTime.getTimeInMillis();
		FileOutputStream FoutStream=new FileOutputStream(fileName, true);
                                writer = new BufferedWriter(new OutputStreamWriter(filestream, "UTF-8"));
                                writer.append(nodeid+","+sequenceNumber+","+"EXIT"+","+currentTimeStamp);
                                writer.append("\n");
                                writer.close();        

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
