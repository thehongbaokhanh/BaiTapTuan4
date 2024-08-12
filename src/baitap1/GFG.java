package baitap1;

class GFG {
    public static void main(String[] args) {
        // String s set an empty string  and calling getLength()
        String s = "";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // String s set to a value and calling getLength()
        s = "GeeksforGeeks";
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // Setting s as null and calling getLength()
        s = null;
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }
    }

    // Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }
}

//Câu 2:
//Hàm getLength() được dùng để lấy số chữ trong một chuỗi. Nếu chuỗi truyền vào là null thì sẽ trả về
//"The argument cannot be null".

//Câu 3:
//Trương trình sau khi chạy in ra:
//0
//13
//IllegalArgumentException caught

//Câu 4:
//'IllegalArgumentException' là một ngoại lệ trong java, xảy ra khi nó phát hiện một đối số ko hợp lệ.
//VD:
//public class Test {
//    public static void validateAge(int age) {
//        if (age < 0 || age > 100) {
//            throw new IllegalArgumentException("Tuổi thọ của một người tối đa là 100.");
//        }
//    }
//
//    public static void main(String[] args) {
//        validateAge(200);  // Sẽ gây ra IllegalArgumentException
//    }
//}

//Câu 5: