/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.dal;

import agenda.SessionFactoryUtil;
import agenda.model.ResponsavelEntity;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class ResponsavelDAO implements IResponsavelDAO{

    public void salvar(ResponsavelEntity entity) {
        
        Transaction tx = null;
        try{
            Session sess = SessionFactoryUtil.
                    getInstance().getCurrentSession();
            
            tx = sess.beginTransaction();
            
            sess.save(entity);
            
            tx.commit();
        }catch(Exception e){
            if(tx != null)
                tx.rollback();
            e.printStackTrace();
            
        }
    }

    public void remover(ResponsavelEntity entity) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<ResponsavelEntity> listar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
