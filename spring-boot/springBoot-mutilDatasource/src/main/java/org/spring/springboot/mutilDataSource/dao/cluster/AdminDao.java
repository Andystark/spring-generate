package org.spring.springboot.mutilDataSource.dao.cluster;

import org.spring.springboot.mutilDataSource.domain.cluster.Admin;

import java.util.List;

/**
 * @author chenssy
 * @date 2017/6/3
 * @since v1.0.0
 */
public interface AdminDao {

    List<Admin> getAllAdmin();
}
