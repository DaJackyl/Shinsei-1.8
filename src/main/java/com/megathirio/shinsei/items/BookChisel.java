package com.megathirio.shinsei.items;

import com.megathirio.shinsei.core.ShinseiTabs;
import com.megathirio.shinsei.guis.GuiChiselBook;
import com.megathirio.shinsei.guis.GuiPickaxeBook;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BookChisel extends Item{
    public BookChisel(String name){
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName(name);
        this.setCreativeTab(ShinseiTabs.TOOLS_TAB);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn){
        if (!worldIn.isRemote)
        {
            Minecraft.getMinecraft().displayGuiScreen(
                    new GuiChiselBook());
        }
        return itemStackIn;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
        return stack;
    }

    @Override
    public boolean hasContainerItem(ItemStack itemstack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        itemstack.attemptDamageItem(0, this.itemRand);
        return itemstack;
    }

}
