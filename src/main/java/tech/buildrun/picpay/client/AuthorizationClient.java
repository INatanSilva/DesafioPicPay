package tech.buildrun.picpay.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import tech.buildrun.picpay.client.dto.AuthorizationResponse;

@FeignClient(
        name = "AuthorizationClient",
        url = "${https://run.mocky.io/v3/d4a78787-1e3d-429c-bf2c-1a87f61bd7cf}"
)

public interface AuthorizationClient {

    @GetMapping
    ResponseEntity<AuthorizationResponse> isAuthorized();
}