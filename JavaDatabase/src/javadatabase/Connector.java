package javadatabase;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Connector extends JFrame {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private JLabel day, start, end;
    private JComboBox date, origin, destination;
    private JButton search;
    public Connector(){
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        
        day = new JLabel("Travel Date");
        c.add(day);
        
        date = new JComboBox();
        c.add(date);
        
        start = new JLabel("Origin");
        c.add(start);
        
        origin = new JComboBox();
        c.add(origin);
        
        end = new JLabel("Destination");
        c.add(end);
        
        destination = new JComboBox();
        c.add(destination);
        
                
        search = new JButton("Search");
        search.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //display a table with all select statements matching the fields in comboboxes
            }
        });
        c.add(search);
        
        String url = "jdbc:mysql://localhost/tirianDB";
        String user = "root";
        String password = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
        }
        catch(Exception e){
            System.out.println("Error. "+e);
        }
        
        origin.addItem("Allies Enclave");
        origin.addItem("Beavers Dam");
        origin.addItem("The Wardrobe");
        origin.addItem("The Lamp Post");
        destination.addItem("Allies Enclave");
        destination.addItem("Beavers Dam");
        destination.addItem("The Wardrobe");
        destination.addItem("The Lamp Post");
    }
    
    public void getData(){
        String query;
        try{
            query = "select * from trip";//select statement here
            rs = st.executeQuery(query);//this executes statement
            while(rs.next()){//populate comboboxes
                String orig = rs.getString("origin");//specify column in string
                String dest = rs.getString("destination");
                
                origin.addItem(orig);
                destination.addItem(dest);
            }
            query = "select * from ticket";
            while(rs.next()){
                
            }                      
        }catch(Exception e){
            System.out.println("Error. "+e);
        }
    }
    
    public void displayData(){
        String query;
        try{
            query = "select * from trip where origin=" +origin.getSelectedItem()
                    + " AND destination=" +destination.getSelectedItem() 
                    + " AND trip_date =" +date.getSelectedItem();
            rs = st.executeQuery(query);
            while(rs.next()){
                
            }
            
        }catch(Exception e){
            System.out.println("Error. "+ e);
        }
    }
    
    public void insertData(){
        String insert; //put insert query here
        try{ 
            insert = "insert into customer"
                    + " (customer_id, last_name, given_name, middle_initial, birthday, gender) "
                    + "values";//fill with actual values from comboboxes
            st.executeUpdate(insert); //inserts data
                 
        }catch(Exception e){
            System.out.println("Error. "+ e);
        }
    }
}
