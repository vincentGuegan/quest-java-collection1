import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list

    Hero  captain  =  new  Hero("Captain America", 100);
    Hero  vision  =  new  Hero("Vision", 3);
    Hero  iron  =  new  Hero("Iron Man", 48);
    Hero  witch  =  new  Hero("Scarlet Witch", 29);
    Hero  thor  =  new  Hero("Thor", 1500);
    Hero  spider  =  new  Hero("Spider-Man", 18);
    Hero  hulk  =  new  Hero("Hulk", 49);
    Hero  strange  =  new  Hero("Doctor Strange", 42);

        // TODO 2 : Add those heroes to the list

        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Spider-Man, age: 18
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42

        ArrayList<Hero> heroes  =  new  ArrayList();

        heroes.add(captain);
        heroes.add(vision);
        heroes.add(iron);
        heroes.add(witch);
        heroes.add(thor);
        heroes.add(spider);
        heroes.add(hulk);
        heroes.add(strange);

        // TODO 3 : It's Thor birthday, now he's 1501

        thor.setAge(1501);

        // TODO 4 : Shuffle the heroes list

        Collections.shuffle(heroes);

        // TODO 5 : Keep only the half of the list

        heroes.remove(1);
        heroes.remove(2);
        heroes.remove(3);
        heroes.remove(4);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        System.out.println("Remaining heroes : "  +  heroes.size());
        
        for (Hero  hero  : heroes) { // iterate though the list
        System.out.println(hero.getName());
        }
    }
}