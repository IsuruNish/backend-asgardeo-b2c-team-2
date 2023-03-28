package com.hackathon.purchase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ServicePurchaseRepository extends JpaRepository<ServicePurchase, ServicePurchaseID> {
    @Modifying
    @Transactional
    @Query(
            value =
                    "INSERT INTO service_purchase (customer_id, service_id) VALUES (:customerEmail, :serviceId)",
            nativeQuery = true)
    void addServicePurchase(String customerEmail, String serviceId);
}
