package com.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
public class SwaggerController {

  @GetMapping
  @ApiOperation(value = "Retorna um dado")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Dado retornado com sucesso"),
      @ApiResponse(code = 401, message = "Não autorizado"),
      @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
      @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
  })
  public String get(){
    return "Método GET executado com sucesso!";
  }

  @PostMapping
  @ApiOperation(value = "Salva um dado")
  @ApiResponses(value = {
      @ApiResponse(code = 201, message = "Dado salvo com sucesso"),
      @ApiResponse(code = 401, message = "Não autorizado"),
      @ApiResponse(code = 403, message = "Você não tem permissão para realizar essa operação"),
      @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
  })
  public String post(){
    return "Método POST executado com sucesso!";
  }

  @PutMapping
  @ApiOperation(value = "Atualiza um dado")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Dado atualizado com sucesso"),
      @ApiResponse(code = 401, message = "Não autorizado"),
      @ApiResponse(code = 403, message = "Você não tem permissão para realizar essa operação"),
      @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
  })
  public String put(){
    return "Método PUT executado com sucesso!";
  }

  @DeleteMapping
  @ApiOperation(value = "Deleta um dado")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "Dado deletado com sucesso"),
      @ApiResponse(code = 401, message = "Não autorizado"),
      @ApiResponse(code = 403, message = "Você não tem permissão para realizar essa operação"),
      @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
  })
  public String delete(){
    return "Método DELETE executado com sucesso!";
  }
}
