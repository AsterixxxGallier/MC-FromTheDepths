package com.wuest.from_the_depths.EntityInfo;

import net.minecraft.nbt.NBTTagCompound;

public class BossAddInfo extends BossInfo
{
	public int spawnFrequency;
	public int totalSpawnDuration;
	
	public BossAddInfo()
	{
		super();
	}
	
	public BossAddInfo(BossAddInfo oldInstance)
	{
		super(oldInstance);
		this.spawnFrequency = oldInstance.spawnFrequency;
		this.totalSpawnDuration = oldInstance.totalSpawnDuration;
	}
	
	public void writeToNBT(NBTTagCompound tag)
	{
		super.writeToNBT(tag);
		
		tag.setInteger("spawnFrequency", this.spawnFrequency);
		tag.setInteger("totalSpawnDuration", this.totalSpawnDuration);
	}
	
	public static BossAddInfo CreateFromNBT(NBTTagCompound tag)
	{
		BossAddInfo returnValue = new BossAddInfo();
		
		if (tag.hasKey("domain"))
		{
			returnValue.domain = tag.getString("domain");
		}
		
		if (tag.hasKey("name"))
		{
			returnValue.name = tag.getString("name");
		}
		
		if (tag.hasKey("nbtData"))
		{
			returnValue.nbtData = tag.getCompoundTag("nbtData");
		}
		
		if (tag.hasKey("spawnFrequency"))
		{
			returnValue.spawnFrequency = tag.getInteger("spawnFrequency");
		}
		
		if (tag.hasKey("totalSpawnDuration"))
		{
			returnValue.totalSpawnDuration = tag.getInteger("totalSpawnDuration");
		}
		
		return returnValue;
	}
}