package javabasic.net;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {
	
	public static void main(String[] args) {
		
		Socket s = null;
		
		try {
			s = new Socket("localhost", 9999);
			if (s!=null) {
				System.out.println("채팅서버에 연결되었습니다! " + s);
				OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
				osw.write("Hello~ I'm realchoky~~~");
				osw.flush();
			}
		} catch (UnknownHostException ukhe) {
			ukhe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class







