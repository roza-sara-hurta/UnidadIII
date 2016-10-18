package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Rol;


public class RolDAO extends DAO<Rol> {
     public RolDAO() {
        super(new Rol());
    }

    
    public Rol getOneById(Rol rol) throws HibernateException {
        return super.getOneById(rol.getIdRol()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
