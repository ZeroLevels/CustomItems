package me.otho.customItems.mod.items;

import me.otho.customItems.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CustomItem extends Item {
	
	private boolean glows = false;
	
    public CustomItem(int stackSize) {
        super();        
        this.setMaxStackSize(stackSize);
    }

    @Override
    public String getUnlocalizedName() {
        return super.getUnlocalizedName();
    }
    
    @SideOnly(Side.CLIENT)
    @Deprecated
    public boolean hasEffect(ItemStack p_77636_1_)
    {
        return glows;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {    	
    	itemIcon = iconRegister.registerIcon(Reference.MOD_ID.toLowerCase() + ":" + this.iconString);
    }
    
    public void setGlows(boolean value){
    	this.glows = value;
    }

}