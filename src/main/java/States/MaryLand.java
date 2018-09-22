package main.java.States;

public class MaryLand extends State {
    MaryLand() { /* null constructor */ }

    public void printMe() { System.out.println("Maryland.");
    }
        public static void main(String[] args) {
            Region mid = new State();
            State md = new MaryLand();
            Object obj = new Place();
            Place usa = new Region();
            md.printMe(); // Maryland
        mid.printMe(); // State
        ((Place) obj).printMe(); // Place
        obj = md;  // obj nüüd MaryLand
        ((MaryLand) obj).printMe(); // Maryland
        obj = usa; // obj MaryLand läheb nüüd Region... Widening casting
        ((Place) obj).printMe();
        usa = md;

        ((Place) usa).printMe();
    }
}

class State extends Region {
    State() { /* null constructor */ }
    public void printMe() { System.out.println("State."); }
    }

    class Region extends Place {
        Region() { /* null constructor */ }
        public void printMe() { System.out.println("Region.");
        }
    }

    class Place extends Object {
        Place() { /* null constructor */ }
        public void printMe() { System.out.println("Place.");
        }
    }


