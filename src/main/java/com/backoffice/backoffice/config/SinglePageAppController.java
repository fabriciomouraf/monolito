package com.backoffice.backoffice.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SinglePageAppController {

    // Redireciona todas as rotas não-API para o index.html
    @RequestMapping(value = "/{path:[^\\.]*}")
    public RedirectView redirect() {
        return new RedirectView("/");
    }
}