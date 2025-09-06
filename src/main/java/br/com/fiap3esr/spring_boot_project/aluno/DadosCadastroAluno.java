package br.com.fiap3esr.spring_boot_project.aluno;

import br.com.fiap3esr.spring_boot_project.endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroAluno(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{10,11}")
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpf,

        @NotNull @Valid
        DadosEndereco endereco
) {}
