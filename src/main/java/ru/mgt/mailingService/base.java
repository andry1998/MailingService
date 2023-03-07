package ru.mgt.mailingService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import ru.mgt.icp.shared.exception.abstraction.ErrorCode;

@RequiredArgsConstructor
@Getter
public enum base implements ErrorCode {
    ASD("Описание", HttpStatus.BAD_REQUEST);

    final String description;
    final HttpStatus httpStatus;
}
