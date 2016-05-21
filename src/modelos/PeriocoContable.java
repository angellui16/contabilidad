package modelos;
// Generated 20/05/2016 11:44:50 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * PeriocoContable generated by hbm2java
 */
@Entity
@Table(name = "perioco_contable", catalog = "contabilidad")
public class PeriocoContable implements java.io.Serializable {

	private long idPeriodoContable;
	private Date fechaInicio;
	private Date fechaFinal;
	private boolean status;
	private Set<Partida> partidas = new HashSet<Partida>(0);

	public PeriocoContable() {
	}

	public PeriocoContable(long idPeriodoContable, boolean status) {
		this.idPeriodoContable = idPeriodoContable;
		this.status = status;
	}

	public PeriocoContable(long idPeriodoContable, Date fechaInicio, Date fechaFinal, boolean status,
			Set<Partida> partidas) {
		this.idPeriodoContable = idPeriodoContable;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.status = status;
		this.partidas = partidas;
	}

	@Id

	@Column(name = "id_periodo_contable", unique = true, nullable = false, precision = 10, scale = 0)
	public long getIdPeriodoContable() {
		return this.idPeriodoContable;
	}

	public void setIdPeriodoContable(long idPeriodoContable) {
		this.idPeriodoContable = idPeriodoContable;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_inicio", length = 10)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_final", length = 10)
	public Date getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "periocoContable")
	public Set<Partida> getPartidas() {
		return this.partidas;
	}

	public void setPartidas(Set<Partida> partidas) {
		this.partidas = partidas;
	}

}
