package org.java.Controller;

import java.util.Scanner;

import org.project.product.commend.ProductDeleteCommend;
import org.project.product.commend.ProductExcute;
import org.project.product.commend.ProductInsertCommend;
import org.project.product.commend.ProductSelectCommend;
import org.project.product.commend.ProductUpdateCommend;

public class ProductController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ProductExcute commend;

		// 쿼리문을 입력하세요 insert.do, select.do, update.do, delete.do
		while (true) {
			System.out.println("product 쿼리문을 입력하세요 insert.do, select.do, update.do, delete.do");
			String queryDo = scn.next();
			String query = queryDo.substring(0, queryDo.length() - 3);
			System.out.println("query: " + query);
			
			if (query.equals("select")) {
				commend = new ProductSelectCommend();
				commend.excuteQuery();
			} else if (query.equals("insert")) {
				commend = new ProductInsertCommend();
				commend.excuteQuery();
			} else if (query.equals("update")) {
				commend = new ProductUpdateCommend();
				commend.excuteQuery();
			} else if (query.equals("delete")) {
				commend = new ProductDeleteCommend();
				commend.excuteQuery();
			} else if (queryDo.equals("exit")) {

				break;
			}
		}

		scn.close();
	}
}
