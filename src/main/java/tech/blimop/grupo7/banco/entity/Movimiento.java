package tech.blimop.grupo7.banco.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Movimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipoMovimiento")
	private String tipoMovimiento;
	
	@Column(name = "importe")
	private float importe;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cuentaBancaria_id", nullable = false)
	private CuentaBancaria cuentaBancaria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	

	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	@Override
	public String toString() {
		return "Movimiento [id=" + id + ", cuentaBancaria=" + cuentaBancaria + ", tipoMovimiento=" + tipoMovimiento
				+ ", importe=" + importe + ", fecha=" + fecha + "]";
	}
	
	

}
