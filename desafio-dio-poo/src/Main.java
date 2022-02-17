import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("JAVA");
        curso1.setDescricao("Programação em JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Programação em JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("JAVA na pratica");
        mentoria.setDescricao("Aprenda JAVA com exemplos praticos.");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos:" + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos:" + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }

}
