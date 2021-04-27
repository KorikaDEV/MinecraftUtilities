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
    private final Inventory inv;

    public Gui (String guiName, String invName, int size){
        this.name = guiName;
        inv = Bukkit.createInventory(null, size, invName);
        inv.addItem(new GuiItem(Material.DIAMOND_SWORD, "Example Sword","1", ",22", "333"));
    }

    public void addItem(ItemStack itemStack, int position) {
        if (itemStack instanceof GuiItem) {
//            Method method = ((GuiItem) itemStack).method;
        }
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
        if(clickedItem instanceof GuiItem && ((GuiItem) clickedItem).getCallable() != null) {
            try {
                ((GuiItem)clickedItem).getCallable().call();
            } catch (Exception e) {

            }
            player.sendMessage("Slot" + clickEvent.getRawSlot());
        }


    }

    @EventHandler
    public void onInventoryClick(final InventoryDragEvent dragEvent) {
        if (dragEvent.getInventory() == inv) {
            dragEvent.setCancelled(true);
        }
    }
}
