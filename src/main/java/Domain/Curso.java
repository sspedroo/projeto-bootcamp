package Domain;

public class Curso extends Conteudo{

    private int CargaHoraria;

    public Curso (){
    }

    @Override
    public double calcularXp() {
        return XP_PADRÃO * CargaHoraria;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }
}
