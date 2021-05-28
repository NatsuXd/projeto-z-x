package marcos.controller;

import io.swagger.annotations.ApiParam;
import marcos.domain.entity.*;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping(path = "api/listaveiculo", produces = MediaType.APPLICATION_JSON_VALUE)
//public class ListaVeiculoController {
  //  @PostMapping(path = "/", consumes = "application/json")
   // public HttpEntity SalvarVeiculo(
    //        @ApiParam(name = "request", value = "Lista de Veiculo", required = true)
    //        @RequestBody ListaVeiculoDTO request
 //   ) {
  //      try {
  //          ListaVeiculo user = new ListaVeiculo();
   //         user.setMarca(request.getMarca());
    //        user.setModelo(request.getModelo());
    //        user.setAno(request.getAnor());

         //   Usuario entity = ListaVeiculoService.salvar(user);
      //      return new ResponseEntity(entity, HttpStatus.CREATED);
//
     //   } catch (DataIntegrityViolationException dtEx) {
      //      String message = "";
        //    if (dtEx.getMessage().contains("")) {
        //        message = "CPF já cadastrado";
        //    }else{
       //         message = "EMAIL já cadastrado";
        //   }
         //   ErrorDTO error =new ErrorDTO(message);
        //    return new
                   // ResponseEntity(error, HttpStatus.BAD_REQUEST);
     //   } catch (Exception ex) {
       //     return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    //    }

  //  }
//}


