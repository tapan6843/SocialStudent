/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.GroupDao;
import com.techdhoom.socialstudent.model.Group1;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tapan
 */
@Repository
public class GroupDaoImpl extends BaseAbstractGenericDao<Group1, Long> implements GroupDao {

    @Override
    public Long createGroup(Group1 group) {
        return super.create(group);
    }

    @Override
    public Long updateGroup(Group1 group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long deleteGroup(Group1 group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrievebyidGroup(Group1 group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Long retrieveallGroup(Group1 group) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
