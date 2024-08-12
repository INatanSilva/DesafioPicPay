package tech.buildrun.picpay.repository;

import java.lang.foreign.Linker.Option;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.buildrun.picpay.entity.wallet;

    public interface walletRepository extends JpaRepository<wallet, Long> {
       
        Option<wallet> findByCpfCnpjOrEmail(String cpfCnpj, String email);
}
