package whatDoesTheFoxSay;

public class Animal {
	private String name;
	private String noise;
	private String eyeColour;
	private String noseType;
	private String pawSize;
	private String furColour;
	/**
	 * @return the name
	 */
	
	/*
	 * default constructor
	 */
	public Animal() {
		
	}
	
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	
	public void animalSays() {
		System.out.println(this.getName()+ " goes " + this.getNoise());
	}
	
	
	public String toString() {
		return "Animal [name=" + name + ", noise=" + noise + ", eyeColour=" + eyeColour + ", noseType=" + noseType
				+ ", pawSize=" + pawSize + ", furColour=" + furColour + "]";
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the noise
	 */
	public String getNoise() {
		return noise;
	}
	/**
	 * @param noise the noise to set
	 */
	public void setNoise(String noise) {
		this.noise = noise;
	}
	/**
	 * @return the eyeColour
	 */
	public String getEyeColour() {
		return eyeColour;
	}
	/**
	 * @param eyeColour the eyeColour to set
	 */
	public void setEyeColour(String eyeColour) {
		this.eyeColour = eyeColour;
	}
	/**
	 * @return the noseType
	 */
	public String getNoseType() {
		return noseType;
	}
	/**
	 * @param noseType the noseType to set
	 */
	public void setNoseType(String noseType) {
		this.noseType = noseType;
	}
	/**
	 * @return the pawSize
	 */
	public String getPawSize() {
		return pawSize;
	}
	/**
	 * @param pawSize the pawSize to set
	 */
	public void setPawSize(String pawSize) {
		this.pawSize = pawSize;
	}
	/**
	 * @return the furColour
	 */
	public String getFurColour() {
		return furColour;
	}
	/**
	 * @param furColour the furColour to set
	 */
	public void setFurColour(String furColour) {
		this.furColour = furColour;
	}
	public String getChorus(String chorus) {
		for(int loop = 1; loop <=3; loop++)
		System.out.println(
				"Ring-ding-ding-ding-dingeringedin \n Gering-ding-ding-ding-dingeringeding!\n Gering-ding-ding-ding-dingeringeding!");
		return chorus;
	}
	
}
