package com.tt.axp.customer.domain;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.FieldType;
import java.io.Serializable;

/**
 * A Service.
 */
@Entity
@Table(name = "service")
@org.springframework.data.elasticsearch.annotations.Document(indexName = "service")
public class Service implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @org.springframework.data.elasticsearch.annotations.Field(type = FieldType.Keyword)
    private Long id;

    /**
     * The service attribute.
     */
    @ApiModelProperty(value = "The service attribute.")
    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "servcie_id")
    private String servcieId;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceType() {
        return serviceType;
    }

    public Service serviceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Service serviceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServcieId() {
        return servcieId;
    }

    public Service servcieId(String servcieId) {
        this.servcieId = servcieId;
        return this;
    }

    public void setServcieId(String servcieId) {
        this.servcieId = servcieId;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Service)) {
            return false;
        }
        return id != null && id.equals(((Service) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Service{" +
            "id=" + getId() +
            ", serviceType='" + getServiceType() + "'" +
            ", serviceName='" + getServiceName() + "'" +
            ", servcieId='" + getServcieId() + "'" +
            "}";
    }
}
