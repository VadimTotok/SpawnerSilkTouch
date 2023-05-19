package spigot.spawnersilktouch.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreak implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        ItemStack item = event.getPlayer().getInventory().getItemInMainHand();

        if (block.getType() == Material.SPAWNER && item.getEnchantmentLevel(Enchantment.SILK_TOUCH) < 0) {
            event.setExpToDrop(0);

            ItemStack spawner = new ItemStack(Material.SPAWNER);
            event.getPlayer().getInventory().addItem(spawner);
        }
    }
}
