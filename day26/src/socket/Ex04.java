package socket;

import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		URL url = new URL("https://mgr.kgitbank.com");
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		String content = "";
		
		while(sc.hasNextLine()) {
			content += sc.nextLine() + "\r\n";
		}
		sc.close();
		conn.disconnect();
		
		System.out.println(content);
		System.out.println(conn.getResponseCode());
		System.out.println(conn.getResponseMessage());
		
		
	}
}
