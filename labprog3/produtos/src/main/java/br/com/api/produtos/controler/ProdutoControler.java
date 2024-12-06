package br.com.api.produtos.controler;

import org.springframework.web.bind.annotation.RestController;

import br.com.api.produtos.model.ProdutoModel;
import br.com.api.produtos.model.RespostaModel;
import br.com.api.produtos.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProdutoControler {

    @Autowired
    private ProdutoService ps;

    @DeleteMapping("/remover/{codigo}")
        public ResponseEntity<RespostaModel> remover(@PathVariable long codigo){
            return ps.remover(codigo);
        }

    @PutMapping("/alterar")
    public ResponseEntity<?>alterar(@RequestBody ProdutoModel pm) {
        return ps.cadastrarAlterar(pm,"alterar");
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?>cadastrar(@RequestBody ProdutoModel pm) {
        return ps.cadastrarAlterar(pm,"cadastrar");
    }
    
    @GetMapping("/listar")
    public Iterable<ProdutoModel>listar() {
        return ps.listar();
    }
    
        @GetMapping("/")
        public String rota() {
            return "efefffdf";
        }




}
