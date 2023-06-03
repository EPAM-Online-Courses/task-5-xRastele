package efs.task.collections.entity;

import java.util.List;
import java.util.Objects;

public class Town {
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    //TODO implementacja metody equal porównująca obiekty Town na podstawie tylko townName.
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Town)) {
            return false;
        }

        Town other = (Town) o;
        return townName.equals(other.townName);
    }

    //TODO implementacja metody equal biorąca pod uwagę tylko townName.
    @Override
    public int hashCode() {
        return Objects.hash(this.townName);
    }

    @Override
    public String toString() {
        return "Miasto :" + townName;
    }
}
