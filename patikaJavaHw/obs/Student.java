package patikaJavaHw.obs;

public class Student {
	String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    
    public void addVerbalExamNote(int mat, int fizik, int kimya) {
    	if (mat >= 0 && mat <= 100) {
            this.mat.verbalGrade = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.verbalGrade = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.verbalGrade = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiþ");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sýnýfý Geçti. ");
            } else {
                System.out.println("Sýnýfta Kaldý.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((this.fizik.note*0.8 + this.fizik.verbalGrade*0.2) + (this.kimya.note*0.7 + this.kimya.verbalGrade*0.3) 
        		+ (this.mat.note*0.75 + this.mat.verbalGrade*0.25)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öðrenci : " + this.name);
        System.out.println("Matematik Notu : " + (this.mat.note*0.75 + this.mat.verbalGrade*0.25));
        System.out.println("Fizik Notu : " + (this.fizik.note*0.8 + this.fizik.verbalGrade*0.2));
        System.out.println("Kimya Notu : " + (this.kimya.note*0.7 + this.kimya.verbalGrade*0.3));
    }

}
