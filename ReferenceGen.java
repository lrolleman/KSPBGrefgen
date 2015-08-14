
public class ReferenceGen {
	
	
	public static void main(String[] args) {
		for (Planet planet : Config.planets) {
			if (planet.equals(Config.planets[3]))
				continue;
			System.out.println("Fuel from Kerbin to " + planet.getName() + " orbit: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Cost ccost1 = Config.planets[3].fuelToOrbit(planet, i, 1);
				Cost ccost2 = Config.planets[3].fuelToOrbit(planet, i, 2);
				
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (ccost1 != null) {
					Integer cost1 = ccost1.fuelCost();
					Integer tankcost = ccost1.tankCost();
					System.out.format("%15d(%d) ", cost1, tankcost);
				} else
					System.out.format("%15s ", "Impossible");
				if (ccost2 != null) {
					Integer cost2 = ccost2.fuelCost();
					Integer tankcost = ccost2.tankCost();
					System.out.format("%15d(%d)\n", cost2, tankcost);
				} else
					System.out.format("%15s\n", "Impossible");
			}
			int timetocomplete = (int) Math.ceil(((double) Config.planets[3].distanceTo(planet)+1)/Config.MPT);
			System.out.format("\t%15s %14d\n\n", "Turns to complete: ", timetocomplete);
		}
		for (Moon moon : Config.moons) {
			System.out.println("Fuel from Kerbin to " + moon.getName() + " orbit: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Cost ccost1 = Config.planets[3].fuelToOrbit(moon, i, 1);
				Cost ccost2 = Config.planets[3].fuelToOrbit(moon, i, 2);
				
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (ccost1 != null) {
					Integer cost1 = ccost1.fuelCost();
					Integer tankcost = ccost1.tankCost();
					System.out.format("%15d(%d) ", cost1, tankcost);
				} else
					System.out.format("%15s ", "Impossible");
				if (ccost2 != null) {
					Integer cost2 = ccost2.fuelCost();
					Integer tankcost = ccost2.tankCost();
					System.out.format("%15d(%d)\n", cost2, tankcost);
				} else
					System.out.format("%15s\n", "Impossible");
			}
			int timetocomplete = (int) Math.ceil(((double) Config.planets[3].distanceTo(moon)+1)/Config.MPT);
			System.out.format("\t%15s %14d\n\n", "Turns to complete: ", timetocomplete);
		}
		System.out.println();
		for (Planet planet : Config.planets) {
			if (planet.equals(Config.planets[3]))
				continue;
			System.out.println("Fuel from Kerbin to " + planet.getName() + " with landing: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Cost ccost1 = Config.planets[3].fuelToLand(planet, i, 1);
				Cost ccost2 = Config.planets[3].fuelToLand(planet, i, 2);
				
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (ccost1 != null) {
					Integer cost1 = ccost1.fuelCost();
					Integer tankcost = ccost1.tankCost();
					System.out.format("%15d(%d) ", cost1, tankcost);
				} else
					System.out.format("%15s ", "Impossible");
				if (ccost2 != null) {
					Integer cost2 = ccost2.fuelCost();
					Integer tankcost = ccost2.tankCost();
					System.out.format("%15d(%d)\n", cost2, tankcost);
				} else
					System.out.format("%15s\n", "Impossible");
			}
			int timetocomplete = (int) Math.ceil(((double) Config.planets[3].distanceTo(planet)+2)/Config.MPT);
			System.out.format("\t%15s %14d\n\n", "Turns to complete: ", timetocomplete);
		}
		for (Moon moon : Config.moons) {
			System.out.println("Fuel from Kerbin to " + moon.getName() + " with landing: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Cost ccost1 = Config.planets[3].fuelToLand(moon, i, 1);
				Cost ccost2 = Config.planets[3].fuelToLand(moon, i, 2);
				
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (ccost1 != null) {
					Integer cost1 = ccost1.fuelCost();
					Integer tankcost = ccost1.tankCost();
					System.out.format("%15d(%d) ", cost1, tankcost);
				} else
					System.out.format("%15s ", "Impossible");
				if (ccost2 != null) {
					Integer cost2 = ccost2.fuelCost();
					Integer tankcost = ccost2.tankCost();
					System.out.format("%15d(%d)\n", cost2, tankcost);
				} else
					System.out.format("%15s\n", "Impossible");
			}
			int timetocomplete = (int) Math.ceil(((double) Config.planets[3].distanceTo(moon)+2)/Config.MPT);
			System.out.format("\t%15s %14d\n\n", "Turns to complete: ", timetocomplete);
		}
		System.out.println();
		for (Planet planet : Config.planets) {
			if (planet.equals(Config.planets[3]))
				continue;
			System.out.println("Fuel from Kerbin to " + planet.getName() + " and return: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Cost ccost1 = Config.planets[3].fuelRoundTrip(planet, i, 1);
				Cost ccost2 = Config.planets[3].fuelRoundTrip(planet, i, 2);
				
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (ccost1 != null) {
					Integer cost1 = ccost1.fuelCost();
					Integer tankcost = ccost1.tankCost();
					System.out.format("%15d(%d) ", cost1, tankcost);
				} else
					System.out.format("%15s ", "Impossible");
				if (ccost2 != null) {
					Integer cost2 = ccost2.fuelCost();
					Integer tankcost = ccost2.tankCost();
					System.out.format("%15d(%d)\n", cost2, tankcost);
				} else
					System.out.format("%15s\n", "Impossible");
			}
			int timetocomplete = (int) Math.ceil(((double) Config.planets[3].distanceTo(planet)*2+4)/Config.MPT);
			System.out.format("\t%15s %14d\n\n", "Turns to complete: ", timetocomplete);
		}
		for (Moon moon : Config.moons) {
			System.out.println("Fuel from Kerbin to " + moon.getName() + " and return: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Cost ccost1 = Config.planets[3].fuelRoundTrip(moon, i, 1);
				Cost ccost2 = Config.planets[3].fuelRoundTrip(moon, i, 2);
				
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (ccost1 != null) {
					Integer cost1 = ccost1.fuelCost();
					Integer tankcost = ccost1.tankCost();
					System.out.format("%15d(%d) ", cost1, tankcost);
				} else
					System.out.format("%15s ", "Impossible");
				if (ccost2 != null) {
					Integer cost2 = ccost2.fuelCost();
					Integer tankcost = ccost2.tankCost();
					System.out.format("%15d(%d)\n", cost2, tankcost);
				} else
					System.out.format("%15s\n", "Impossible");
			}
			int timetocomplete = (int) Math.ceil(((double) Config.planets[3].distanceTo(moon)*2+4)/Config.MPT);
			System.out.format("\t%15s %14d\n\n", "Turns to complete: ", timetocomplete);
		}
	}

}
