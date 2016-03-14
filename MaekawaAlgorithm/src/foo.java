import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class foo {
    public static void main() throws Exception{
    	String hostname = InetAddress.getLocalHost().getHostName();
    	Files.write(Paths.get("foo.out"), ("ENTERING " + hostname + "\n").getBytes(), StandardOpenOption.APPEND);
    	Thread.sleep(5000);
    	Files.write(Paths.get("foo.out"),("LEAVING " + hostname + "\n").getBytes(),StandardOpenOption.APPEND);
    }
}
