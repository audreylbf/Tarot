
/**
 * 
 * @author 33674
 * @version 1.0
 */
public class Cards {
	
	String name;
	String description;
	String past;
	String present;
	String futur;
	String image;
	
	/**
	 * 
	 * @param name
	 * @param description
	 * @param past
	 * @param present
	 * @param futur
	 * @param image
	 */
	
	public Cards(String name, String description, String past, String present, String futur, String image) {
		
		this.name=name;
		this.description=description;
		this.past=past;
		this.present=present;
		this.futur=futur;
		this.image=image;
	}
	
	/**
	 * returns the value of the parameter name
	 * @return name of the card
	 */
	public String getName() {
		
		return this.name;
	}
	
	/**
	 * returns the value of the parameter description
	 * @return description of the card
	 */
	
	public String getDescription() {
		
		return this.description;
	}
	
	/**
	 * returns the value of the parameter past
	 * @return the meaning of the card concerning the past
	 */
	
	public String getPast() {
		
		return this.past;
	}
	
	/**
	 * returns the value of the parameter present
	 * @return the meaning of the card concerning the present
	 */
	
	public String getPresent() {
		
		return this.present;
	}
	
	/**
	 * returns the value of the parameter future
	 * @return the meaning of the card concerning the future
	 */
	
	public String getFutur() {
		return this.futur;
	}
	
	/**
	 * returns the value of the parameter image
	 * @return the url of the card image
	 */
	
	public String getImage() {
		return this.image;
	}
	

}
