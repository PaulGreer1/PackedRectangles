package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 *
 */
public class Main extends JPanel implements ActionListener {
	// Members.
	JButton createChartButton;
	Controller controller;

	/**
	 * Constructor.
	 */
	public Main() {
		//
		createChartButton = new JButton( "Create chart" );
		createChartButton.setActionCommand( "create_chart" );
		createChartButton.addActionListener( this );
		this.add( createChartButton );

		controller = new Controller();
	}

	/**
	 * @param e The event which triggers this method.
	 */
	@Override
	public void actionPerformed( ActionEvent e ) {
		if( "create_chart".equals( e.getActionCommand() ) ) {
			HashMap<String, Integer> skillsAndHeights = new HashMap<>();
			ArrayList<Integer> widths = new ArrayList<>( Arrays.asList( 33, 88, 31, 17, 33, 88, 31, 17, 33, 88, 31, 17, 33, 88, 31, 17 ) );
			HashMap<String, Point> skillsAndOrigins = controller.createChart( skillsAndHeights, widths );
		}
	}

	/**
	 * Create and dispay the GUI. For thread safety, this method should be invoked from the event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		// Create and set up the window.
		JFrame frame = new JFrame("PackedRectangles" );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// Create and set up the content pane. Content panes must be opaque.
		Main newContentPane = new Main();
		newContentPane.setOpaque( true );
		frame.setContentPane( newContentPane );

		// Display the window.
		frame.pack();
		frame.setVisible( true );
	}

	/**
	 * @param args .
	 */
	public static void main( String[] args ) {
		// Schedule a job for the event-dispatching thread which creates and displays this application's GUI.
		javax.swing.SwingUtilities.invokeLater( new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		} );
	}
}
