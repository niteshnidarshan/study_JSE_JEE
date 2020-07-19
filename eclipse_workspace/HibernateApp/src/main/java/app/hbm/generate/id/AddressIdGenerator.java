package app.hbm.generate.id;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import app.hbm.utility.HibernateUtility; 
/***
 * 
 * Generating id for Address 
 * 
 * 1) Create a Sequence table in DB
 * 
 * 2) Implements IdentifierGenerator & override generate() 
 * 
 * 3) Manually fetch next val from sequence table 
 * 
 * 4) add logic of ID
 * 
 * 5) use below annotation in Entity class
 * 
 * @Id
	@GenericGenerator(name = "addr_id", strategy = "app.hbm.generate.id.AddressIdGenerator") //Custom Id Generator class in strategy
	@GeneratedValue(generator = "addr_id")//custom id generator mapped with @GenericGenerator of name
	@Column(columnDefinition = "VARCHAR", length = 11)
	private String addressId;
 *	
 * 
 * 
 * 
 * @author niteshnidarshan
 *
 */
public class AddressIdGenerator implements IdentifierGenerator {

	public Serializable generate(SessionImplementor session, Object object) throws HibernateException {
		String id = "";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = session.connection();
			stmt = con.createStatement();
			//rs = stmt.executeQuery("SELECT ADDRESS_SEQUENCE.NEXTVAL AS NEXT_ID FROM DUAL");
			rs = stmt.executeQuery("SELECT NEXTVAL('ADDRESS_SEQUENCE') as NEXT");
			rs.next();
			int i = rs.getInt("NEXT");
			
			if(i <= 9) {
				id = "ADR0000000"+i;
			}
			else if(i >9 && i <= 99) {
				id = "ADR000000"+i;
			}
			else if(i >99 && i <= 999) {
				id = "ADR00000"+i;
			}
			else if(i >999 && i <= 9999) {
				id = "ADR0000"+i;
			}
			else if(i >9999 && i <= 99999) {
				id = "ADR000"+i;
			}
			else 
			{
				id = "ADR"+i;
			}
			System.out.println(id);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return id;
	}
}
