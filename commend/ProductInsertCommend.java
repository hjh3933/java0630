package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.ProductDao;

public class ProductInsertCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("상품번호(6)");
		int custno = scn.nextInt();
		
		System.out.println("상품판매가격(8)");
		int saleno = scn.nextInt();
		
		System.out.println("할인가격(8)");
		int pcost = scn.nextInt();
		
		System.out.println("재고량(4)");
		int amount = scn.nextInt();
		
		System.out.println("상품원가(8)");
		int price = scn.nextInt();
		
		System.out.println("상품고유번호(채소A001,4)");
		String pcode = scn.next();
		
		System.out.println("상품입고 날짜:20000107");
		String sdate = scn.next();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.insertDo(custno, saleno, pcost, amount, price, pcode, sdate);
		
		if (rs !=1 ) {
			System.out.println("상품등록 실패");
		} else {
			System.out.println("상품등록 성공");
		}
	}

}
