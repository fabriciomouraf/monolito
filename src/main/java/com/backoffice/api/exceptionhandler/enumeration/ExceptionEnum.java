package com.backoffice.api.exceptionhandler.enumeration;

import com.backoffice.api.exceptionhandler.errors.BadRequestAlertException;
import com.backoffice.api.util.object.Objeto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.zalando.problem.AbstractThrowableProblem;

@Getter
@AllArgsConstructor
public enum ExceptionEnum {

    GLOBAL_EXPRESSION_SORT_INVALID(new BadRequestAlertException("Ordenação inválida", Object.class, ErrorCodeEnum.GLOBAL)),

    ;

    private final AbstractThrowableProblem ex;


    public void launch() {

        throw ex;

    }

    public static void checkThrow(boolean expression, ExceptionEnum exceptionEnum) {

        if (expression) {
            exceptionEnum.launch();
        }

    }

    public static void checkThrowIsBlank(Object object, ExceptionEnum exceptionEnum) {

        checkThrow(Objeto.isBlank(object), exceptionEnum);

    }

}