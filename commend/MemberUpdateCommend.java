package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.MemberDao;

public class MemberUpdateCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("�ٲ� ���̸�");
		String userName = scn.next();
		
		System.out.println("�ٲ� ����ȭ");
		String userPhone = scn.next();
		
		System.out.println("�ٲ� ���ּ�");
		String addr = scn.next();
		
		System.out.println("�ٲ� �� ���Գ�¥");
		String inDay = scn.next();
		
		System.out.println("�ٲ� �� ���(A,B,C)");
		String grade = scn.next();
		
		System.out.println("�ٲ� �� �����(01,02, ...");
		String city = scn.next();
		
		System.out.println("���� �� ��ȣ");
		int memberno = scn.nextInt();
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.updateDo(memberno, userName, userPhone, addr, inDay, grade, city);
		
		if (rs !=1 ) {
			System.out.println("������ ����");
		} else {
			System.out.println("������ ����");
		}
	}

}
