package de.minecraftutilities.guihelper;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;


public class GuiItem extends ItemStack {

    private int position;
    private Callable<Void> callable;

    public GuiItem(final Material material, final String name, final String... lore) {
        this.setAmount(1);
        this.setType(material);
        final ItemMeta meta = this.getItemMeta();
        Objects.requireNonNull(meta).setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        this.setItemMeta(meta);
    }

    public GuiItem(final Material material, final String name, Callable<Void> callable, final String... lore) {
        this.setAmount(1);
        this.setType(material);
        final ItemMeta meta = this.getItemMeta();
        Objects.requireNonNull(meta).setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        this.setItemMeta(meta);
        this.callable = callable;
    }

    public Callable<Void> getCallable() {
        return callable;
    }

    public void setCallable(Callable<Void> callable) {
        this.callable = callable;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
