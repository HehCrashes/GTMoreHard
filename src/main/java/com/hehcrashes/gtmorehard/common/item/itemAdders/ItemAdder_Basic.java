package com.hehcrashes.gtmorehard.common.item.itemAdders;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.hehcrashes.gtmorehard.util.TextHandler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAdder_Basic extends Item {

    private List<String> tooltips = new ArrayList<>();

    private String unlocalizedName;

    public ItemAdder_Basic(String Name, String MetaName, CreativeTabs aCreativeTabs/* , String aIconPath */) {
        super();
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setUnlocalizedName(generateUnlocalizedName(MetaName));
        TextHandler.texter(Name, this.unlocalizedName + ".name");
        this.setCreativeTab(aCreativeTabs);
        // this.iconPath = aIconPath;

        // GameRegistry.registerItem(this, MetaName);
    }
    // public ItemAdder_Basic(String Name, String MetaName, int Meta){
    // super();
    // setHasSubtypes(true);
    // setMaxDamage(0);
    // setUnlocalizedName(MetaName);
    // TextHandler.texter(Name,generateUnlocalizedName(MetaName));
    //
    // GameRegistry.registerItem(this, MetaName);

    // }

    public static String generateUnlocalizedName(String MetaName) {
        return "item." + MetaName;
    }

    @Override
    public int getMetadata(int aMeta) {
        return aMeta;
    }

    @Override
    public Item setUnlocalizedName(String aUnlocalizedName) {
        this.unlocalizedName = aUnlocalizedName;
        return this;
    }

    //
    //
    @Override
    public String getUnlocalizedName(ItemStack aItemStack) {
        return this.unlocalizedName + "." + aItemStack.getItemDamage();
    }

    public String getUnlocalizedName() {
        return this.unlocalizedName;
    }

    // @Override
    // @SideOnly(Side.CLIENT)
    // public void registerIcons(IIconRegister iconRegister) {
    // icon = iconRegister.registerIcon(this.iconPath);
    // }
    // @Override
    // public IIcon getIconFromDamage(int aMetaData) {
    // return icon;
    // }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item aItem, CreativeTabs aCreativeTabs, List aList) {
        aList.add(new ItemStack(aItem, 1, 0));
    }

    @SideOnly(Side.CLIENT)
    @SuppressWarnings({ "unchecked" })
    public void addInformation(ItemStack aItemStack, EntityPlayer aEntityPlayer, List aTooltipsList,
        boolean p_77624_4_) {
        if (tooltips.size() > 0) {
            aTooltipsList.addAll(tooltips);
        }
    }

}
