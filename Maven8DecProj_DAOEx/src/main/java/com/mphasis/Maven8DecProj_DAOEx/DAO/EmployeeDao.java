package com.mphasis.Maven8DecProj_DAOEx.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mphasis.Maven8DecProj_DAOEx.model.Employee;
import com.mphasis.Maven8DecProj_DAOEx.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class EmployeeDao implements EmployeeDaoInterface{

	@Override
	public List<Employee> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> empList=session.createNamedQuery("Employee.findAll()",Employee.class).list();
		session.close();
		return empList;
	}

	@Override
	public Employee findById(int i) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Employee e=session.get(Employee.class, i);
		session.close();
		return e;
		
	}

	@Override
	public void addEmployee() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=new Employee(127,"prathith",90000,"accounts","manager");
		session.save(e);
		transaction.commit();
		session.close();
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findByDept(String dept) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Query<Employee> q=session.createNamedQuery("Employee.findByDept()",Employee.class);
		q.setParameter("dept", dept);
		List<Employee> empList=q.list();
		session.close();
		return empList;
		
	}

	@Override
	public List<Employee> findByFilters(String dept, String desg, Double salary) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee> root=cq.from(Employee.class);
		List<Predicate> predicates=new ArrayList<Predicate>();
		
		if(dept!=null && !dept.isEmpty())
			predicates.add(cb.equal(root.get("dept"), dept));
		if(desg!=null && !desg.isEmpty())
			predicates.add(cb.equal(root.get("desg"), dept));
		if(salary!=0)
			predicates.add(cb.greaterThanOrEqualTo(root.get("salary"), salary));
		
		cq.where(predicates.toArray(new Predicate[0]));
		
		List<Employee> empList=session.createQuery(cq).getResultList();
		session.close();
		return empList;
	}

}
