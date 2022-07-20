package grandcircus.co.lab71.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Grades")
public class Grades {

	@Id
	private String id;
	private String name;
	private String type;
	private Double score;
	private Double total;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public Grades() {}
	
	public Grades(String id, String name, String type, Double score, Double total) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.score = score;
		this.total = total;
	}
	
	public Grades(String name, String type, Double score, Double total) {
		this.name = name;
		this.type = type;
		this.score = score;
		this.total = total;
	}
	
	
	
}
