package tech.buildrun.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.buildrun.picpay.entity.walletType;

public interface WalletTypeRepository extends JpaRepository<walletType, Long> {
    
}
