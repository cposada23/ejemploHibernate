package ejemploHibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.edu.udea.iw.dao.CiudadDao;
import com.edu.udea.iw.dao.hibernate.CiudadDadoImpHibernate;
import com.edu.udea.iw.dto.Ciudad;
import com.edu.udea.iw.exeption.MyDaoExeption;

public class CiudadDaoObtenerTest {

	@Test
	public void testObtener() {
		
		CiudadDao dao = new CiudadDadoImpHibernate();
		List<Ciudad> ciudades;
		try{
			ciudades = dao.obtener();
			assertTrue(ciudades.size()> 0);
		}catch (MyDaoExeption e) {
			fail(e.getMessage());
		}
		
	}

}
