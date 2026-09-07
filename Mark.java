interface Student {
    void displayMark();
}

interface Teacher {
    void updateMark(int mark);
    void displayMark();
}

class Mark implements Student, Teacher {
    
    int mark = 0;

    // Student + Teacher method
    public void displayMark() {
        System.out.println("Student Mark: " + mark);
    }

    // Teacher method
    public void updateMark(int mark) {
        this.mark = mark;
        System.out.println("Mark Updated Successfully!");
    }

    public static void main(String[] args) {
        
        Mark m = new Mark();

        // Student displaying mark
        System.out.println("Student:");
        m.displayMark();

        // Teacher updating mark
        System.out.println("\nTeacher:");
        m.updateMark(85);

        // Teacher displaying updated mark
        m.displayMark();

        // Student can see updated mark
        System.out.println("\nStudent after mark update:");
        m.displayMark();
    }
}