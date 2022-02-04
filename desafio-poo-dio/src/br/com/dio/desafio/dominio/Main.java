package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso java");
		curso1.setDescricao("descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso C");
		curso2.setDescricao("descrição curso C");
		curso2.setCargaHoraria(10);
				
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descrição mentoria java");
		mentoria1.setData(LocalDate.now());
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		BootCamp bootcamp = new BootCamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescrição("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev = new Dev();
		dev.setNome("Camila");
		dev.inscreverBootcamp(bootcamp);
		System.out.println("-----------------------------------");
		System.out.println("Conteúdos Inscritos " + dev.getNome() + " : " + dev.getConteudosInscritos());
		dev.progredir();
		dev.progredir();
		System.out.println("-----------------------------------");
		System.out.println("Conteúdos Inscritos " + dev.getNome() + " : " + dev.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos " + dev.getNome() + " : " + dev.getConteudoConcluidos());
		System.out.println("-----------------------------------");
		System.out.println("-------------" + dev.getNome() + " XP: " + dev.calcularTotalXp() + " ----------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("João");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("-----------------------------------");
		System.out.println("Conteúdos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("-----------------------------------");
		System.out.println("Conteúdos Inscritos " + dev2.getNome() + " : " + dev2.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos " + dev2.getNome() + " : " + dev.getConteudoConcluidos());
		System.out.println("-----------------------------------");
		System.out.println("-------------" + dev.getNome() + "XP: " + dev2.calcularTotalXp() + " ----------------------");

	}
}
