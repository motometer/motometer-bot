package org.motometer.bot.telegram.api;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.net.URI;
import java.nio.charset.Charset;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UpdateControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void onUpdate() throws Exception {
        String update = IOUtils.resourceToString("/org/motometer/bot/telegram/api/UpdateControllerTest/update.json", Charset.defaultCharset());

        RequestEntity<String> request = RequestEntity.post(new URI(restTemplate.getRootUri() + "/bot/update/fake-token"))
            .contentType(MediaType.APPLICATION_JSON)
            .body(update);

        ResponseEntity<Void> response = restTemplate.exchange(request, Void.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
    }
}