
public class Config {
	public final static int MPT = 2;
	public final static Integer[] tankcostperstage = {
		1,
		2,
		3
	};
	public final static Integer[] tanksperstage = {
		//2,
		3
		//4,
		//4
	};
	
	public final static Planet[] planets = {
		new Planet("Kerbol", 0, 0, false),
		new Planet("Moho", 1, 0, true),
		new Planet("Eve", 2, 2, true),
		new Planet("Kerbin", 3, 1, true),
		new Planet("Duna", 4, 1, true),
		new Planet("Dres", 5, 0, true),
		new Planet("Jool", 6, 0, false),
		new Planet("Eeloo", 7, 0, true)
	};
	
	public final static Moon[] moons = {
		new Moon("Gilly", planets[2], 1, 0),
		new Moon("Mun", planets[3], 1, 0),
		new Moon("Minmus", planets[3], 2, 0),
		new Moon("Ike", planets[4], 1, 0),
		new Moon("Laythe", planets[6], 1, 1),
		new Moon("Vall", planets[6], 2, 0),
		new Moon("Tylo", planets[6], 3, 0),
		new Moon("Bop", planets[6], 4, 0),
		new Moon("Pol", planets[6], 5, 0)
	};
	
}
