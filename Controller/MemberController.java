package org.java.Controller;

import java.util.Scanner;

import org.project.product.commend.MemberDeleteCommend;
import org.project.product.commend.MemberInsertCommend;
import org.project.product.commend.MemberSelectCommend;
import org.project.product.commend.MemberUpdateCommend;
import org.project.product.commend.ProductExcute;

public class MemberController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ProductExcute commend;

		// 쿼리문을 입력하세요 insert.do, select.do, update.do, delete.do
		while (true) {
			System.out.println("member 쿼리문을 입력하세요 insert.do, select.do, update.do, delete.do");
			String queryDo = scn.next();
			String query = queryDo.substring(0, queryDo.length() - 3);
			System.out.println("query: " + query);
			
			if (query.equals("insert")) {
				commend = new MemberInsertCommend();
				commend.excuteQuery();
			} else if (query.equals("select")) {
				commend = new MemberSelectCommend();
				commend.excuteQuery();
			} 
			  else if (query.equals("update")) {
				commend = new MemberUpdateCommend();
				commend.excuteQuery();
			} 
			  else if (query.equals("delete")) {
				commend = new MemberDeleteCommend();
				commend.excuteQuery();
			} else if (queryDo.equals("exit")) {
				System.out.println("종료합니다");
				break;
			} else {
				System.out.println("쿼리문 입력 오류");
			}
		}

		scn.close();
	}
}
