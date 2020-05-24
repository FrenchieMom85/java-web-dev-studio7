package org.launchcode.studio7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        HashMap<Integer,String> songs = new HashMap<>();
        songs.put(1, "Get low");
        songs.put(2, "Pony");
        songs.put(3, "Like a G6");
        songs.put(4, "Twerkulator");

        HashMap<Integer,String> scenes = new HashMap<>();
        scenes.put(1, "Baby shark do doo do do doo");
        scenes.put(2, "Mommy shark do doo do do doo");
        scenes.put(3, "Daddy shark do doo do do doo");
        scenes.put(4, "Grandpa shark do doo do do doo");

        // TODO: Declare and initialize a CD and a DVD object.
        CD funkyTown = new CD("Booty shaking remix", "CD", 737, songs);
        DVD babyShark = new DVD("Baby Shark: Making parents ears bleed", "DVD", 4.7, scenes);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        funkyTown.spinDisc();
        funkyTown.writeDisc();
        System.out.println(funkyTown.getName());
        System.out.println(funkyTown.getDiscType());
        System.out.println(funkyTown.getCapacity());
        System.out.println(funkyTown.readDisc());

        babyShark.spinDisc();
        babyShark.writeDisc();
        System.out.println(babyShark.getName());
        System.out.println(babyShark.getDiscType());
        System.out.println(babyShark.getCapacity());
        System.out.println(babyShark.readDisc());


    }
}
