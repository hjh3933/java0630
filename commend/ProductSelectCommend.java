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

			System.out.println("��ǰ��ȣ: " + custno + ", ��ǰ�ǸŰ���: " + saleno + ", ���ξ�: " + pcost + ", ���: " + amount
					+ ", ��ǰ����: " + price + ", ��ǰ������ȣ: " + pcode + ", ��ǰ�԰�¥: " + sdate);
		}
		
	}

}
