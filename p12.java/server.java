//java program to access network
//InetAddress that handles IP and host name
//inherited classes -Inet 4 (Ipv4),Inet 6(Ipv6).
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Main {


	public static void main(String[] args) throws UnknownHostException {
			InetAddress inet=InetAddress.getLocalHost();
			System.out.println(inet.getHostAddress());
			System.out.println(inet.getHostName());
			try {
				System.out.println(inet.isReachable(100));
			} catch (IOException e) {
	
			}
			//for more visit https://www.cis.upenn.edu/~bcpierce/courses/629/jdkdocs/api/java.net.InetAddress.html
	}

}

// program for opening web package
//while(has.next()) it returns untill the end of line pointer flags zero