package ejemploHibernate;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;


import org.junit.Test;

import com.edu.udea.iw.dao.ClienteDao;
import com.edu.udea.iw.dao.hibernate.ClienteDaoImpHibernate;
import com.edu.udea.iw.dto.Cliente;
import com.edu.udea.iw.dto.Usuario;
import com.edu.udea.iw.exeption.MyDaoExeption;

public class ClienteDaoObtenerTest {

//	@Test
	public void testCrear() {
		ClienteDao dao = new ClienteDaoImpHibernate();
		Cliente cliente = new Cliente();
		
		cliente.setNombres("Camilo");
		cliente.setApellidos("Posada Angel");
		cliente.setCedula("102020301");
		cliente.setEmail("cposadaa@gmail.com");
		Usuario usuarioCrea = new Usuario();
		usuarioCrea.setLogin("elver");
		cliente.setUsuarioCrea(usuarioCrea);
		cliente.setFechaCreacion(new Date());
		try {
			dao.crear(cliente);
			assertTrue(true);
		} catch (MyDaoExeption e) {
			// TODO: handle exception
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		
	}

	@Test
	public void testObtener() {

		ClienteDao dao = new ClienteDaoImpHibernate();
		List<Cliente> clientes = null;
		
		try {
			clientes = dao.obtener();
			assertTrue(clientes.size()>=0);
			
		} catch (MyDaoExeption e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
		
		
	}

}
