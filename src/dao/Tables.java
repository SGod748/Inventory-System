/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Godwi
 */
public class Tables {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try{
            conn = ConnectionProvider.getCon();
            st = conn.createStatement();
            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT)primary key, userRole varchar(50), name varchax(200), mobilenumber varchar(50), email varchar(200),password varchar(50), address varchar(200), status varchar(50)");
        } catch(Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }finally {
            try{
                conn.close();
                st.close();
            } catch (Exception e){
                
            }
        }
    }
}
