package GkComparable;



public class Player {
	private Integer age;
	private String name;
	private String ranking;

	
	
	
	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRanking() {
		return ranking;
	}



	public void setRanking(String ranking) {
		this.ranking = ranking;
	}


   private Player(Builder builder) {
		this.age = builder.age;
		this.name = builder.name;
		this.ranking = builder.ranking;
	}
   
   

	@Override
	public String toString() {
		return "player [age=" + age + ", name=" + name + ", ranking=" + ranking + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((ranking == null) ? 0 : ranking.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ranking == null) {
			if (other.ranking != null)
				return false;
		} else if (!ranking.equals(other.ranking))
			return false;
		return true;
	}
	
	
	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private Integer age;
		private String name;
		private String ranking;

		private Builder() {
		}

		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withRanking(String ranking) {
			this.ranking = ranking;
			return this;
		}

		public Player build() {
			return new Player(this);
		}
	}

}
