package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.MemberDao;

public class MemberInsertCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���̸�");
		String userName = scn.next();
		
		System.out.println("����ȭ");
		String userPhone = scn.next();
		
		System.out.println("���ּ�");
		String addr = scn.next();
		
		System.out.println("�� ���Գ�¥");
		String inDay = scn.next();
		
		System.out.println("�� ���(A,B,C)");
		String grade = scn.next();
		
		System.out.println("�� �����(01,02, ...");
		String city = scn.next();
		
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.insertDo(userName, userPhone, addr, inDay, grade, city);
		
		if (rs !=1 ) {
			System.out.println("����� ����");
		} else {
			System.out.println("����� ����");
		}
	}

}
