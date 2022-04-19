/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.satu;

import java.sql.*;
public class KONEKSI {
    static final String driver = "Com.mysql.jdbc.Driver";
    static final String uri= "jdbc:mysql://localhost/penjualan";
    static final String user="root";
    static final String upass="";
    static Connection conn;
    static Statement stat;
    
    public static void KONEKSI () {
        try{
        Class.forName(driver);
        Conn=DriverManager.getConnection(uri, user, upass);
            System.out.println("projek2,KONEKSI.konek()");
        } catch(Exception e){
            System.out.println("koneksi gagal");
        }
}
    public static void main(String[] args) {
        konek();
    }
}