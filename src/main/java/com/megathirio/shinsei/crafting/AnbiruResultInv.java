package com.megathirio.shinsei.crafting;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;

public class AnbiruResultInv implements IInventory{
    private final ItemStack[] stackResult = new ItemStack[1];

    // Returns the number of slots in the inventory.
    @Override
    public int getSizeInventory() {
        return 1;
    }

    //Returns the stack in slot
    @Override
    public ItemStack getStackInSlot(int slot) {
        return stackResult[slot];
    }

    /*
     Removes from an inventory slot (slot) up to a specified number
     (qty) of items and returns them in a new stack.
    */
    @Override
    public ItemStack decrStackSize(int slot, int qty) {
        if(stackResult[slot] != null){
            ItemStack itemStack = stackResult[slot];
            stackResult[slot] = null;
            return itemStack;
        }else{
            return null;
        }
    }


    /*
     When some containers are closed they call this on each slot, then drop
     whatever it returns as an EntityItem - like when you close a workbench
     GUI.
    */
    @Override
    public ItemStack getStackInSlotOnClosing(int slot) {
        if(stackResult[slot] != null){
            ItemStack itemStack = stackResult[slot];
            stackResult[slot] = null;
            return itemStack;
        }else{
            return null;
        }
    }

    /*
     Sets the given item stack to the specified slot in the inventory (can be
     crafting or armor sections).
    */
    @Override
    public void setInventorySlotContents(int slot, ItemStack itemStack) {
        stackResult[slot] = itemStack;
    }

    /**
     Returns the maximum stack size for a inventory slot. Seems to always be
     64, possibly will be extended.
    */
    @Override
    public int getInventoryStackLimit() {
        return 64;
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }

    @Override
    public void openInventory(EntityPlayer player) {

    }

    @Override
    public void closeInventory(EntityPlayer player) {

    }

    @Override
    public boolean isItemValidForSlot(int slot, ItemStack itemStack) {
        return true;
    }

    @Override
    public int getField(int id) {
        return 0;
    }

    @Override
    public void setField(int id, int value) {

    }

    @Override
    public int getFieldCount() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean hasCustomName() {
        return false;
    }

    @Override
    public IChatComponent getDisplayName() {
        return null;
    }

    public boolean isEmpty(){
        for(int i = 0; i < stackResult.length; i++){
            if(stackResult[i] != null)
                return false;
        }
        return true;
    }

/*
    @Override
    public String getCommandSenderName(){
        return "AnbiruResult";
    }
*/
}