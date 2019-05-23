package com.adityaeka.listhero;

import java.util.ArrayList;
import java.util.List;

public class HeroData {


    public static List<Hero> heroes;

    static {
        heroes = new ArrayList<>();
        heroes.add(new Hero("Iron Man", "Tony Stark", "https://upload.wikimedia.org/wikipedia/en/thumb/e/e0/Iron_Man_bleeding_edge.jpg/250px-Iron_Man_bleeding_edge.jpg", "Iron Man gets his superpowers from his metallic suit of armor and other technologies invented by his alter ego Tony Stark. Tony is a genius engineer and wealthy owner of a technology company. Tony built the Iron Man suit when he was kidnapped and suffered an injury to his heart."));
        heroes.add(new Hero("Captain America", "Steve Rogers","https://cdn.britannica.com/s:500x350/30/182830-004-61C7794A.jpg", "Captain America has agility, strength, speed, endurance, and reaction time superior to any Olympic athlete who ever competed. The Super-Soldier formula that he has metabolized has enhanced all of his bodily functions to the peak of human efficiency."));
        heroes.add(new Hero("Black Panther", "T'Challa", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9f/Black_Panther_OS_Vol_1_2.png/250px-Black_Panther_OS_Vol_1_2.png", "the Panther is entitled to consume a special heart-shaped herb which, in addition to his mystical, shamanistic connection with the Wakandan Panther God Bast, grants him superhumanly acute senses, enhanced strength, speed, agility, stamina, durability, healing, and reflexes."));
        heroes.add(new Hero("Spider-Man", "Peter Parker", "https://cdn1.theyoungfolks.com/wp-content/uploads/2018/09/24221936/d9676dfa2ff201c2ff93cec12d42ead8.jpg", "Spider-Man has spider-like abilities including superhuman strength and the ability to cling to most surfaces. He is also extremely agile and has amazing reflexes. Spider-Man also has a “spider sense,” that warns him of impending danger. Spider-Man has supplemented his powers with technology."));

    }


    public static ArrayList<Hero> getHeroes() {
        return (ArrayList<Hero>) heroes;
    }
}
