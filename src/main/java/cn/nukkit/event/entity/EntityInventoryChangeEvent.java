package cn.nukkit.event.entity;

import cn.nukkit.entity.Entity;
import cn.nukkit.event.Cancellable;
import cn.nukkit.event.HandlerList;
import cn.nukkit.item.Item;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class EntityInventoryChangeEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlers() {
        return handlers;
    }

    private Item oldItem;
    private Item newItem;
    private int slot;

    public EntityInventoryChangeEvent(Entity entity, Item oldItem, Item newItem, int slot) {
        this.entity = entity;
        this.oldItem = oldItem;
        this.newItem = newItem;
    }

    public int getSlot() {
        return slot;
    }

    public Item getNewItem() {
        return newItem;
    }

    public void setNewItem(Item newItem) {
        this.newItem = newItem;
    }

    public Item getOldItem() {
        return oldItem;
    }
}