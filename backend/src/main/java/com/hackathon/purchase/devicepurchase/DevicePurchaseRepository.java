package com.hackathon.purchase.devicepurchase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DevicePurchaseRepository extends JpaRepository<DevicePurchase, DevicePurchaseID> {
    @Modifying
    @Transactional
    @Query(
            value =
                    "INSERT INTO device_purchase (customer_id, device_id) VALUES (:customerEmail, :deviceId)",
            nativeQuery = true)
    void addDevicePurchase(String customerEmail, String deviceId);
}
