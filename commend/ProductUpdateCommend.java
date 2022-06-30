package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.ProductDao;

public class ProductUpdateCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("바꿀 상품판매가격(8)");
		int saleno = scn.nextInt();
		
		System.out.println("바꿀 할인가격(8)");
		int pcost = scn.nextInt();
		
		System.out.println("바꿀 재고량(4)");
		int amount = scn.nextInt();
		
		System.out.println("바꿀 상품원가(8)");
		int price = scn.nextInt();
		
		System.out.println("바꿀 상품고유번호(채소A001,4)");
		String pcode = scn.next();
		
		System.out.println("바꿀 상품입고 날짜:20000107");
		String sdate = scn.next();
		
		System.out.println("조건 상품번호(6, 기존)");
		int custno = scn.nextInt();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.update(custno, saleno, pcost, amount, price, pcode, sdate);
		
		if (rs !=1 ) {
			System.out.println("상품변경 실패");
		} else {
			System.out.println("상품변경 성공");
		}
	}

}
