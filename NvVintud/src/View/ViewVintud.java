package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

import controller.UtilisateurController;
import entities.User;

public class ViewVintud {

	private JFrame frame;
	private JTable table;
	
	UtilisateurController userController =  new UtilisateurController() ;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVintud window = new ViewVintud();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	List<User> listAllUsers =userController.getAllUsers() ;

	
	public ViewVintud() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 400,700, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Affichage des utilisateurs");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		table = new JTable(listAllUsers.size()+1, 9);
		panel.add(table);
		panel.add(btnNewButton);
		
		table.setValueAt("USER ID", 0, 0);
		table.setValueAt("FIRSTNAME", 0, 1);
		table.setValueAt("NAME", 0, 2);
		table.setValueAt("PSEUDO", 0, 3);
		table.setValueAt("MAIL", 0, 4);
		table.setValueAt("PWD", 0, 5);
		table.setValueAt("PHONE", 0, 6);
		table.setValueAt("ADDRESS", 0, 7);
		table.setValueAt("ROLE", 0, 8);
	
	for(int i =1 ; i<listAllUsers.size()+1;i++) {
		
		table.setValueAt(listAllUsers.get(i-1).getId(), i, 0);
		table.setValueAt(listAllUsers.get(i-1).getFirstname(), i, 1);
		table.setValueAt(listAllUsers.get(i-1).getName(), i, 2);
		table.setValueAt(listAllUsers.get(i-1).getPseudo(), i, 3);
		table.setValueAt(listAllUsers.get(i-1).getMail(), i, 4);
		table.setValueAt(listAllUsers.get(i-1).getU_password(), i, 5);
		table.setValueAt(listAllUsers.get(i-1).getPhone(), i, 6);
		table.setValueAt(listAllUsers.get(i-1).getAddress(), i, 7);
		table.setValueAt(listAllUsers.get(i-1).getRole_id(), i, 8);

		
		
	}

}
}
