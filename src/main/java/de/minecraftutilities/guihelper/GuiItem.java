package de.minecraftutilities.guihelper;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class GuiItem extends ItemStack {

    public GuiItem(final Material material, final String name, final String... lore) {
        this.setAmount(1);
        this.setType(material);
        final ItemMeta meta = this.getItemMeta();

        meta.setDisplayName(name);

        meta.setLore(Arrays.asList(lore));

        this.setItemMeta(meta);
    }

}
