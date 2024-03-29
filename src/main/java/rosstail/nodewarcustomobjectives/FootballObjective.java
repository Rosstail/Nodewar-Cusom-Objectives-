package rosstail.nodewarcustomobjectives;

import fr.rosstail.nodewar.empires.Empire;
import fr.rosstail.nodewar.territory.zonehandlers.Territory;
import fr.rosstail.nodewar.territory.zonehandlers.objective.Objective;

public class FootballObjective extends Objective {
    public FootballObjective(Territory territory) {
        super(territory);
        System.out.println("FOOTBAAAAALL " + territory.getName());
    }

    @Override
    public Empire checkNeutralization() {
        return null;
    }

    @Override
    public Empire checkWinner() {
        return null;
    }

    @Override
    public String getName() {
        return "Football";
    }
}
