import java.io.*;
import java.util.*;

public class Evento implements Serializable {
    private String titulo;
    private Date data;
    private List<Cliente> participantes = new ArrayList<>();

    public Evento () {}

    public Evento(String titulo, Date data) {
        this.titulo = titulo;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void adicionarParticipante(Cliente c) {
        participantes.add(c);
        c.setEvento(this);
    }

    public List<Cliente> getParticipantes() {
        return participantes;
    }
}