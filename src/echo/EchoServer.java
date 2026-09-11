package echo;
import java.io.*;
import java.net.*;

public class EchoServer {
	
	public static void main(String[] args)
	{
		try {
			System.out.println("Waiting for clients..");
			ServerSocket ss = new ServerSocket(9806);
			Socket soc = ss.accept();
			System.out.println("Connection Established");
			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = in.readLine();
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			System.out.println("Server says: " + str);
			
			soc.close();
			ss.close();
		} catch (Exception e)
		{

			e.printStackTrace();
		}	
	}
}
