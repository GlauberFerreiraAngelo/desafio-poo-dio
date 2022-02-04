package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

	private String nome;
	private String descri��o;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45); 
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescri��o() {
		return descri��o;
	}
	
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	
	public void setDevsInscritos(Set<Dev> devInscritos) {
		this.devsInscritos = devInscritos;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, descri��o, dataInicial, dataFinal, devsInscritos, conteudos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootCamp other = (BootCamp) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descri��o, other.descri��o)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
		
}
