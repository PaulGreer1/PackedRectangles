package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class DistributionChart {

	/**
	 * Constructor.
	 */
	public DistributionChart(){
	}

	/**
	 *
	 * @param skillsAndHeights .
	 * @return .
	 */
	public HashMap<String, Point> getOrigins( HashMap<String, Integer> skillsAndHeights, ArrayList<Integer> widths ) {

		ArrayList<Point> topsideOrigins = this.getTopsideOrigins( skillsAndHeights.size() / 4, widths );

		return null;
	}

	/**
	 *
	 * @param multiple .
	 * @param widths .
	 * @return .
	 */
	private ArrayList<Point> getTopsideOrigins( Integer multiple, ArrayList<Integer> widths ) {

		return null;
	}

}
