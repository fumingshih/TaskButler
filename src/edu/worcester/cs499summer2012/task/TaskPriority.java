/**

 * TaskPriority.java
 * 
 * 
 * @file
 * Enables the user to set the priority of a task. Currently
 * the user can select from a list of three different priorities.
 * @author Jonathan Hasenzahl
 * @version 1.0 dev
 * 
 * Copyright 2012 Jonathan Hasenzahl
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package edu.worcester.cs499summer2012.task;

import java.util.Comparator;

public class TaskPriority implements Comparator<Task> {
	
	public static final int TRIVIAL = 0;
	public static final int NORMAL = 1;
	public static final int URGENT = 2;
	
	public static final String[] LABELS = {"Trivial", "Normal", "Urgent"};
	/**
	 * @return
	 * the equivalence of the left and right hand side.
	 * @param lhs the left hand task
	 * @param rhs the right hand task
	 */	
	public int compare(Task lhs, Task rhs) {
		if (lhs.getPriority() == rhs.getPriority())
			return 0;
		else if (lhs.getPriority() < rhs.getPriority())
			return -1;
		else
			return 1;
	}
}
