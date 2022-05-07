package br.com.marco.anotacao;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})

public @interface AnotacaoTabela {

    String value();
}
