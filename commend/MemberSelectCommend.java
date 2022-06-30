package org.project.product.commend;

import java.util.ArrayList;

import org.java.Dao.MemberDao;
import org.project.product.dto.MemberDto;


public class MemberSelectCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();

		MemberDao dao = MemberDao.getInstance();
		ArrayList<MemberDto> lists = dao.list();

		// for each
		for (MemberDto list : lists) {
			int memberno = list.getMemberno();
			String userName = list.getUserName();
			String userPhone = list.getUserPhone();
			String addr = list.getAddr();
			String inDay = list.getInDay();
			String grade = list.getGrade();
			String city = list.getCity();
			
			System.out.println("고객번호: " + memberno + ", 고객이름: " + userName + ", 고객전화번호: " + userPhone + ", 고객주소지: " + addr
					+ ", 고객가입일자: " + inDay + ", 고객등급: " + grade + ", 고객출신지: " + city);
		}
		
	}

}
