package javabasic.net.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChattingServer {
	
	private static List<ClientHandler> clients = new ArrayList<ClientHandler>();
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(5000);
		if (serverSocket != null) {
			System.out.println("서버 시작됨! 클라이언트 대기중!");
		}
		
		while (true) {
			Socket clientSocket = serverSocket.accept();
			System.out.println("클라이언트 접속 : " + clientSocket);
			
			ClientHandler clientThread = new ClientHandler(clientSocket, clients);
			clients.add(clientThread);
			new Thread(clientThread).start();
		}
		
	} // main

} // class











