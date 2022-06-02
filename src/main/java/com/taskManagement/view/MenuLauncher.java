package com.taskManagement.view;

import java.util.InputMismatchException;
import java.util.logging.Logger;
import java.util.Scanner;

/**
 * Displays the menu for task and assignee.
 * 
 * @author Ajith venkadesh
 * @version 1.0
 */
public class MenuLauncher {
	public static final Scanner INPUT = new Scanner(System.in);
	public static final Logger LOGGER = Logger.getLogger(MenuLauncher.class.getName());

	/**
	 * Displays the menu for task and assignee
	 * 
	 * @param args unused
	 * @throws InputMismatchException when invalid input is entered.
	 */
	public void display() {
		int choice = 0;
		final TaskMenu taskMenu = new TaskMenu();
		final AssigneeMenu assigneeMenu = new AssigneeMenu();

		do {
			System.out.println ("Enter 1 for assignee menu"
					+ "\n Enter 2 for task menu"
					+ "\n Enter 3 to exit");
			
			try {
			    choice = INPUT.nextInt();
			    INPUT.nextLine();
			} catch (InputMismatchException e) {
				System.out.println ("Enter only integer value");
			    choice = INPUT.nextInt();
			    INPUT.nextLine();
			}
			
			switch (choice) {
			case 1 :
				assigneeMenu.dispalyOptions();
				break;
			case 2 :
				taskMenu.displayOptions();
				break;
			default :
				System.out.println ("wrong choice");
				break;
			}
		} while (choice != 3);
	}
}
