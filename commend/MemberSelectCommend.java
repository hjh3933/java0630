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
			
			System.out.println("����ȣ: " + memberno + ", ���̸�: " + userName + ", ����ȭ��ȣ: " + userPhone + ", ���ּ���: " + addr
					+ ", ����������: " + inDay + ", �����: " + grade + ", �������: " + city);
		}
		
	}

}
