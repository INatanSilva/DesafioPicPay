package tech.buildrun.picpay.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.buildrun.picpay.entity.wallet;

    public interface walletRepository extends JpaRepository<wallet, Long> {
       
        Optional<wallet> findByCpfCnpjOrEmail(String cpfCnpj, String email);
}
