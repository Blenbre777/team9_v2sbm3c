package dev.mvc.plan;

/*
 * planID INT NOT NULL,
    pname VARCHAR(50) NOT NULL,
    pdescription VARCHAR(300) NOT NULL,
    longitude INT NOT NULL,
    latitude INT NOT NULL,
    heart INT,
    PRIMARY KEY (planID)
 */
public class PlanVO {
	private int planID;
	private String pname;
	private String pdescription;
	private int heart;
	
	public int getPlanID() {
		return planID;
	}
	public void setPlanID(int planID) {
		this.planID = planID;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public int getHeart() {
		return heart;
	}
	public void setHeart(int heart) {
		this.heart = heart;
	}
	
	@Override
	public String toString() {
		return "PlanVO [planID=" + planID + ", pname=" + pname + ", pdescription=" + pdescription + ", longitude="
				+ ", latitude=" + ", heart=" + heart + "]";
	}
}
