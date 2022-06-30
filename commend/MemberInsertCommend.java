package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.MemberDao;

public class MemberInsertCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("고객이름");
		String userName = scn.next();
		
		System.out.println("고객전화");
		String userPhone = scn.next();
		
		System.out.println("고객주소");
		String addr = scn.next();
		
		System.out.println("고객 가입날짜");
		String inDay = scn.next();
		
		System.out.println("고객 등급(A,B,C)");
		String grade = scn.next();
		
		System.out.println("고객 출신지(01,02, ...");
		String city = scn.next();
		
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insertDo(userName, userPhone, addr, inDay, grade, city);
		
		if (rs !=1 ) {
			System.out.println("고객등록 실패");
		} else {
			System.out.println("고객등록 성공");
		}
	}

}
