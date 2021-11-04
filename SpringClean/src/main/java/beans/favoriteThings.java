/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Nov 1, 2021
 */
package beans;

import lombok.Data;

/**
 * @author delan
 *
 */

@Data
public class favoriteThings {
	private String color;
	private String food;
	private String music;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	@Override
	public String toString() {
		return "Favorite Things [color=" + color + ", food=" + food + ", music=" + music + "]";
	}

	public favoriteThings(String color, String food, String music) {
		this.color = color;
		this.food = food; 
		this.music = music;
		}
	
}
