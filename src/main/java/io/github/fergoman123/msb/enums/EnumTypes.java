package io.github.fergoman123.msb.enums;

import net.minecraft.util.IStringSerializable;

public class EnumTypes {
	
	public enum Skull implements IStringSerializable {
		blockSkullSkeleton(0, "blockSkullSkeleton"),
	    blockSkullWither(1, "blockSkullWither"),
	    blockSkullZombie(2, "blockSkullZombie"),
	    blockSkullCreeper(3, "blockSkullCreeper");

	    private int meta;
	    private String name;

	    Skull(int meta, String name){
	        this.meta = meta;
	        this.name = name;
	    }

	    public String getName(){return this.name;}
	    public String toString(){return this.getName();}
	    public int getMeta(){return meta;}
	}
	
	public enum Seeds implements IStringSerializable{
		blockWheatSeeds(0, "blockWheatSeeds"),
	    blockPumpkinSeeds(1, "blockPumpkinSeeds"),
	    blockMelonSeeds(2, "blockMelonSeeds");

	    private int meta;
	    private String name;

	    Seeds(int meta, String name){
	    	this.meta = meta;
	    	this.name = name;
	    }

	    public String getName(){return this.name;}
	    public String toString(){return getName();}
	    public int getMeta()
	    {
	        return this.meta;
	    }
	}
	
	public enum Rabbit implements IStringSerializable{
		blockRawRabbit(0, "blockRawRabbit"),
	    blockCookedRabbit(1, "blockCookedRabbit");
		
		private int meta;
		private String name;
		
		Rabbit(int meta, String name){
			this.meta = meta;
			this.name = name;
		}
		
		public int getMeta() {
	        return meta;
	    }

	    @Override
	    public String toString() {
	        return getName();
	    }

	    @Override
	    public String getName() {
	        return name;
	    }
	}
	
	public enum Porkchop implements IStringSerializable{

	    blockRawPorkchop(0, "blockRawPorkchop"),
	    blockCookedPorkchop(1, "blockCookedPorkchop");

	    private int meta;
	    private String name;

	    Porkchop(int meta, String name){
	        this.meta = meta;
	        this.name = name;
	    }

	    public int getMeta() {
	        return meta;
	    }

	    @Override
	    public String toString() {
	        return getName();
	    }

	    @Override
	    public String getName() {
	        return name;
	    }
	}
	
	public enum Mutton implements IStringSerializable{
		blockRawMutton(0, "blockRawMutton"),
	    blockCookedMutton(1, "blockCookedMutton");

	    private int meta;
	    private String name;

	    Mutton(int meta, String name){
	        this.meta = meta;
	        this.name = name;
	    }

	    public int getMeta() {
	        return meta;
	    }

	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return getName();
	    }
	}
	
	public enum GoldApple implements IStringSerializable{
		blockGoldApple1(0, "blockGoldApple1"),
		blockGoldApple2(1, "blockGoldApple2");
		
		private int meta;
		private String name;
		
		GoldApple(int meta, String name) {
			this.meta = meta;
			this.name = name;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getMeta() {
			return meta;
		}

		@Override
		public String toString() {
			return getName();
		}		
	}
	
	public enum Dye implements IStringSerializable{
		blockInkSack(0, "blockInkSack"),
	    blockRoseRed(1, "blockRoseRed"),
	    blockCactusGreen(2, "blockCactusGreen"),
	    blockCocoa(3, "blockCocoa"),
	    blockPurpleDye(4, "blockPurpleDye"),
	    blockCyanDye(5, "blockCyanDye"),
	    blockSilverDye(6, "blockSilverDye"),
	    blockGrayDye(7, "blockGrayDye"),
	    blockPinkDye(8, "blockPinkDye"),
	    blockLimeDye(9, "blockLimeDye"),
	    blockYellowDye(10, "blockYellowDye"),
	    blockLightBlueDye(11, "blockLightBlueDye"),
	    blockMagentaDye(12, "blockMegentaDye"),
	    blockOrangeDye(13, "blockOrangeDye"),
	    blockWhiteDye(14, "blockWhiteDye");

	    private int meta;
	    private String name;

	    Dye(int meta, String name){
	        this.meta = meta;
	        this.name = name;
	    }

	    public String getName(){return this.name;}
	    public String toString(){return getName();}
	    public int getMeta(){return this.meta;}
	}
	
	public enum Fish implements IStringSerializable{
		blockRawFish(0, "blockRawFish"),
	    blockRawSalmon(1, "blockRawSalmon"),
	    blockClownfish(2, "blockClownfish"),
	    blockPufferfish(3, "blockPufferfish"),
	    blockCookedFish(4, "blockCookedFish"),
	    blockCookedSalmon(5, "blockCookedSalmon");

	    private int meta;
	    private String name;

	    Fish(int meta, String name){
	        this.meta = meta;
	        this.name = name;
	    }

	    @Override
	    public String getName() {
	        return this.name;
	    }

	    @Override
	    public String toString() {
	        return this.getName();
	    }

	    public int getMeta()
	    {
	        return this.meta;
	    }
	}
	
	public enum Beef implements IStringSerializable{
		blockRawBeef(0, "blockRawBeef"),
	    blockCookedBeef(1, "blockCookedBeef");

	    private int meta;
	    private String name;

	    Beef(int meta, String name){
	        this.meta = meta;
	        this.name = name;
	    }

	    public int getMeta(){
	        return meta;
	    }

	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return this.getName();
	    }
	}
}
