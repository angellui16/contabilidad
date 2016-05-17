package modelos;

// default package
// Generated 1/05/2016 04:37:47 PM by Hibernate Tools 4.3.1.Final

/**
 * CatalogoCuentaId generated by hbm2java
 */
public class CatalogoCuentaId implements java.io.Serializable {

	private String correlativo;
	private String descripcion;
	private Integer idPadre;

	public CatalogoCuentaId() {
	}

	public CatalogoCuentaId(String correlativo, String descripcion, Integer idPadre) {
		this.correlativo = correlativo;
		this.descripcion = descripcion;
		this.idPadre = idPadre;
	}

	public String getCorrelativo() {
		return this.correlativo;
	}

	public void setCorrelativo(String correlativo) {
		this.correlativo = correlativo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getIdPadre() {
		return this.idPadre;
	}

	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CatalogoCuentaId))
			return false;
		CatalogoCuentaId castOther = (CatalogoCuentaId) other;

		return ((this.getCorrelativo() == castOther.getCorrelativo()) || (this.getCorrelativo() != null
				&& castOther.getCorrelativo() != null && this.getCorrelativo().equals(castOther.getCorrelativo())))
				&& ((this.getDescripcion() == castOther.getDescripcion())
						|| (this.getDescripcion() != null && castOther.getDescripcion() != null
								&& this.getDescripcion().equals(castOther.getDescripcion())))
				&& ((this.getIdPadre() == castOther.getIdPadre()) || (this.getIdPadre() != null
						&& castOther.getIdPadre() != null && this.getIdPadre().equals(castOther.getIdPadre())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCorrelativo() == null ? 0 : this.getCorrelativo().hashCode());
		result = 37 * result + (getDescripcion() == null ? 0 : this.getDescripcion().hashCode());
		result = 37 * result + (getIdPadre() == null ? 0 : this.getIdPadre().hashCode());
		return result;
	}

}
