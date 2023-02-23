package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

	StdDraw.setPenColor(0, 150, 20);
	StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);
	
	StdDraw.setPenColor(Color.CYAN);
	StdDraw.filledRectangle(0.25, 0.5, 0.1, 0.2);
	StdDraw.setPenColor(Color.WHITE);
	StdDraw.rectangle(0.25, 0.5, 0.1, 0.2);
	StdDraw.setPenColor(Color.GRAY);
	StdDraw.filledRectangle(0.5, 0.5, 0.1, 0.2);
	StdDraw.setPenColor(Color.WHITE);
	StdDraw.rectangle(0.5, 0.5, 0.1, 0.2);
	StdDraw.setPenColor(Color.MAGENTA);
	StdDraw.filledRectangle(0.75, 0.5, 0.1, 0.2);
	StdDraw.setPenColor(Color.WHITE);
	StdDraw.rectangle(0.75, 0.5, 0.1, 0.2);
	StdDraw.setPenColor(Color.BLACK);
	StdDraw.rectangle(0.5, 0.5, 0.4, 0.2);
	}
}