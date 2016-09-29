package ejemploHibernate;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import com.edu.udea.iw.dao.UsuarioDao;
import com.edu.udea.iw.dao.hibernate.UsuarioDaoImpHibernate;
import com.edu.udea.iw.dto.Usuario;
import com.edu.udea.iw.exeption.MyDaoExeption;

public class UsuarioDaoObtenerTest {

	@Test
	public void testObtener() {
		
		UsuarioDao dao = new UsuarioDaoImpHibernate();
		List<Usuario> usuarios;
		try{
			usuarios = dao.obtener();
			
			for(Usuario usuario : usuarios){
				System.out.println("Login: " + usuario.getLogin());
				System.out.println("Rol: " + usuario.getRol().getNombre());
			}
			
			assertTrue(usuarios.size()>0);
		}catch (MyDaoExeption e) {
			fail(e.getMessage());
		}
	}
	
	
	

}
