package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.ProductDao;

public class ProductUpdateCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�ٲ� ��ǰ�ǸŰ���(8)");
		int saleno = scn.nextInt();
		
		System.out.println("�ٲ� ���ΰ���(8)");
		int pcost = scn.nextInt();
		
		System.out.println("�ٲ� ���(4)");
		int amount = scn.nextInt();
		
		System.out.println("�ٲ� ��ǰ����(8)");
		int price = scn.nextInt();
		
		System.out.println("�ٲ� ��ǰ������ȣ(ä��A001,4)");
		String pcode = scn.next();
		
		System.out.println("�ٲ� ��ǰ�԰� ��¥:20000107");
		String sdate = scn.next();
		
		System.out.println("���� ��ǰ��ȣ(6, ����)");
		int custno = scn.nextInt();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.update(custno, saleno, pcost, amount, price, pcode, sdate);
		
		if (rs !=1 ) {
			System.out.println("��ǰ���� ����");
		} else {
			System.out.println("��ǰ���� ����");
		}
	}

}
