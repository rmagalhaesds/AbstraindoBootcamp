import br.com.rogerio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Spring boot");
        curso2.setDescricao("Descrição curso Spring");
        curso2.setCargaHoraria(15);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria spring boot");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Bootcamp Dio Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRogerio = new Dev();
        devRogerio.setNome("Rogério");
        devRogerio.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Rogério "+devRogerio.getConteudosInscritos());
        devRogerio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Rogério "+devRogerio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Rogério "+devRogerio.getConteudosConcluidos());
        System.out.println("XP: "+devRogerio.calcularXP());

        System.out.println("------------------");

        Dev devJosi = new Dev();
        devJosi.setNome("Josiana");
        devJosi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Josiana "+devJosi.getConteudosInscritos());
        devJosi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Josiana "+devJosi.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Josiana "+devJosi.getConteudosConcluidos());
        System.out.println("XP: "+devJosi.calcularXP());






    }
}
