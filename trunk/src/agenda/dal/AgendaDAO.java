/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.dal;

import agenda.SessionFactoryUtil;
import agenda.model.AgendaEntity;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class AgendaDAO implements IAgendaDAO{

    public void salvar(AgendaEntity agenda) {
        Transaction tx = null;
        try{
            SessionFactoryUtil.getInstance().openSession();
            Session sess = SessionFactoryUtil.
                    getInstance().getCurrentSession();
            
            tx = sess.beginTransaction();
            
            sess.save(agenda);
            
            tx.commit();
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
    }

    public void remover(AgendaEntity agenda) {
        Transaction tx = null;
        try{
            SessionFactoryUtil.getInstance().openSession();
            Session sess = SessionFactoryUtil.
                    getInstance().getCurrentSession();
            
            sess.delete(agenda);
            
            tx.commit();
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
        
    }

    public List<AgendaEntity> listar() {
        Transaction tx = null;
        List<AgendaEntity> result = null;
        try{
            SessionFactoryUtil.getInstance().openSession();
            Session sess = SessionFactoryUtil
                    .getInstance().getCurrentSession();
            
            tx = sess.beginTransaction();
            
            Criteria crt = sess.createCriteria(AgendaEntity.class);
            crt.addOrder(Order.asc("nome"));
            result = crt.list();
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
        return result;
    }

}
