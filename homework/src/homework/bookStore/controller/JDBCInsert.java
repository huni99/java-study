package homework.bookStore.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import homework.bookStore.model.Book;


public class JDBCInsert {
	private Connection conn;
	private PreparedStatement psmt;
	private Statement stmt;
	private ResultSet rs;
	
	private String url = "jdbc:mysql://127.0.0.1:3306/library_project";
	private String id = "root";
	private String pw = "mysql1234";
	
	public JDBCInsert() {
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB연결 성공");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB연결 실패");
		}
	}
	
	public void insert(String strType,Book book) {
		String str = "INSERT INTO book(isbn,type,price)"+
					"VALUES(?,?,?)";
		try {
			psmt= conn.prepareStatement(str);
			psmt.setString(1, book.getIsbn());
			psmt.setString(2, strType);
			psmt.setInt(3,book.getPrice() );
			psmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("삽입 예외 발생");
			e.printStackTrace();
		}
		
	}
	
	
}
