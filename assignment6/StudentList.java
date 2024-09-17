
package assignment6;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> studentList;

    // Constructor
    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    // Thêm một sinh viên mới
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Xóa một sinh viên theo ID
    public void deleteStudentById(String id) {
        studentList.removeIf(student -> student.getId().equals(id));
    }

    // Tìm một sinh viên theo ID
    public Student findStudentByID(String id) {
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    // Hiển thị tất cả sinh viên
    public void displayAllStudents() {
        for (Student student : studentList) {
            student.displayInfo();
        }
    }

    // Tìm sinh viên có GPA cao nhất
    public Student findTopStudent() {
        Student topStudent = null;
        for (Student student : studentList) {
            if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                topStudent = student;
            }
        }
        return topStudent;
    }

    // Cập nhật thông tin sinh viên theo ID
    public boolean updateStudentById(String id, String newName, Date newDateOfBirth, float newGpa, String newMajor) {
        Student student = findStudentByID(id);
        if (student != null) {
            student.setFullName(newName);
            student.setDateOfBirth(newDateOfBirth);
            student.setGpa(newGpa);
            student.setMajor(newMajor);
            return true; // Cập nhật thành công
        }
        return false; // Không tìm thấy sinh viên
    }
}
