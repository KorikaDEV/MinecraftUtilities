package de.minecraftutilities.guihelper;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public abstract class Gui implements Listener {

    String name;

    private Inventory inv;

    public Gui (){
        inv = Bukkit.createInventory(null, 9, "Test");
        inv.addItem(new GuiItem(Material.DIAMOND_SWORD, "Example Sword","1", ",22", "333"));
    }

    public void openGui(final HumanEntity entity) {
        entity.openInventory(this.inv);
    }

    @EventHandler
    public void onInventoryClick(final InventoryClickEvent clickEvent) {
        if (clickEvent.getInventory() != inv) return;

        clickEvent.setCancelled(true);

        final ItemStack clickedItem = clickEvent.getCurrentItem();

        if (clickedItem == null || clickedItem.getType() == Material.AIR) return;

        final Player player = (Player)clickEvent.getWhoClicked();
        player.sendMessage("Slot" + clickEvent.getRawSlot());
    }

    @EventHandler
    public void onInventoryClick(final InventoryDragEvent dragEvent) {
        if (dragEvent.getInventory() == inv) {
            dragEvent.setCancelled(true);
        }
    }
}
