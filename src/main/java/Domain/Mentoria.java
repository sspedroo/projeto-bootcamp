package Domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(){
    }

    @Override
    public double calcularXp() {
        return XP_PADRÃO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
