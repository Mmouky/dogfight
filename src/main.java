import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.model.DogFightModel;
import jpu2016.dogfight.view.DogfightView;

public class main {

	public static void main(String[] args) {
		final DogFightModel dogfightModel = new DogFightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
		dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
	}

}
