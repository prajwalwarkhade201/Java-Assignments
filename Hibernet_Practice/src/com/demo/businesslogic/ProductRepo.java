package com.demo.businesslogic;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.demo.entity.Product;
import com.demo.factory.HibernateUtil;
import com.demo.factory.*;

public class ProductRepo {

	static Session session = null;
	static Transaction trans = null;
	static SessionFactory sessionfactory = null;

	// logic part create product or add product
	public static Product createProduct(Product p) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		session.save(p);// this equivalent to "insert into table value()
		trans.commit();
		session.close();
		return p;

	}

	// view product
	public static Product viewProduct(Product p) {
		
		session = HibernateUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		
		//@SuppressWarnings("unchecked")
		Query query = (Query) session.createQuery("From Products");
		List<Product> prList = query.list();
		
		for(Product pr:prList) {
			System.out.println("id : "+pr.getId()+" name : "+pr.getName()+ " course : "+pr.getDescription()); 
		}
		
		trans.commit();
		session.close();
		
		return p;

	}

	// update product
	public static Product updateProduct(Product p) {
		session = HibernateUtil.getSessionFactory().openSession();
		trans = session.beginTransaction();
		
		Serializable id = null;
		Product pr = (Product) session.get(Product.class, id);
		String name = null;
		pr.setName(name);
		pr.setDescription(name);
		pr.setColor(name);
		trans.commit();
		session.close();
		
		
		return pr;

	}

// delete product
	public static Product deleteProductByid(long p) {
		session = HibernateUtil.getSessionFactory().openSession();// obtain the session for insert operations
		trans = session.beginTransaction();// start transaction
		Product pr =(Product) session.get(Product.class, p);
		session.delete(pr);// this equivalent to "delete into table value()
		trans.commit();
		session.close();
		
		return pr;

	}

}