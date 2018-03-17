package pe.org.jhsystem.mcs.test.bean;

public class Respuesta {
	public String coError;
	public String deMensaje;
	public String deHost;
	public String fhHost;
	public Respuesta() {
		super();
	}
	public String getCoError() {
		return coError;
	}
	public void setCoError(String coError) {
		this.coError = coError;
	}
	public String getDeMensaje() {
		return deMensaje;
	}
	public void setDeMensaje(String deMensaje) {
		this.deMensaje = deMensaje;
	}
	public String getDeHost() {
		return deHost;
	}
	public void setDeHost(String deHost) {
		this.deHost = deHost;
	}
	public String getFhHost() {
		return fhHost;
	}
	public void setFhHost(String fhHost) {
		this.fhHost = fhHost;
	}
	@Override
	public String toString() {
		return "Respuesta [coError=" + coError + ", deMensaje=" + deMensaje + ", deHost=" + deHost + ", fhHost="
				+ fhHost + "]";
	}
}
