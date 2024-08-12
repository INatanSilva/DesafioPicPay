package tech.buildrun.picpay.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import tech.buildrun.picpay.entity.walletType;
import tech.buildrun.picpay.repository.WalletTypeRepository;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final WalletTypeRepository walletTypeRepository;
    

    public DataLoader(WalletTypeRepository walletTypeRepository) {
        this.walletTypeRepository = walletTypeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(walletType.Enum.values())
            .forEach(walletType -> walletTypeRepository.save(walletType.get()));
    }
    
}
