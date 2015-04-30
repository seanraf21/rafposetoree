/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean
 */
import java.util.Scanner;
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String[] skills = {"bash", "kick", "fireball"};
        Hero war = new Warrior("Strength",skills);
        Hero mag = new Mage("Intelligence", skills);
        Hero dru = new Druid("Agility", skills);
        Hero loc = new Warlock("Cunning", skills);
        Hero hun = new Hunter("Dexterity", skills);
        Hero[] heroes = {war,mag,dru,loc,hun};
        
        System.out.println("Select a hero. Enter a number from 0 to 4. Enter 5 to exit");
        int hero = in.nextInt();
        double skill1 = Math.random() * 2;
        double skill2 = Math.random() * 2;
        System.out.println("You've chosen " +heroes[hero].getType());
        System.out.println(heroes[hero].attack((int)skill1));
        System.out.println(heroes[hero].block((int)skill2));
    }
}