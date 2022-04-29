package br.trimestral.senai.trimestral.repository;

import br.trimestral.senai.trimestral.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.net.InterfaceAddress;
import java.util.List;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

    public Fornecedor findByTelefone(String telefone);
    public Fornecedor findByEmail(String email);
    public Fornecedor findByNome(String nome);
    public Fornecedor findByTelefoneAndEmailAndNome(String telefone, String email, String nome);
    public List<Fornecedor>findByEmailLike(String email);
}
