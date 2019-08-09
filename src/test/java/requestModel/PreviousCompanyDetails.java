package requestModel;

public class PreviousCompanyDetails {
	private String companyName;
	private String lwd;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLwd() {
		return lwd;
	}

	public void setLwd(String lwd) {
		this.lwd = lwd;
	}

	@Override
	public String toString() {
		return "PreviousCompanyDetails [companyName=" + companyName + ", lwd=" + lwd + "]";
	}

}
