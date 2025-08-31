package com.hehcrashes.gtmorehard.common.block.blockClass;

import static com.hehcrashes.gtmorehard.common.GTCMCreativeTabs.tabMetaBlock01;
import static com.hehcrashes.gtmorehard.common.block.blockClass.BlockStaticDataClientOnly.iconsBlockMap01;
import static com.hehcrashes.gtmorehard.common.block.blockClass.ItemBlockBase01.MetaBlockMap01;
import static com.hehcrashes.gtmorehard.util.TextHandler.texter;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBase01 extends Block {

    // region Constructors
    protected BlockBase01(Material materialIn) {
        super(materialIn);
    }

    public BlockBase01() {
        this(Material.iron);
        this.setCreativeTab(tabMetaBlock01);
    }

    public BlockBase01(String unlocalizedName, String localName) {
        this();
        this.unlocalizedName = unlocalizedName;
        texter(localName, "blockBase01." + unlocalizedName + ".name");
    }

    // endregion
    // -----------------------
    // region member variables

    private String unlocalizedName;

    private IIcon blockIcon;

    // endregion
    // -----------------------
    // region getters

    @Override
    public String getUnlocalizedName() {
        return this.unlocalizedName;
    }

    // endregion
    // -----------------------
    // region setters

    public void setUnlocalizedName(String aUnlocalizedName) {
        this.unlocalizedName = aUnlocalizedName;
    }

    // endregion
    // -----------------------
    // region Overrides
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return meta < iconsBlockMap01.size() ? iconsBlockMap01.get(meta) : iconsBlockMap01.get(0);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg) {
        this.blockIcon = reg.registerIcon("gtmorehard:MetaBlocks/0");
        for (int Meta : MetaBlockMap01.keySet()) {
            iconsBlockMap01.put(Meta, reg.registerIcon("gtmorehard:MetaBlocks/" + Meta));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item aItem, CreativeTabs aCreativeTabs, List list) {
        for (int Meta : MetaBlockMap01.keySet()) {
            list.add(new ItemStack(aItem, 1, Meta));
        }
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public boolean canBeReplacedByLeaves(IBlockAccess world, int x, int y, int z) {
        return false;
    }

    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity) {
        return false;
    }

    @Override
    public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z) {
        return false;
    }

    // endregion
}
