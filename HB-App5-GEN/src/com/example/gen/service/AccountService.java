package com.example.gen.service;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.example.gen.bean.AccountBean;
import com.example.gen.dao.AccountDAO;
import com.example.gen.service.AccountService;
import com.example.gen.util.SessionUtil;

public class AccountService {

	public void  useDetailsSaveOrUpdate(AccountBean bean) {
		AccountDAO dao = new AccountDAO();
		Session session = null;
		try {
			session = SessionUtil.getSession();
			session.getTransaction().begin();
			
			/* Below code save or update record in database table */
			dao.insertAccountDetails(bean);
					
		}catch (HibernateException e) {
			
			e.printStackTrace();
		}finally {
			
			session.getTransaction().commit();
		}
	}
	public static void main(String[] args) {

		AccountService service = new AccountService();
		
		AccountBean bean = new AccountBean();
		bean.setName("SUJAY");
		bean.setBalance(95236);
		bean.setAccCreationDate(new Date());
		
		service.useDetailsSaveOrUpdate(bean);
		
	}
	
}

/*In example 5 no .5 we added an  account generator class that implements identifier generator and in same class.public that we override the generate method.
 * This method will return newly created sequnce for accountid i.e.every account no.will start with constant String="SBI";*/  
	

/*This account number sequence generator class we map for account bean class in hibernate mapping file*/
/*
 * <id name="accNo" type="string"> <column name="ACCNO" /> <generator
 * class="com.example.gen.id.AccountNumberGenerator"> <param
 * name="sequence">ACCNO_SEQ</param> </generator> </id>
 */


/*Assiosiate sequence claas for account no. class we have added under the id tag of account no. in account.hbm.xml file
 * TO map account hbm mapping wwe have adding account hbm file in account config xml file*/
