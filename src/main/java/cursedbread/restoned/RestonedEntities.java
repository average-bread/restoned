package cursedbread.restoned;

import cursedbread.restoned.tileentities.TileEntityCustomFurnace;
import cursedbread.restoned.tileentities.TileEntityCustomSensor;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.EntityHelper;

public class RestonedEntities {
	public void initilizeEntities(){
		EntityHelper.createTileEntity(TileEntityCustomSensor.class, NamespaceID.getPermanent(RestonedMain.MOD_ID, "custom.sensor"));
		EntityHelper.createTileEntity(TileEntityCustomFurnace.class, NamespaceID.getPermanent(RestonedMain.MOD_ID, "custom.furnace"));
	}
}
