package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.ProductDao;

public class ProductInsertCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("��ǰ��ȣ(6)");
		int custno = scn.nextInt();
		
		System.out.println("��ǰ�ǸŰ���(8)");
		int saleno = scn.nextInt();
		
		System.out.println("���ΰ���(8)");
		int pcost = scn.nextInt();
		
		System.out.println("�����(4)");
		int amount = scn.nextInt();
		
		System.out.println("��ǰ����(8)");
		int price = scn.nextInt();
		
		System.out.println("��ǰ������ȣ(ä��A001,4)");
		String pcode = scn.next();
		
		System.out.println("��ǰ�԰� ��¥:20000107");
		String sdate = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.insertDo(custno, saleno, pcost, amount, price, pcode, sdate);
		
		if (rs !=1 ) {
			System.out.println("��ǰ��� ����");
		} else {
			System.out.println("��ǰ��� ����");
		}
	}

}