package com.ElasTechProjetoFinal.dto.request;

import com.ElasTechProjetoFinal.model.Chamado;
import com.ElasTechProjetoFinal.model.EnumRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class UsuarioRequest {

    @NotBlank
    @JsonProperty("nome")
    private String nome;

    @NotBlank
    @JsonProperty("email")
    private String email;

    @NotBlank
    @JsonProperty("senha")
    private String senha;

    @NotBlank
    @JsonProperty("role")
    private EnumRole role;

    @NotBlank
    @JsonProperty("usuarioId")
    private Long usuarioId;

    @NotBlank
    @JsonProperty("tecnicoId")
    private Long tecnicoId;

    @JsonProperty("chamados")
    private Set<Chamado> chamado;
}
