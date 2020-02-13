package com.nmbrookes;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark attacks the town.";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens attack earth";
    }
}

class DirtyDancing extends Movie {
    public DirtyDancing() {
        super("DirtyDancing");
    }

    @Override
    public String plot() {
        return "A young girl falls in love with a dance tutor";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try and take over the universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }

    // No plot overriding
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " " + movie.getName());
            System.out.println("Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated = " + random);
        switch(random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new DirtyDancing();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
