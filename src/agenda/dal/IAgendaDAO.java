/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.dal;

import agenda.model.AgendaEntity;
import java.util.List;

/**
 *
 * @author Ibfir
 */
public interface IAgendaDAO {

    public void salvar(AgendaEntity agenda);
    
    public void remover(AgendaEntity agenda);
    
    public List<AgendaEntity> listar();
    
}
