package tech.buildrun.picpay.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import tech.buildrun.picpay.entity.Transfer;

@FeignClient(
        name = "NotificationClient",
        url = "${https://run.mocky.io/v3/43132952-673e-4aba-ab00-167878f9bb61}"
)
public interface NotificationClient {

    @PostMapping
    ResponseEntity<Void> sendNotification(@RequestBody Transfer transfer);
}
