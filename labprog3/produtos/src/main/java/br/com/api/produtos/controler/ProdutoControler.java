package br.com.api.produtos.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProdutoControler {

        @GetMapping("/")
        public String rota() {
            return "efefffdf";
        }
}
