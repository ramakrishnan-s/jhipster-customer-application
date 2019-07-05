package com.tt.axp.customer.repository.search;

import com.tt.axp.customer.domain.Service;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Service} entity.
 */
public interface ServiceSearchRepository extends ElasticsearchRepository<Service, Long> {
}
