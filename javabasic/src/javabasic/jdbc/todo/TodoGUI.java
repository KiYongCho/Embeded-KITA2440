package javabasic.jdbc.todo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TodoGUI extends JFrame {
	
	TodoLogic todoLogic;
	
	// 리스트 화면 설정
	Panel listPanel = new Panel(new FlowLayout());	
	
	TodoGUI() {
		todoLogic = new TodoLogic();
		init();
	}
	
	public static void main(String[] args) {
		new TodoGUI();
	}
	
	// 어플리케이션 초기화 메소드
	private void init() {
		
		// 리스트 화면
		showList();
	
		// 입력 화면 설정
		Panel writePanel = new Panel(new BorderLayout());
		JTextField todoTF = new JTextField(20);
		JButton writeBtn = new JButton("등록");
		
		writeBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String tfText = todoTF.getText();
				if (tfText!=null && !tfText.trim().equals("")) {
					Todo todo = new Todo(0, tfText, null, null);
					try {
						todoLogic.writeTodo(todo);
						showList();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		
		writePanel.add(todoTF, BorderLayout.CENTER);
		writePanel.add(writeBtn, BorderLayout.EAST);
		
		// 전체 화면 설정
		this.setTitle("::: Java Todo App :::");
		this.setLayout(new BorderLayout());
		this.setSize(400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(listPanel, BorderLayout.CENTER);
		this.add(writePanel, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	private void showList() {
		listPanel = new Panel(new FlowLayout());	
		List<Todo> todoList = null;
		try {
			todoList = todoLogic.listTodo();
			for (Todo todo : todoList) {
				Panel rowPanel = new Panel(new FlowLayout());
				JLabel todoContent = new JLabel(todo.getTdcontent());
				JLabel todoRegdate = new JLabel(todo.getTdregdate().toString());
				JButton deleteBtn = new JButton("삭제");
				deleteBtn.setActionCommand(""+todo.getTdid());
				
				deleteBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Todo todo = new Todo(
								Integer.parseInt(e.getActionCommand()), null, null, null
						);
						try {
							todoLogic.deleteTodo(todo);
							showList();
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
				});				
				
				rowPanel.add(todoContent);
				rowPanel.add(todoRegdate);
				rowPanel.add(deleteBtn);
				listPanel.add(rowPanel);
			}
			listPanel.revalidate();	
			listPanel.repaint();
		} catch (Exception ex) {
			ex.printStackTrace();
		}		
	}

} // class









