package org.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.project.product.dbconnect.DBConnect;
import org.project.product.dto.ProductDto;

public class ProductDao {
	// ΩÃ±€≈Ê
	private static final ProductDao INSTANCE = new ProductDao();

	private ProductDao() {
	}

	public static ProductDao getInstance() {
		return INSTANCE;
	}

	// insert
	public int insertDo(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		int rs = 0;

		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "insert into product_0630 values(?, ?, ?, ?, ?, ?, ?)";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, custno);
			pstm.setInt(2, saleno);
			pstm.setInt(3, pcost);
			pstm.setInt(4, amount);
			pstm.setInt(5, price);
			pstm.setString(6, pcode);
			pstm.setString(7, sdate);

			rs = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;

	}

	// select
	public ArrayList<ProductDto> list() {
		ArrayList<ProductDto> lists = new ArrayList<ProductDto>();

		PreparedStatement pstm = null;
		Connection conn = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "select * from product_0630";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();

			while (rs.next()) {
				int custno = rs.getInt(1);
				int saleno = rs.getInt(2);
				int pcost = rs.getInt(3);
				int amount = rs.getInt(4);
				int price = rs.getInt(5);
				String pcode = rs.getString(6);
				String sdate = rs.getString(7);

				lists.add(new ProductDto(custno, saleno, pcost, amount, price, pcode, sdate));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}

		}

		return lists;
	}

	public int update(int custno, int saleno, int pcost, int amount, int price, String pcode, String sdate) {
		int rs = 0;
		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "update product_0630 set saleno = ?, pcost = ?, amount = ?, price = ?, pcode = ?, sdate = ? where custno = ?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, saleno);
			pstm.setInt(2, pcost);
			pstm.setInt(3, amount);
			pstm.setInt(4, price);
			pstm.setString(5, pcode);
			pstm.setString(6, sdate);
			pstm.setInt(7, custno);

			rs = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rs;
	}

	public int deleteDo(int custno) {
		int rs = 0;
		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "delete from product_0630 where custno = ?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, custno);

			rs = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rs;
	}

}
