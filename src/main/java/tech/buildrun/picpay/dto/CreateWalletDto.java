package tech.buildrun.picpay.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import tech.buildrun.picpay.entity.wallet;
import tech.buildrun.picpay.entity.walletType;

public record CreateWalletDto(@NotBlank String fullName,
                              @NotBlank String cpfCnpj,
                              @NotBlank String email,
                              @NotBlank String password,
                              @NotNull walletType.Enum walletType){
    
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
