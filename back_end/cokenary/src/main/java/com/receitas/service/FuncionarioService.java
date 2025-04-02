package com.receitas.service;

import com.receitas.model.FuncionarioModel;
import com.receitas.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;


    public List<FuncionarioModel> listAll(){
        return repository.findAll();
    }
    public String create(FuncionarioModel funcionario){

        repository.save(funcionario);
        return"";
    }
    public String update(){
        return"";
    }
    public String delete(){
        return"";
    }
}
