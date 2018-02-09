package com.hibernate.jpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CountryLanguage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
    @OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CountryCode", nullable = false)
	private Country countryCode;

	private boolean isOfficial;
	
	private double percentage;
	
	public CountryLanguage() {
		// TODO Auto-generated constructor stub
	}

	public CountryLanguage(boolean isOfficial, double percentage) {
		super();
		this.isOfficial = isOfficial;
		this.percentage = percentage;
	}

   

	public long getId() {
		return id;
	}

	private void setId(long id) {
		this.id = id;
	}

	public Country getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Country countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isOfficial() {
		return isOfficial;
	}

	public void setOfficial(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CountryLanguage))
			return false;
		CountryLanguage other = (CountryLanguage) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CountryLanguage [id=");
		builder.append(id);
		builder.append(", countryCode=");
		builder.append(countryCode);
		builder.append(", isOfficial=");
		builder.append(isOfficial);
		builder.append(", percentage=");
		builder.append(percentage);
		builder.append("]");
		return builder.toString();
	}

//	public void addCountryToCountryLang(Country country) {
//		if(country == null) {
//			return;
//		}
//		this.countryCode=country;
//		country.getLanguage().add(this);
//	}
	
}
