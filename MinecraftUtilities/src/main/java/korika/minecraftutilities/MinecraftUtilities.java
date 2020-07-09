package korika.minecraftutilities;

import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftUtilities extends JavaPlugin {

    public static JavaPlugin MUPlugin;

    @Override
    public void onEnable() {
        MUPlugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
