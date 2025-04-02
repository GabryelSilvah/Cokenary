package com.receitas.controller;

import com.receitas.model.FuncionarioModel;
import com.receitas.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping("listar_funcionario")
    public List<FuncionarioModel> show(){
        return service.listAll();
    }
    @PostMapping("cadastrar_funcionario")
    public ResponseEntity<String> cadastrar(@RequestBody FuncionarioModel funcionario){
        service.create(funcionario);
        return new ResponseEntity<>("Cadastrado com sucesso!", HttpStatus.CREATED);

    }
}
