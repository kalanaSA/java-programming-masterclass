package com.company;

/* Polymorphism is really the method or the mechanism in object oriented programming, that allows actions to act differently
   based on the actual object that the action is being perform on. it really enable write quite generic code.
 * in here we're create classes all within this main class/main.js source file. which is another way of creating classes
   that aren't going to be reused. if the classes are quite small & compact we can create in the same java source file.
   but multiple big classes in same single java file gets quite confusing. in here only the class that have java source
   filename can have access modifier.  */
class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    //    public Jaws(String name) {
    //       super(name);
    //     }
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lot of people";
    }

}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "kids finds way to ge out from maze";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
    //no plot method.
}

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            //2. so randomMovie() method returns Movie object(but actually has sub class object of Movie class), so we have to
            //access it using Movie class reference. *access sub class objects using super class reference called polymorphism.
            Movie movie = randomMovie();
            System.out.println("Movie #" +
                    i + " : " + movie.getName() + "\n" +
                    "Plot : " + movie.plot() + "\n");
        }
    }

    /*1. we're returning the base class Movie object as a common return type for all these returning sub class objects. because of
         course all these classes actually inherit from Movie. that's why we can use that once to apply to all these classes.
         without using polymorphism you have to figure out a way to decide what the type of class was, and then somehow call appropriate
         class. so you'd probably have a large switch statement with, if class equals this name, then call this particular method.    */
    public static Movie randomMovie() {
        //Math.random() return random double number greater than or equal o & less than 1.(0-0.99999...)
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("generated random number = " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws(); //return new Jaws("Jaws");
            //break statement redundant in here, because method with return type will stop executing anything after return something.
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            //default:
            //  return null;
        }
        return null;
    }

}
