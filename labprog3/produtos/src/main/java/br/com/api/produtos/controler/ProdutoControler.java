package br.com.api.produtos.controler;

import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.model.ProdutoModel;
import br.com.api.produtos.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ProdutoControler {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/listar")
    public Iterable<ProdutoModel>listar() {
        return ps.listar();
    }
    


        @GetMapping("/")
        public String rota() {
            return "efefffdf";
        }
}
