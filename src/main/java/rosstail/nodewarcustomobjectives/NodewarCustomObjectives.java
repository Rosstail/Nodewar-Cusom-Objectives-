package rosstail.nodewarcustomobjectives;

import fr.rosstail.nodewar.Nodewar;
import fr.rosstail.nodewar.territory.zonehandlers.objective.ObjectiveManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class NodewarCustomObjectives extends JavaPlugin {


    @Override
    public void onLoad() {
        super.onLoad();
        if (Bukkit.getServer().getPluginManager().getPlugin("Nodewar") != null) {
            Nodewar nodewar = getNodewarPlugin();
            if (nodewar != null) {
                ObjectiveManager objectiveManager = nodewar.getObjectiveManager();
                objectiveManager.addCustomObjectiveType("football", FootballObjective.class);
            }
        }
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private Nodewar getNodewarPlugin() {
        final Plugin plugin = this.getServer().getPluginManager().getPlugin("Nodewar");
        if (!(plugin instanceof Nodewar)) {
            return null;
        }
        return (Nodewar) plugin;
    }
}
