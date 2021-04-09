package kontruktører;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "ansatt", schema = "oblig3")
	
	public class Ansatt {
		
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Integer id;
		private String brukernavn;
		private String fornavn;
		private String etternavn;
		private LocalDate ansdato;
		private String stilling;
		private Integer manedslonn;
		
		public Ansatt() {
		}
		
		public Ansatt(Integer id, String brukernavn, String fornavn, String etternavn, LocalDate ansdato, String stilling, Integer manedslonn) {
			this.id = id;
			this.fornavn = fornavn;
			this.etternavn = etternavn;
			this.ansdato = ansdato;
			this.stilling = stilling;
			this.manedslonn = manedslonn;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getBrukernavn() {
			return brukernavn;
		}

		public void setBrukernavn(String brukernavn) {
			this.brukernavn = brukernavn;
		}

		public String getFornavn() {
			return fornavn;
		}

		public void setFornavn(String fornavn) {
			this.fornavn = fornavn;
		}

		public String getEtternavn() {
			return etternavn;
		}

		public void setEtternavn(String etternavn) {
			this.etternavn = etternavn;
		}

		public LocalDate getAnsdato() {
			return ansdato;
		}

		public void setAnsdato(LocalDate ansdato) {
			this.ansdato = ansdato;
		}

		public String getStilling() {
			return stilling;
		}

		public void setStilling(String stilling) {
			this.stilling = stilling;
		}

		public Integer getManedslonn() {
			return manedslonn;
		}

		public void setManedslonn(Integer manedslonn) {
			this.manedslonn = manedslonn;
		}

		@Override
		public String toString() {
			return "Ansatt [id=" + id + ", brukernavn=" + brukernavn + ", fornavn=" + fornavn + ", etternavn="
					+ etternavn + ", ansdato=" + ansdato + ", stilling=" + stilling + ", manedslonn=" + manedslonn
					+ "]";
		}

		
		

}
	
	
	

