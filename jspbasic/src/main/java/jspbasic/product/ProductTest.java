package jspbasic.product;

import java.sql.Date;

public class ProductTest {
	
	public static void main(String[] args) throws Exception {
		
		ProductProc productProc = new ProductProc();
		
//		Product product 
//			= new Product(0, "회사명", "상품명", "색상", 100, 
//					1000, new Date(System.currentTimeMillis()));
//		int result = productProc.writeProduct(product);
//		if (result > 0) System.out.println("등록 성공!");
		
//		System.out.println(productProc.listProduct());
		
//		Product product 
//		= new Product(1, "UP회사명", "UP상품명", "UP색상", 1000, 
//				10000, null);
//		int result = productProc.updateProduct(product);
//		if (result > 0) System.out.println("수정 완료!");
		
		int result = productProc.deleteProduct(5);
		if (result > 0) System.out.println("삭제 완료!");
		
	}

}












