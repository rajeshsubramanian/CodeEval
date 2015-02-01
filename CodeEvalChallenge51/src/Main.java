import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Sample code to read in test cases:
import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
        }
    }
}
*/

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numberOfPoints = 0;
		List<Point> points = new ArrayList<Point>();
		File file = new File(args[0]);
		BufferedReader buffer;
		try {
			buffer = new BufferedReader(new FileReader(file));
			String line;
			while (!(line = buffer.readLine()).equals("0")) {

				line = line.trim();
				if (line.length() == 0) {
					continue;
				}
				// Process line of input Here

				if (numberOfPoints == 0) {
					numberOfPoints = Integer.parseInt(line);
				} else {
					String temp[] = line.split("\\s");
					Point point = new Point(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
					points.add(point);
					if (points.size() == numberOfPoints) {
						getClostestPairDistance(points);
						points.clear();
						numberOfPoints = 0;
					}
				}
			}
			buffer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getClostestPairDistance(List<Point> points) {

		double minimumDistance = Double.MAX_VALUE;
		for (int i = 0; i < points.size(); i++) {
			Point p1 = points.get(i);
			for (int j = 0; j < points.size(); j++) {
				if (j == i) {
					continue;
				}
				Point p2 = points.get(j);
				double distance = p1.distance(p2);
				if (distance < minimumDistance) {
					minimumDistance = distance;
				}
			}
		}

		System.out.println(minimumDistance < 10000 ? Math.round(minimumDistance * 10000.0) / 10000.0 : "INFINITY");
	}

	public static double findDistance(Point p1, Point p2) {
		return p1.distance(p2);
	}
}
