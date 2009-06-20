/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agenda.dal;

import agenda.model.ResponsavelEntity;
import java.util.List;

/**
 *
 * @author Ibfir
 */
public interface IResponsavelDAO {

    public void salvar(ResponsavelEntity entity);
    
    public void remover(ResponsavelEntity entity);
    
    public List<ResponsavelEntity> listar();
    
}
