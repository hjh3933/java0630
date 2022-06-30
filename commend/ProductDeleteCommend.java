package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.ProductDao;

public class ProductDeleteCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("삭제할 상품번호(6, 기존)");
		int custno = scn.nextInt();
		
		ProductDao dao = ProductDao.getInstance();
		int rs = dao.deleteDo(custno);
				
		if (rs !=1 ) {
			System.out.println("상품삭제 실패");
		} else {
			System.out.println("상품삭제 성공");
		}
	}

}
