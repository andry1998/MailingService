package ru.mgt.mailingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.mgt.icp.shared.exception.EnableExceptionHandlerAdvice;
import ru.mgt.mailingService.model.dto.PushDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableExceptionHandlerAdvice
public class MailingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailingServiceApplication.class, args);
	}

}
