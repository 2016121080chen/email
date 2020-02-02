package com.autosendemail.email;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailSendApiKeyRepository extends JpaRepository<EmailSendApiKeyEntity,String> {

}
