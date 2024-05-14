package javabasic.net.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.function.Consumer;

public class ChattingClient {
	
	// 서버와 송수신하기 위한 클라이언트 소켓
	private Socket socket;
	// 서버에서 문자를 수신하는 스트림
	private BufferedReader in;
	// 서버에 문자를 송신하는 스트림
	private PrintWriter out;
	// 함수형 인터페이스 Consumer : 메소드의 입력데이터(파라미터들)을 받아서 기능을 수행하고 반환하지 않음
	private Consumer<String> onMessageReceived;
	
	// 채팅클라이언트 생성자
	// 파라미터 : 서버주소, 서버포트, Consumer
	public ChattingClient(String serverAddress, int serverPort
			, Consumer<String> onMessageReceived) throws IOException{
		// 클라이언트 소켓 생성
		this.socket = new Socket(serverAddress, serverPort);
		// 클라이언트 입력스트림 (서버 -> 클라이언트)
		this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		// 클라이언트 출력스트림 (클라이언트 -> 서버), true:autoflush
		this.out = new PrintWriter(socket.getOutputStream(), true);
		this.onMessageReceived = onMessageReceived;
	}
	
	// 클라이언트에서 서버로 메세지 전송 메소드
	public void sendMessage(String msg) {
		out.println(msg);
	}
	
	// 서버에서 클라이언트에 전송하는 메세지를 수신하는 쓰레드
	public void startClient() {
		new Thread(
				() -> {
					try {
						// 서버에서 전송한 메세지를 저장할 String
						String line;
						// 메세지(line)가 있으면 line을 onMessageReceived라는 Consumer에 전달
						// onMessageReceived를 line을 주고 수행시킨다.
						while ((line=in.readLine()) != null) {
							// 메세지를 받으면 메세지를 onMessageReceived에 전달한다.
							onMessageReceived.accept(line);
						}
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}
				}
		).start();
	}

} // class





























