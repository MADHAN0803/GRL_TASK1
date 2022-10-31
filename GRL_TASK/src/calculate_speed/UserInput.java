package calculate_speed;

import java.util.ArrayList;

public class UserInput {

	ArrayList<Dataset> DatasetArray = new ArrayList<>();



	public void insertDataSet(Dataset dsObject) {

		this.DatasetArray.add(dsObject);

	}

	public ArrayList<Dataset> fetchDataSetArray(){
		return DatasetArray;

	}


}
