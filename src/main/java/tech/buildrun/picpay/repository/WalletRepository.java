package tech.buildrun.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.buildrun.picpay.entity.wallet;

public interface walletRepository extends JpaRepository<wallet, Long> {
    
}
