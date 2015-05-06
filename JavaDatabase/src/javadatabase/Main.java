package javadatabase;

import javax.swing.*;
public class Main {
    public static void main(String[] args){
        JFrame conn = new Connector();
        conn.setSize(400,400);
        conn.setTitle("Tirian Trains Trip Selector");
        conn.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        conn.setResizable(false);
	conn.setVisible(true);
    }   
}
