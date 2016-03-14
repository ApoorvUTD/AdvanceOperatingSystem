import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class foo {
    public static void main() throws Exception{
    	String hostname = InetAddress.getLocalHost().getHostName();
    	Files.write(Paths.get("foo.out"), ("PRINTING BY " + hostname).getBytes(), StandardOpenOption.APPEND);
    }
}
