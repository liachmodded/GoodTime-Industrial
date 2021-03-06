/*
 * This file is part of GoodTime-Industrial, licensed under MIT License (MIT).
 *
 * Copyright (c) 2015 GoodTime Studio <https://github.com/GoodTimeStudio>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.mcgoodtime.productionline.common.items.tools;


import com.mcgoodtime.productionline.common.core.ProductionLine;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.IIcon;

import static com.mcgoodtime.productionline.common.core.ProductionLine.*;

/**
 * Created by suhao on 2015.7.19.
 *
 * @author suhao
 */
public class ToolPL {

    public static Item registerPickaxe(ToolMaterial toolMaterial, String name) {
        return new Pickaxe(toolMaterial, name);
    }

    public static Item registerAxe(ToolMaterial toolMaterial, String name) {
        return new Axe(toolMaterial, name);
    }

    public static Item registerSpade(ToolMaterial toolMaterial, String name) {
        return new Spade(toolMaterial, name);
    }

    public static Item registerSword(ToolMaterial toolMaterial, String name) {
        return new Sword(toolMaterial, name);
    }

    private static void registerItem(String name, Item item) {
        item.setUnlocalizedName(MOD_NAME + "." + name);
        item.setTextureName(RESOURCE_DOMAIN + ":" + "item" + name);
        item.setCreativeTab(creativeTabGti);
        GameRegistry.registerItem(item, name, MOD_NAME);
    }

    private static IIcon registerIcon(IIconRegister iconRegister, Item item) {
        String unlocalizedName = item.getUnlocalizedName();
        return iconRegister.registerIcon(ProductionLine.RESOURCE_DOMAIN + ":" + "tools/item" + unlocalizedName.substring(unlocalizedName.lastIndexOf(".") + 1));
    }

    private static class Pickaxe extends ItemPickaxe {
        private Pickaxe(ToolMaterial toolMaterial, String name) {
            super(toolMaterial);
            registerItem(name, this);
        }

        @Override
        public void registerIcons(IIconRegister iconRegister) {
            this.itemIcon = registerIcon(iconRegister, this);
        }
    }

    private static class Axe extends ItemAxe {
        private Axe(ToolMaterial toolMaterial, String name) {
            super(toolMaterial);
            registerItem(name, this);
        }

        @Override
        public void registerIcons(IIconRegister iconRegister) {
            this.itemIcon = registerIcon(iconRegister, this);
        }
    }

    private static class Spade extends ItemSpade {
        private Spade(ToolMaterial toolMaterial, String name) {
            super(toolMaterial);
            registerItem(name, this);
        }

        @Override
        public void registerIcons(IIconRegister iconRegister) {
            this.itemIcon = registerIcon(iconRegister, this);
        }
    }

    private static class Sword extends ItemSword {
        private Sword(ToolMaterial toolMaterial, String name) {
            super(toolMaterial);
            registerItem(name, this);
        }

        @Override
        public void registerIcons(IIconRegister iconRegister) {
            this.itemIcon = registerIcon(iconRegister, this);
        }
    }
}



