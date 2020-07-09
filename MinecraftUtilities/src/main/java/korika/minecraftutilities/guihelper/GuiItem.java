package korika.minecraftutilities.guihelper;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.lang.reflect.Method;
import java.util.Arrays;

public class GuiItem extends ItemStack {

    private int position;
    Method method = getMethod();

    public GuiItem(final Material material, final String name, final String... lore) {
        this.setAmount(1);
        this.setType(material);
        final ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        this.setItemMeta(meta);
    }


    public GuiItem(final Material material, final String name, Method method, final String... lore) {
        this.setAmount(1);
        this.setType(material);
        final ItemMeta meta = this.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        this.setItemMeta(meta);
        this.method = method;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
