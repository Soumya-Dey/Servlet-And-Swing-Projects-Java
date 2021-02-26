package com.javatpoint.dao;
import java.sql.*;
public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
                Class.forName("com.mysql.jdbc.Driver");
		//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
                con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/test","soumya","itsmemysql12345");
	}catch(Exception ex){System.out.println(ex);}
	return con;
}
}
