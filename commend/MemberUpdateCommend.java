package org.project.product.commend;

import java.util.Scanner;

import org.java.Dao.MemberDao;

public class MemberUpdateCommend implements ProductExcute {

	@Override
	public void excuteQuery() {
		System.out.println();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("¹Ù²Ü °í°´ÀÌ¸§");
		String userName = scn.next();
		
		System.out.println("¹Ù²Ü °í°´ÀüÈ­");
		String userPhone = scn.next();
		
		System.out.println("¹Ù²Ü °í°´ÁÖ¼Ò");
		String addr = scn.next();
		
		System.out.println("¹Ù²Ü °í°´ °¡ÀÔ³¯Â¥");
		String inDay = scn.next();
		
		System.out.println("¹Ù²Ü °í°´ µî±Þ(A,B,C)");
		String grade = scn.next();
		
		System.out.println("¹Ù²Ü °í°´ Ãâ½ÅÁö(01,02, ...");
		String city = scn.next();
		
		System.out.println("Á¶°Ç °í°´ ¹øÈ£");
		int memberno = scn.nextInt();
		
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.updateDo(memberno, userName, userPhone, addr, inDay, grade, city);
		
		if (rs !=1 ) {
			System.out.println("°í°´º¯°æ ½ÇÆÐ");
		} else {
			System.out.println("°í°´º¯°æ ¼º°ø");
		}
	}

}
