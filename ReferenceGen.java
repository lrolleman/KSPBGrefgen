
public class ReferenceGen {
	
	
	public static void main(String[] args) {
		for (Planet planet : Config.planets) {
			if (planet.equals(Config.planets[3]))
				continue;
			System.out.println("Fuel from Kerbin to " + planet.getName() + " orbit: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Integer cost1 = Config.planets[3].fuelToOrbit(planet, i, 1);
				Integer cost2 = Config.planets[3].fuelToOrbit(planet, i, 2);
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (cost1 != null)
					System.out.format("%15d ", cost1);
				else
					System.out.format("%15s ", "Impossible");
				if (cost2 != null)
					System.out.format("%15d\n", cost2);
				else
					System.out.format("%15s\n", "Impossible");
			}
			System.out.println();
		}
		for (Moon moon : Config.moons) {
			System.out.println("Fuel from Kerbin to " + moon.getName() + " orbit: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Integer cost1 = Config.planets[3].fuelToOrbit(moon, i, 1);
				Integer cost2 = Config.planets[3].fuelToOrbit(moon, i, 2);
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (cost1 != null)
					System.out.format("%15d ", cost1);
				else
					System.out.format("%15s ", "Impossible");
				if (cost2 != null)
					System.out.format("%15d\n", cost2);
				else
					System.out.format("%15s\n", "Impossible");
			}
			
			System.out.println();
		}
		System.out.println();
		for (Planet planet : Config.planets) {
			if (planet.equals(Config.planets[3]))
				continue;
			System.out.println("Fuel from Kerbin to " + planet.getName() + " with landing: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Integer cost1 = Config.planets[3].fuelToLand(planet, i, 1);
				Integer cost2 = Config.planets[3].fuelToLand(planet, i, 2);
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (cost1 != null)
					System.out.format("%15d ", cost1);
				else
					System.out.format("%15s ", "Impossible");
				if (cost2 != null)
					System.out.format("%15d\n", cost2);
				else
					System.out.format("%15s\n", "Impossible");
			}
			System.out.println();
		}
		for (Moon moon : Config.moons) {
			System.out.println("Fuel from Kerbin to " + moon.getName() + " with landing: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Integer cost1 = Config.planets[3].fuelToLand(moon, i, 1);
				Integer cost2 = Config.planets[3].fuelToLand(moon, i, 2);
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (cost1 != null)
					System.out.format("%15d ", cost1);
				else
					System.out.format("%15s ", "Impossible");
				if (cost2 != null)
					System.out.format("%15d\n", cost2);
				else
					System.out.format("%15s\n", "Impossible");
			}
			System.out.println();
		}
		System.out.println();
		for (Planet planet : Config.planets) {
			if (planet.equals(Config.planets[3]))
				continue;
			System.out.println("Fuel from Kerbin to " + planet.getName() + " and return: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Integer cost1 = Config.planets[3].fuelRoundTrip(planet, i, 1);
				Integer cost2 = Config.planets[3].fuelRoundTrip(planet, i, 2);
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (cost1 != null)
					System.out.format("%15d ", cost1);
				else
					System.out.format("%15s ", "Impossible");
				if (cost2 != null)
					System.out.format("%15d\n", cost2);
				else
					System.out.format("%15s\n", "Impossible");
			}
			System.out.println();
		}
		for (Moon moon : Config.moons) {
			System.out.println("Fuel from Kerbin to " + moon.getName() + " and return: ");
			for (int i=1; i<=Config.tanksperstage.length; i++) {
				Integer cost1 = Config.planets[3].fuelRoundTrip(moon, i, 1);
				Integer cost2 = Config.planets[3].fuelRoundTrip(moon, i, 2);
				System.out.format("\t%15s %d: ", "Tech Level", i);
				if (cost1 != null)
					System.out.format("%15d ", cost1);
				else
					System.out.format("%15s ", "Impossible");
				if (cost2 != null)
					System.out.format("%15d\n", cost2);
				else
					System.out.format("%15s\n", "Impossible");
			}
			System.out.println();
		}
	}

}
