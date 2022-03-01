package OBS;

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

    public void addBulkExamNote(int matExam,int matVerbal, int fizikExam, int fizikVerbal, int kimyaExam,int kimyaVerbal) {

        if (matExam >= 0 && matExam <= 100 && matVerbal>=0 && matVerbal<=100) {
            this.mat.exam = matExam;
            this.mat.verbal = matVerbal;
            this.mat.note = (int)(matExam * this.mat.noteAffect + matVerbal*this.mat.verbalAffect);
        }

        if (fizikExam >= 0 && fizikExam <= 100 && fizikVerbal >= 0 && fizikVerbal <= 100) {
            this.fizik.exam = fizikExam;
            this.fizik.verbal = fizikVerbal;
            this.fizik.note = (int)(fizikExam * this.fizik.noteAffect + fizikVerbal*this.fizik.verbalAffect);
        }

        if (kimyaExam >= 0 && kimyaExam <= 100 && kimyaVerbal >= 0 && kimyaVerbal <= 100) {
            this.kimya.exam = kimyaExam;
            this.kimya.verbal = kimyaVerbal;
            this.kimya.note = (int)(kimyaExam * this.kimya.noteAffect + kimyaVerbal*this.kimya.verbalAffect);
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.exam + " (%"+(int)(this.mat.noteAffect*100)+")");
        System.out.println("Matematik Sözlü Notu : " + this.mat.verbal + " (%"+(int)(this.mat.verbalAffect*100)+")");
        System.out.println("Matematik Notu : " + this.mat.exam);

        System.out.println("Fizik Sınav Notu : " + this.fizik.exam + " (%"+(int)(this.fizik.noteAffect*100)+")");
        System.out.println("Fizik Sözlü Notu : " + this.fizik.verbal + " (%"+(int)(this.fizik.verbalAffect*100)+")");
        System.out.println("Fizik Notu : " + this.fizik.note + " (%"+(int)(this.fizik.noteAffect*100)+")");

        System.out.println("Kimya Sınav Notu : "+ this.kimya.exam + " (%"+(int)(this.kimya.noteAffect*100)+")");
        System.out.println("Kimya Sözlü Notu : " + this.kimya.verbal + " (%"+(int)(this.kimya.verbalAffect*100)+")");
        System.out.println("Kimya Notu : " + this.kimya.note + " (%"+(int)(this.kimya.noteAffect*100)+")");
    }
}
