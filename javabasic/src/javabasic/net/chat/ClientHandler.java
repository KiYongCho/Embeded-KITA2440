package javabasic.net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class ClientHandler implements Runnable {
	
	private Socket clientSocket;
	private List<ClientHandler> clients;
	private PrintWriter out;
	private BufferedReader in;
	
	public ClientHandler(Socket socket, List<ClientHandler> clients) throws IOException {
		this.clientSocket = socket;
		this.clients = clients;
		this.out = new PrintWriter(clientSocket.getOutputStream(), true);
		this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	}

	@Override
	public void run() {
		try {
			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				for (ClientHandler clientHandler : clients) {
					clientHandler.out.println(inputLine);
				}
			}
		} catch (IOException ioe) {
			System.out.println("클라이언트 종료!" + ioe.getMessage());
		} finally {
			try {
				in.close();
				out.close();
				clientSocket.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}

} // class



















