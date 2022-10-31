package calculate_speed;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ShowResults {

	public void saveToCSVfile(ArrayList<Dataset> dsArray) {

		try(PrintWriter writer = new PrintWriter(new File("C:\\Users\\SANTHOSH KUMAR\\eclipse-workspace\\GRL_TASK\\src\\CSV\\GRL1.csv"))) {

			StringBuilder builder = new StringBuilder();
			
			builder.append("DISTANCE,TIME,SPEED\n");

			for (int i = 0; i < dsArray.size(); i++) {

				builder.append(dsArray.get(i).getDsDistance()).append(",");

				builder.append(dsArray.get(i).getDsTime()).append(",");

				builder.append(dsArray.get(i).getDsSpeed()).append("\n");


			}

			System.out.println(builder);

			writer.write(builder.toString());



		} catch (FileNotFoundException e) {
			System.out.println("Cannot open csv file");
		}

		catch (IOException e2) {
			System.out.println(" Cannot create CSV file");
		}

		catch (ArithmeticException e) {
			System.out.println("Anything divide by Zero Cannot Perform");

		}

	}
}


