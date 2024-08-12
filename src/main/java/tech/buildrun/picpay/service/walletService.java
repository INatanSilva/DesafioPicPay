package tech.buildrun.picpay.service;

import org.springframework.stereotype.Service;

import tech.buildrun.picpay.dto.CreateWalletDto;
import tech.buildrun.picpay.entity.wallet;
import tech.buildrun.picpay.exception.WalletDataAlreadyExistsExecption;
import tech.buildrun.picpay.repository.walletRepository;

@Service
public class walletService {

    private final walletRepository walletRepository;

    public walletService(walletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public wallet createWallet(CreateWalletDto dto) {
        
        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.email());
        if (walletDb.isPresent()) {
            throw new WalletDataAlreadyExistsExecption("CpfCnpj or Email already exists");
        }

        return walletRepository.save(dto.toWallet());
        
    }
    
}
