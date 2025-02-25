package com.project.demo.adapters.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PostMapping;
=======
>>>>>>> 8d121d9 (feature: Modulo Usuario Corregido)
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.adapters.rest.constants.usuarioEndpoint;
<<<<<<< HEAD
<<<<<<< HEAD
import com.project.demo.domain.personaModel;
=======
>>>>>>> af798b7 (feature: files reorganized)
=======
import com.project.demo.domain.personaModel;
>>>>>>> 8d121d9 (feature: Modulo Usuario Corregido)
import com.project.demo.domain.usuarioModel;
import com.project.demo.infrastructure.servicesImpl.UsuarioService;


@RestController
@RequestMapping(usuarioEndpoint.USUARIO_ENDPOINT)
public class usuarioController {
    
    @Autowired
    UsuarioService service;

    @GetMapping(usuarioEndpoint.USUARIO_GET_ALL)
    public List<usuarioModel> getAll(){
        return service.getAll();
    }

    @GetMapping(usuarioEndpoint.USUARIO_GET_PERSONA)
    public personaModel getPersonaByUsuario(@PathVariable("id") int id){
<<<<<<< HEAD
        return service.getPersonabyUser(id);        
    }

    @PostMapping(usuarioEndpoint.USUARIO_CREATE)
=======
        return service.getPersonabyUser(id);
    }

    @GetMapping(usuarioEndpoint.USUARIO_CREATE)
>>>>>>> 8d121d9 (feature: Modulo Usuario Corregido)
    public usuarioModel create(@RequestBody usuarioModel model){
        return service.add(model);
    }

    @GetMapping(usuarioEndpoint.USUARIO_GET_BY_ID)
    public usuarioModel getById(@PathVariable("id") int id){
        return service.getById(id);
    }

    @PutMapping(usuarioEndpoint.USUARIO_UPDATE)
    public usuarioModel update(@RequestBody usuarioModel model){
        return service.update(model);
    }

    @DeleteMapping(usuarioEndpoint.USUARIO_DELETE)
    public boolean delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}
