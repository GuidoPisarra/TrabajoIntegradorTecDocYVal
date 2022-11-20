
public class UnicenMain {
	public static void main(String[] args) {
		
		UnicenSearch unisearch= new UnicenSearch();
		unisearch.launchTest();
		unisearch.closeDriver();
		FacultySelectedTest unicen = new FacultySelectedTest();
		unicen.launchTest();
		unicen.closeDriver();
	}
}
