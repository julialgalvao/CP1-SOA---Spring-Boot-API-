package br.com.fiap3esr.spring_boot_project.aluno;

public record DadosListagemAluno(
        String nome,
        String email,
        String cpf
) {
    public DadosListagemAluno(Aluno a) {
        this(a.getNome(), a.getEmail(), a.getCpf());
    }
}
