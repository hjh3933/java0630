package org.project.product.commend;

import java.util.ArrayList;

import org.java.Dao.ProductDao;
import org.project.product.dto.ProductDto;

public class ProductSelectCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();

		ProductDao dao = ProductDao.getInstance();
		ArrayList<ProductDto> products = dao.list();

		// for each
		for (ProductDto product : products) {
			int custno = product.getCustno();
			int saleno = product.getSaleno();
			int pcost = product.getPcost();
			int amount = product.getAmount();
			int price = product.getPrice();
			String pcode = product.getPcode();
			String sdate = product.getSdate();

			System.out.println("상품번호: " + custno + ", 상품판매가격: " + saleno + ", 할인액: " + pcost + ", 재고: " + amount
					+ ", 상품원가: " + price + ", 상품고유번호: " + pcode + ", 상품입고날짜: " + sdate);
		}
		
	}

}
