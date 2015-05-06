/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sean
 */
public class Hero {
    String type;
    String[] skills;
    public Hero(String type, String[] skills){
        this.type = type;
        this.skills = skills;
        
    }
    public void addSkill(String skill){
        if(skills[skills.length-1] != null){
            for(int i=0; i<skills.length; i++){
                if(skills[i]==null){
                    skills[i] = skill;
                    break;
                }
            }
        }
        else{
            System.out.println("Skills are full, bobo");
        }
    }
    
    public String getType(){
        return type;
    }
    
    public String attack(int i){
        return type + " Attacking with "+ skills[i];
    }
    public String block(int i){
        return type + " Blocking with "+ skills[i];
    }
}
