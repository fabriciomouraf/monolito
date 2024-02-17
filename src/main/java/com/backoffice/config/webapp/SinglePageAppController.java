package com.backoffice.config.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

// Redireciona todas as rotas não-API para o index.html
@Controller
public class SinglePageAppController {

    @RequestMapping(value = "/{path:[^\\.]*}")
    public RedirectView redirect() {
        return new RedirectView("/");
    }
}