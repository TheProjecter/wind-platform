/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.business;

import agenda.dal.AgendaDAO;
import agenda.dal.IAgendaDAO;
import agenda.dal.IResponsavelDAO;
import agenda.dal.ITarefaDAO;
import agenda.dal.ResponsavelDAO;
import agenda.dal.TarefaDAO;
import agenda.model.AgendaEntity;
import agenda.model.ResponsavelEntity;
import agenda.model.TarefaEntity;
import java.util.List;

/**
 *
 * @author Paulo Freitas (pfreitas1@gmail.com)
 */
public class TarefaBusiness implements ITarefaBusiness {

    public void salvar(TarefaEntity tarefa) throws Exception{
        
        if(tarefa.getTitulo() == null 
                || tarefa.getTitulo().trim().length() == 0){
            //lancar erro
            throw new Exception("Titulo e um campo obrigatorio!");
        }
        
        ITarefaDAO dao = new TarefaDAO();
        dao.salvar(tarefa);
    }

    public void remover(TarefaEntity entity) {
        
    }

    public List<TarefaEntity> listar() {
        return null;
    }

    public void enviarAlerta() {
        
    }

    public void salvarAgenda(AgendaEntity agenda) {
        IAgendaDAO dao = new AgendaDAO();
        dao.salvar(agenda);
    }

    public void removerAgenda(AgendaEntity agenda) {
        IAgendaDAO dao = new AgendaDAO();
        dao.remover(agenda);
        
    }

    public List<AgendaEntity> listarAgenda() {
        IAgendaDAO dao = new AgendaDAO();
        return dao.listar();
    }

    public void salvarResponsavel(ResponsavelEntity entity) {
        IResponsavelDAO dao = new ResponsavelDAO();
        dao.salvar(entity);
    }

}
