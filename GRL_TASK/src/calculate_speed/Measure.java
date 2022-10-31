package calculate_speed;

import java.util.ArrayList;

public class Measure{


	public void calculateSpeed(UserInput uiObject) {

		ArrayList<Dataset>dsArray =uiObject.fetchDataSetArray();

		for (int i = 0; i< dsArray.size();i++) {

			//speed = distance/time

			dsArray.get(i).setDsSpeed(dsArray.get(i).getDsDistance()/dsArray.get(i).getDsTime());

		}

	}

}
