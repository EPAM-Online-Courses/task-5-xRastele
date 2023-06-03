package efs.task.collections.data;

import efs.task.collections.entity.Hero;
import efs.task.collections.entity.Town;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DataProvider {

    public static final String DATA_SEPARATOR = ",";

    // TODO Utwórz listę miast na podstawie tablicy Data.baseTownsArray.
    //  Tablica zawiera String zawierający nazwę miasta oraz dwie klasy bohatera związane z tym miastem oddzielone przecinkami.
    //  Korzystając z funkcji split() oraz stałej DATA_SEPARATOR utwórz listę obiektów klasy efs.task.collections.entities.Town.
    //  Funkcja zwraca listę obiektów typu Town ze wszystkimi dziewięcioma podstawowymi miastami.
    public List<Town> getTownsList() {
        List<Town> townsList = new ArrayList<>();

        for (String line : Data.baseTownsArray) {
            String[] splittedLine = line.split(DATA_SEPARATOR);

            List<String> heroClassesList = new ArrayList<>();
            heroClassesList.add(splittedLine[1].trim());
            heroClassesList.add(splittedLine[2].trim());

            townsList.add(new Town(splittedLine[0].trim(), heroClassesList));
        }

        return townsList;
    }

    //TODO Analogicznie do getTownsList utwórz listę miast na podstawie tablicy Data.DLCTownsArray
    public List<Town> getDLCTownsList() {
        List<Town> dlcTownsList = new ArrayList<>();

        for (String line : Data.dlcTownsArray) {
            String[] splittedLine = line.split(DATA_SEPARATOR);

            List<String> heroClassesList = new ArrayList<>();
            heroClassesList.add(splittedLine[1].trim());
            heroClassesList.add(splittedLine[2].trim());

            dlcTownsList.add(new Town(splittedLine[0].trim(), heroClassesList));
        }

        return dlcTownsList;
    }

    //TODO Na podstawie tablicy Data.baseCharactersArray utworzyć listę bohaterów dostępnych w grze.
    // Tablica Data.baseCharactersArray zawiera oddzielone przecinkiem imie bohatera, klasę bohatera.
    // Korzystając z funkcji split() oraz DATA_SEPARATOR utwórz listę unikalnych obiektów efs.task.collections.entities.Hero.
    // UWAGA w Data.baseCharactersArray niektórzy bohaterowie powtarzają się, do porównania bohaterów używamy zarówno imie jak i jego klasę;
    public Set<Hero> getHeroesSet() {
        Set<Hero> heroesSet = new HashSet<>();

        for (String line : Data.baseCharactersArray) {
            String[] splittedLine = line.split(DATA_SEPARATOR);

            Hero hero = new Hero(splittedLine[0].trim(), splittedLine[1].trim());
            heroesSet.add(hero);
        }

        return heroesSet;
    }

    //TODO Analogicznie do getHeroesSet utwórz listę bohaterów na podstawie tablicy Data.DLCCharactersArray
    public Set<Hero> getDLCHeroesSet() {
        Set<Hero> dlcHeroesSet = new HashSet<>();

        for (String line : Data.dlcCharactersArray) {
            String[] splittedLine = line.split(DATA_SEPARATOR);

            Hero hero = new Hero(splittedLine[0].trim(), splittedLine[1].trim());
            dlcHeroesSet.add(hero);
        }

        return dlcHeroesSet;
    }
}
