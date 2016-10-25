package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import Tables.Order;
import Tables.User;
import util.HibernateUtil;

public class UserDAOimpl implements UserDAO {

	public void addUser(User user) throws SQLException {
		// TODO Auto-generated method stub

	}

	public Order getUserById(Integer user_id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public Collection<User> getAllUser() throws SQLException {
		Session session = null;
	    List<User> users = new ArrayList<User>();
	    try {
	      session = HibernateUtil.getSessionFactory().openSession();
	      users = session.createCriteria(User.class).list();
	    } catch (Exception e) {
	      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
	    } finally {
	      if (session != null && session.isOpen()) {
	        session.close();
	      }
	    }
	    return users;
	}

	public void deleteUser(User user) throws SQLException {
		// TODO Auto-generated method stub

	}

	public Collection<Order> getOrderByUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
