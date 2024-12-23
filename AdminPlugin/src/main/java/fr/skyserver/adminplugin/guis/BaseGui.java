package fr.skyserver.adminplugin.guis;

import fr.mrmicky.fastinv.InventoryScheme;
import fr.mrmicky.fastinv.ItemBuilder;
import fr.mrmicky.fastinv.PaginatedFastInv;
import org.bukkit.Material;

public class BaseGui extends PaginatedFastInv {

    private static final InventoryScheme SCHEME = new InventoryScheme()
            .mask(" 1111111 ")
            .mask(" 1111111 ")
            .bindPagination('1');

    public BaseGui() {
        super(3*9, "Admin Selector");

        previousPageItem(20, p -> new ItemBuilder(Material.ARROW).name("Page " + p + "/" + lastPage()).build());
        nextPageItem(24, p -> new ItemBuilder(Material.ARROW).name("Page " + p + "/" + lastPage()).build());
        setItem(26, new ItemBuilder(Material.BARRIER).name("Close").build(),
                e -> e.getWhoClicked().closeInventory());
    }

    @Override // Optional method to handle the page change event if needed
    protected void onPageChange(int page) {
        // Called after the page change
        setItem(18, new ItemBuilder(Material.PAPER).name("Current page " + page).build());
    }
}
