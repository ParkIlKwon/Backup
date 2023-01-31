package RPG;

interface fire {

	abstract void effect(Unit u);
	
	/**
	 * 
	 */
}

interface water{
	
	abstract void effect(Unit u);
	
}

interface sand{
	int counter = 0;
	abstract void effect(Unit u);
	
}
