package com.madeeasy.repository;

import com.madeeasy.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * By placing the @RepositoryRestResource annotation on top of this interface provides us with the Rest endpoint.
 * By default, Spring will use the pluralized entity name for the endpoint i.e. if entity is department -> /departments
 */
//You can use @RepositoryRestResource annotation to change the path from /departments to /dpts:
@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
