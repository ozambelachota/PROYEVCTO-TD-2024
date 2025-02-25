package com.reunion.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reunion.domain.ReunionMiembroModel;
import com.reunion.domain.endpoints.APIEndPoint;
import com.reunion.infrastructure.service.ReunionMiembroService;


@RestController
@RequestMapping(value = APIEndPoint.reunionMiembroBasic)
public class ReunionMiembroController {
    @Autowired
    ReunionMiembroService serviceMiembro;

    @GetMapping(value = APIEndPoint.reunionMiembroGetAll)
    public List<ReunionMiembroModel>getAll(){
        return serviceMiembro.getAll();
    }

    @PostMapping(value =  APIEndPoint.reunionMiembroCreate)
    public ReunionMiembroModel create(@RequestBody ReunionMiembroModel model){
        return serviceMiembro.add(model);
    }
<<<<<<< HEAD
    @GetMapping(name =  ReunionMiembroEndpoint.reunionMiembroBuscarID)
<<<<<<< HEAD
    public ReunionMiembroModel getById(@PathVariable("id_reunionmiembro") int id){
        return serviceMiembro.getById(id);
=======
=======
    @GetMapping(value =  APIEndPoint.reunionMiembroBuscarID)
>>>>>>> f6714bf (correcion de endpoint y creacion de tabla persona)
    public ReunionMiembroModel getById(@PathVariable("id_reunionmiembro") int idMiembro){
        return serviceMiembro.getById(idMiembro);
>>>>>>> 77792ef (actualizacion)
    }

    @PutMapping(value =  APIEndPoint.reunionMiembroUpdate)
    public ReunionMiembroModel update(@RequestBody ReunionMiembroModel model){
        return serviceMiembro.update(model);
    }

<<<<<<< HEAD
    @DeleteMapping(name =  ReunionMiembroEndpoint.reunionMiembroDelete)
<<<<<<< HEAD
    public boolean delete(@PathVariable("id_reunion_miembro") int id){
        return serviceMiembro.delete(id);
=======
=======
    @DeleteMapping(value =  APIEndPoint.reunionMiembroDelete)
>>>>>>> f6714bf (correcion de endpoint y creacion de tabla persona)
    public boolean delete(@PathVariable("id_reunion_miembro") int idMiembro){
        return serviceMiembro.delete(idMiembro);
>>>>>>> 77792ef (actualizacion)
    }
}
