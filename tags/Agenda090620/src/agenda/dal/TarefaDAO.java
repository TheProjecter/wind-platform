/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.dal;

import agenda.SessionFactoryUtil;
import agenda.model.TarefaEntity;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Ibfir
 */
public class TarefaDAO implements ITarefaDAO{

    
    public void salvar(TarefaEntity tarefa){
        Transaction tx = null;
        try{
            SessionFactoryUtil.getInstance().openSession();
            Session sess = SessionFactoryUtil.getInstance().getCurrentSession();
            
            tx = sess.beginTransaction();
            
            sess.save(tarefa);
            
            tx.commit();
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }
    }
    
    public void remover(TarefaEntity tarefa){
        
    }
    
    public List<TarefaEntity> listarTodas(){
        return null;
    }
    
    public List<TarefaEntity> listarTitulo(String titulo){
        return null;
    }
    
}
