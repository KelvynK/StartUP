package startup.dao;

import startup.dao.hibernate.EmpresaHibernateDAO;
import startup.dao.hibernate.ProfissionalHibernateDAO;
import startup.dao.hibernate.UsuarioHibernateDAO;

public class DaoFactory
{
    public static UsuarioDAO getUsuarioDAO()
    {
        return new UsuarioHibernateDAO();
    }

    public static ProfissionalDAO getProfissionalDAO()
    {
        return new ProfissionalHibernateDAO();
    }

    public static EmpresaDAO getEmpresaDAO()
    {
        return new EmpresaHibernateDAO();
    }

}
