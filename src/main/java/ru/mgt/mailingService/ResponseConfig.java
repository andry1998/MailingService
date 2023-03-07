package ru.mgt.mailingService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mgt.icp.shared.dto.ResponseModel;
import ru.mgt.icp.shared.exception.EnableExceptionHandlerAdvice;
import ru.mgt.icp.shared.filter.response.wrapper.model.WrapperModel;

@Configuration
public class ResponseConfig {

    @Bean
    public WrapperModel wrapperModel(){
        return new ResponseModel();
    }
}
