import Domain.Bootcamp;
import Domain.Curso;
import Domain.Dev;
import Domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Formação Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Formação JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Abstraindo dominio de um Bootcamp");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("BootCamp Java Developer");
        bootcampJava.setDescricao("Aprenda tudo sobre a Linguagem JAVA");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devPedro  = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudo inscritos" + devPedro.getConteudosInscritos());

        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();

        System.out.println("-".repeat(100));
        System.out.println("Conteudo inscritos" + devPedro.getConteudosInscritos());
        System.out.println("Conteudo concluidos" + devPedro.getConteudosConcluidos());
        System.out.println("Xp do aluno " + devPedro.getNome() + ": " + devPedro.calcularTotalXp());

        System.out.println("-".repeat(100));
        Dev devKatia = new Dev();
        devKatia.setNome("Katia");
        devKatia.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudo inscritos" + devKatia.getConteudosInscritos());

        devKatia.progredir();

        System.out.println("-".repeat(100));
        System.out.println("Conteudo inscritos" + devKatia.getConteudosInscritos());
        System.out.println("Conteudo concluidos" + devKatia.getConteudosConcluidos());
        System.out.println("Xp do aluno " + devKatia.getNome()+ ": " + devKatia.calcularTotalXp());





    }
}
