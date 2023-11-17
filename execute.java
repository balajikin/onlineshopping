package onlineshopping;

import java.util.*;
public class execute {

	public static void main(String[] args) {
		
		store ms=new store();
		ms.addProducts(new product(101,"formalShirt",550),50);
		ms.addProducts(new product(110,"T-Shirt",200),150);
		ms.addProducts(new product(205,"Jeans shirts",400),75);
		ms.addProducts(new product(121,"Casuals",550),40);
		ms.addProducts(new product(115,"Coat suit",3150),150);
		ms.addProducts(new product(134,"Kids shirt",350),50);
		ms.addProducts(new product(225,"Denim Shirt",650),50);
		ms.addProducts(new product(144,"Dhotis",250),50);
		ms.addProducts(new product(196,"Kurtas",650),50);
		ms.addProducts(new product(125,"cargo pants",550),50);
		
		ms.productsDisplay();
		
		Random r=new Random();
		int n= r.nextInt(5)+1;
		customer[] customers=new customer[n];
		System.out.println(n+" Customers created");
		
		for(int i=0;i<n;i++)
		{
			customers[i]= new customer("Customer"+(i+1),ms);
		}
		
		for(int i=0;i<n;i++)
		{
			customers[i].start();
		}
		
		for(int i=0;i<n;i++)
		{
			try {
				customers[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Customer"+(i+1)+"Purchase details");
			customers[i].viewCart();
		}
		
		ms.productsDisplay();
	}

}

