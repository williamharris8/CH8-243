PHASE 1 - Made a registry that uses HashMap to store species and populations. A user can type in new names and it will show its population. This works better than ArrayList bcause each species name points straight to its count and grow as new species are found.

PHASE 2 - Used containsKey for checking if the species was already logged. If so used put to save the count plus one, but first time added it with count of one. Figured out you have to add sightings.txt to projects main folder not src.

PHASE 3 - I looped throught the registry with keySet to find which species had highest count and lowest then printed both. Finding max and min gets slower as more species would be added.