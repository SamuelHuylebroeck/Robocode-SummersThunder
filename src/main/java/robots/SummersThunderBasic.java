package robots;

import archetypes.BlumberingDoofus;
import archetypes.IArchetype;
import robocode.Robot;

import java.awt.*;

/**
 * Created by Samuel on 28/02/2018.
 */
public class SummersThunderBasic extends Robot {

    IArchetype currentArcheType;

    public SummersThunderBasic(){
        super();

        this.currentArcheType = new BlumberingDoofus(this);
        currentArcheType.initialize();
    }

    public void run(){
        currentArcheType.run();

    }


}
