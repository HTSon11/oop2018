package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        rif(m>n) return m;
        else return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        array  = new int[100];
            int i;
        int min = array[0];
        for(i=0;i<100;i++){
            if(array[i]< min){
                min = array[i];
            }
            
        }
    
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
         double BMI = (weight)/(height*height);
        if(BMI<18.5) return "Thiếu cân ";
        else if(18.5<=BMI && BMI<=23) return "Bình thường";
        else if(23<=BMI&& BMI<=24.99) return "Thừa cân";
        else return "Béo phì";
    }
}
