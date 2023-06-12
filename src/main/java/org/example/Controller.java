package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Controller {

	DistributionChart distributionChart;

	/**
	 * Constructor.
	 */
	public Controller() {
		distributionChart = new DistributionChart();
	}

	/**
	 *
	 * @param skillsAndHeights .
	 * @return .
	 */
	public HashMap<String, Point> createChart( HashMap<String, Integer> skillsAndHeights, ArrayList<Integer> widths ) {
		return distributionChart.getOrigins( skillsAndHeights, widths );
	}
}
