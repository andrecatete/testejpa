package testejpa.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity		// tabela
@Table(name = "task5")
public class Task2 {
	
	@Id					//chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY)		//auto incremento
	private Long id;

	private String descricao;
	
	@Column(nullable = true)
	private boolean finalizada;

	@Column(name="data_finalizado", nullable = true)
	@Temporal(TemporalType.DATE)		//configuração de data - facilita
	private Calendar dataFinalizacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isFinalizado() {
		return finalizada;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizada = finalizado;
	}

	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}

	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
}
