package in.swing.main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ToDoApp {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new ToDoApp().createUI());
	}

	private void createUI() {
		JFrame frame = new JFrame("ToDo App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(new BorderLayout());

		// Model and list
		DefaultListModel<String> taskListModel = new DefaultListModel<>();
		JList<String> taskList = new JList<>(taskListModel);
		JScrollPane scrollPane = new JScrollPane(taskList);

		// Input field
		JTextField taskField = new JTextField();
		taskField.setFont(new Font("Arial", Font.PLAIN, 14));

		// Buttons
		JButton addButton = new JButton("Add");
		JButton deleteButton = new JButton("Delete");

		// Panel for input and buttons
		JPanel inputPanel = new JPanel(new BorderLayout(5, 5));
		inputPanel.add(taskField, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPanel.add(addButton);
		buttonPanel.add(deleteButton);

		inputPanel.add(buttonPanel, BorderLayout.EAST);

		// Add action listeners
		addButton.addActionListener(e -> {
			String task = taskField.getText().trim();
			if (!task.isEmpty()) {
				taskListModel.addElement(task);
				taskField.setText("");
			}
		});

		deleteButton.addActionListener(e -> {
			int selectedIndex = taskList.getSelectedIndex();
			if (selectedIndex != -1) {
				taskListModel.remove(selectedIndex);
			}
		});

		// Add to frame
		frame.add(inputPanel, BorderLayout.NORTH);
		frame.add(scrollPane, BorderLayout.CENTER);

		frame.setVisible(true);
	}
}
