package lessons.lightbot;

import jlm.lesson.Lesson;
import universe.bugglequest.Direction;

public class Board04Stairs extends LightBotExercise {

	public Board04Stairs(Lesson lesson) {
		super(lesson);
				
		/* Create initial situation */
		LightBotWorld myWorld = new LightBotWorld("Mars", 8, 8);
		
		new LightBotEntity(myWorld, "D2R2", 1, 2, Direction.EAST);

		myWorld.setHeight(3,2,1);
		myWorld.setHeight(4,2,2);
		for (int i=2;i<8;i++)
			myWorld.setHeight(5,i,2);
		myWorld.addLight(5, 7);
		
		setup(myWorld);
	}
}
