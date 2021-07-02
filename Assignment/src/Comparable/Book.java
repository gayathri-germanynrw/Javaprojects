package Comparable;



public class Book implements Comparable<Book> {
      private Integer serialNo;
      private String name;
      private String genre;

	
	private Book(Builder builder) {
		this.serialNo = builder.serialNo;
		this.name = builder.name;
		this.genre = builder.genre;
	}
      
	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((serialNo == null) ? 0 : serialNo.hashCode());
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
		Book other = (Book) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (serialNo == null) {
			if (other.serialNo != null)
				return false;
		} else if (!serialNo.equals(other.serialNo))
			return false;
		return true;
	}
	
	

	@Override
	public String toString() {
		return "Book [serialNo=" + serialNo + ", Name=" + name + ", genre=" + genre + "]";
	}
	
	
	
	
	
	
	
	
	
	

	

	/**
	 * Creates builder to build {@link Book}.
	 * @return created builder
	 */
	
	public static Builder builder() {
		return new Builder();
	}











	/**
	 * Builder to build {@link Book}.
	 */

	public static final class Builder {
		private Integer serialNo;
		private String name;
		private String genre;

		private Builder() {
		}

		public Builder withSerialNo(Integer _serialNo) {
			this.serialNo = _serialNo;
			return this;
		}

		public Builder withName(String _name) {
			this.name = _name;
			return this;
		}

		public Builder withGenre(String _genre) {
			this.genre = _genre;
			return this;
		}

		public Book build() {
			return new Book(this);
		}
	}
	
	
	@Override
	public int compareTo(Book book1) {
		
		
		return name.compareTo(book1.getName());
	}
      
}
