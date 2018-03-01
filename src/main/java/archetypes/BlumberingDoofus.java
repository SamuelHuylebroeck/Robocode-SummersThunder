package archetypes;

import robocode.Robot;

import java.awt.*;

/**
 * Created by Samuel on 28/02/2018.
 */
public class BlumberingDoofus implements IArchetype{
    private Robot robo;

    public BlumberingDoofus(Robot newRobo){
        this.robo = newRobo;
        robo.setBodyColor(Color.GREEN);
    }
    public void initialize() {

    }

    public void run() {
        robo.ahead(100);
        robo.back(100);
    }
}
