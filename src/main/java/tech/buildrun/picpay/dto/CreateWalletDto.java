package tech.buildrun.picpay.dto;

import tech.buildrun.picpay.entity.wallet;
import tech.buildrun.picpay.entity.walletType;

public record CreateWalletDto(String fullName,
                              String cpfCnpj,
                              String email,
                              String password,
                              walletType.Enum walletType){
    
    public wallet toWallet() {
        return new wallet(
            fullName,
            cpfCnpj,
            email,
            password,
            walletType.get()
        );
    }
}
