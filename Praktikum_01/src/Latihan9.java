class Students {
	int npm,semester;
	String fullName,className;
	float gpa;
	
	int getNPM(int paramNPM) {
		npm = paramNPM;
		return npm;
	}
	
	String getFullName(String paramFullName) {
		fullName = paramFullName;
		return fullName;
	}
	
	String getClassName(String paramClassName) {
		className = paramClassName;
		return className;
	}
	
	int getSemester(int paramSemester) {
		semester = paramSemester;
		return semester;
	}
	
	float getGPA(float paramGPA) {
		gpa = paramGPA;
		return gpa;
	}
}

public class Latihan9 {
	public static void main(String[] args) {
		Students myBio = new Students();
		System.out.println("NPM : " + myBio.getNPM(212310045));
		System.out.println("Nama Lengkap : " + myBio.getFullName("Erdiana Ragil Syawala"));
		System.out.println("Kelas : " + myBio.getClassName("TI-21-PA"));
		System.out.println("Semester : " + myBio.getSemester(3));
		System.out.println("GPA : " + myBio.getGPA(4));
	}
}