package com.project.alm.Repository;

import com.project.alm.entity.Features;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends CrudRepository<Features, String> {
}
