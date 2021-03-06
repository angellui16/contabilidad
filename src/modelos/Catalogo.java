package modelos;
// Generated 20/05/2016 11:44:50 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Catalogo generated by hbm2java
 */
@Entity
@Table(name = "catalogo", catalog = "contabilidad")
public class Catalogo implements java.io.Serializable {

	private String idCuenta;
	private String descripcion;
	private String idPadre;
	private boolean status;
	private Set<DetallePartida> detallePartidas = new HashSet<DetallePartida>(0);

	public Catalogo() {
	}

	public Catalogo(String idCuenta, String idPadre, boolean status) {
		this.idCuenta = idCuenta;
		this.idPadre = idPadre;
		this.status = status;
	}

	public Catalogo(String idCuenta, String descripcion, String idPadre, boolean status,
			Set<DetallePartida> detallePartidas) {
		this.idCuenta = idCuenta;
		this.descripcion = descripcion;
		this.idPadre = idPadre;
		this.status = status;
		this.detallePartidas = detallePartidas;
	}

	@Id

	@Column(name = "id_cuenta", unique = true, nullable = false, length = 20)
	public String getIdCuenta() {
		return this.idCuenta;
	}

	public void setIdCuenta(String idCuenta) {
		this.idCuenta = idCuenta;
	}

	@Column(name = "descripcion", length = 20)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "id_padre", nullable = false, length = 20)
	public String getIdPadre() {
		return this.idPadre;
	}

	public void setIdPadre(String idPadre) {
		this.idPadre = idPadre;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "catalogo")
	public Set<DetallePartida> getDetallePartidas() {
		return this.detallePartidas;
	}

	public void setDetallePartidas(Set<DetallePartida> detallePartidas) {
		this.detallePartidas = detallePartidas;
	}

}
