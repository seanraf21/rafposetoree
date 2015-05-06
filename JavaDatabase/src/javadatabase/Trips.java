package javadatabase;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Trips extends JFrame{
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private JTextArea train, departure, arrival; 
    public Trips(){
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        
        
    }
}
