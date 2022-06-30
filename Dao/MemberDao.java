package org.java.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.project.product.dbconnect.DBConnect;
import org.project.product.dto.MemberDto;

public class MemberDao {
	// single tone
	private static final MemberDao INSTANCE = new MemberDao();

	private MemberDao() {
		System.out.println("MemberDao");
	}

	public static MemberDao getInstance() {
		return INSTANCE;
	}

	// insert
	// int memberno -> sequence
	public int insertDo(String userName, String userPhone, String addr, String inDay, String grade, String city) {
		int rs = 0;
		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "insert into member0630 values(sequence_member.NEXTVAL, ?, ?, ?, ?, ?, ?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userName);
			pstm.setString(2, userPhone);
			pstm.setString(3, addr);
			pstm.setString(4, inDay);
			pstm.setString(5, grade);
			pstm.setString(6, city);

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
			} finally {

			}
		}

		return rs;
	}

	// select
	public ArrayList<MemberDto> list() {
		ArrayList<MemberDto> lists = new ArrayList<MemberDto>();

		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";
		ResultSet rs = null;

		try {
			conn = DBConnect.getConnect();
			query = "select * from member0630";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			while (rs.next()) {
				int memberno = rs.getInt(1);
				String userName = rs.getString(2);
				String userPhone = rs.getString(3);
				String addr = rs.getString(4);
				String inDay = rs.getString(5);
				String grade = rs.getString(6);
				String city = rs.getString(7);

				lists.add(new MemberDto(memberno, userName, userPhone, addr, inDay, grade, city));
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

	// update
	public int updateDo(int memberno, String userName, String userPhone, String addr, String inDay, String grade,
			String city) {
		int rs = 0;
		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "update member0630 set userName =? , userPhone =? , addr =? , inDay =? , grade =? , city =? where memberno = ?";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, userName);
			pstm.setString(2, userPhone);
			pstm.setString(3, addr);
			pstm.setString(4, inDay);
			pstm.setString(5, grade);
			pstm.setString(6, city);
			pstm.setInt(7, memberno);

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

	// delete
	public int deleteDo(int memberno) {
		int rs = 0;
		PreparedStatement pstm = null;
		Connection conn = null;
		String query = "";

		try {
			conn = DBConnect.getConnect();
			query = "delete from member0630 where memberno = ?";
			pstm = conn.prepareStatement(query);

			pstm.setInt(1, memberno);

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
