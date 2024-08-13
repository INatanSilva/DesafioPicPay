package tech.buildrun.picpay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tech.buildrun.picpay.dto.CreateWalletDto;
import tech.buildrun.picpay.entity.wallet;
import tech.buildrun.picpay.service.walletService;

@RestController
public class walletController {
    
    private final walletService walletService;

    public walletController(walletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<wallet> createWallet(@RequestBody @Valid CreateWalletDto dto) {
        
        var wallet = walletService.createWallet(dto);

        return ResponseEntity.ok(wallet);

    }
}
