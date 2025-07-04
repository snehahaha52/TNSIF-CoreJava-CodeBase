package part3;

public class State extends Country {
         private String stateName;
         private String language;
		 public String getName() {
			 return stateName;
		 }
		 public void setName(String name) {
			 this.satename = name;
		 }
		 public String getLanguage() {
			 return language;
		 }
		 public void setLanguage(String language) {
			 this.language = language;
		 }
		 @Override
		 public String toString() {
			return "State [name=" + name + ", language=" + language + "]";
		 }
         
         
}
