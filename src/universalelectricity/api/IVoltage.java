package universalelectricity.api;

import net.minecraftforge.common.ForgeDirection;

/**
 * @author Calclavia
 * 
 */
public interface IVoltage
{

	/**
	 * Gets the voltage of this TileEntity.
	 * 
	 * @return The amount of volts. E.g 120v or 240v
	 */
	public int getVoltage(ForgeDirection direction);
}