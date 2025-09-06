package br.com.fiap3esr.spring_boot_project.instrutor;

public record DadosListagemInstrutor(
        String nome,
        String email,
        String cnh,
        Especialidade especialidade
) {
    public DadosListagemInstrutor(Instrutor i) {
        this(i.getNome(), i.getEmail(), i.getCnh(), i.getEspecialidade());
    }
}
