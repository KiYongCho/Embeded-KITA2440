package javabasic.net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.function.Consumer;

public class ChattingClient {
	
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	private Consumer<String> onMessageReceived;
	
	public ChattingClient(String serverAddress, int serverPort
			, Consumer<String> onMessageReceived) throws IOException{
		this.socket = new Socket(serverAddress, serverPort);
		this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		this.out = new PrintWriter(socket.getOutputStream(), true);
		this.onMessageReceived = onMessageReceived;
	}
	
	public void sendMessage(String msg) {
		out.println(msg);
	}
	
	public void startClient() {
		new Thread(
				() -> {
					try {
						String line;
						while ((line=in.readLine()) != null) {
							onMessageReceived.accept(line);
						}
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}
				}
		).start();
	}

} // class





























