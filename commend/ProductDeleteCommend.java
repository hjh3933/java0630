package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.ProductDao;

public class ProductDeleteCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("������ ��ǰ��ȣ(6, ����)");
		int custno = scn.nextInt();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.deleteDo(custno);
				
		if (rs !=1 ) {
			System.out.println("��ǰ���� ����");
		} else {
			System.out.println("��ǰ���� ����");
		}
	}

}
