package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.MemberDao;

public class MemberDeleteCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �� ��ȣ(����)");
		int memberno = scn.nextInt();
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.deleteDo(memberno);
		
		if (rs !=1 ) {
			System.out.println("������ ����");
		} else {
			System.out.println("������ ����");
		}
	}

}
