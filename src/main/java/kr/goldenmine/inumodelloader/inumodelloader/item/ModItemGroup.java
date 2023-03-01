package kr.goldenmine.inumodelloader.inumodelloader.item;

import kr.goldenmine.inumodelloader.inumodelloader.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class ModItemGroup {
    public static final ItemGroup TUTORIAL_TAB = new ItemGroup("tutorial_tab") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.TITANIUM_INGOT.get());
        }
    };

    public static final ItemGroup INU_MODELS_TAB = new ItemGroup("inu_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.INU_ITEM.get());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
//            List<Item> registryItems = new ArrayList<Item>();
//            for(Item item : Registry.ITEM) {
//                registryItems.add(item);
//            }
//
//            registryItems.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
//
//            for(Item item : registryItems) {
//                item.fillItemGroup(this, items);
//            }

            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_SIGNS_TAB = new ItemGroup("Signs") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.TALL_INU_DOOR_BLOCK.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_KMS_TAB = new ItemGroup("KimMiSeong_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.KMS_572TABLE.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_LIS_TAB = new ItemGroup("LeeInSeong_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.LEEINSEONG_SOFA.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_KDH_TAB = new ItemGroup("KimDongHwi_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.KDH_REFRIGERATOR.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_LSJ_TAB = new ItemGroup("LeeSeJin_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.LEESEJIN_TV.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_OYJ_TAB = new ItemGroup("OhYeJin_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.OHYEJIN_BUCKET.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_LJY_TAB = new ItemGroup("LeeJunYong_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.LEEJUNYONG_OVEN_1.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_KJH_TAB = new ItemGroup("KimJeongHyun_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.KJH_TRASH.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_BSY_TAB = new ItemGroup("BSY_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.BSY_LOCKER.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_BMJ_TAB = new ItemGroup("BaeMinJun_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.BMJ_LAB1.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_PEH_TAB = new ItemGroup("ParkEunha_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.EUNHA_ELECTRONICS_SHELVES_1.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_GHS_TAB = new ItemGroup("GoHyunSeo_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.GOHYUNSEO_ANNEALING.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_SYW_TAB = new ItemGroup("SonYeWon_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.YEWON_SINK2.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };

    public static final ItemGroup INU_JSY_TAB = new ItemGroup("JeonSoYeon_models") {
        @NotNull
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.JSY_DESK.get().asItem());
        }

        @Override
        public void fill(@NotNull NonNullList<ItemStack> items) {
            super.fill(items);
            items.sort(Comparator.comparing(o -> o.getItem().getName().toString()));
        }
    };
}
