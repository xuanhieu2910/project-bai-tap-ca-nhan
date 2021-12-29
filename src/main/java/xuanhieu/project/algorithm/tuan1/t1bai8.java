package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai8 extends Exercise{
    private Exercise exercise;
    public t1bai8(){
//        exercise = new Exercise();
        this.setTitle("Nhập số tự nhiên N bất kỳ , tìm và in ra ước số nguyên tố nhỏ nhất của N");
        this.setCheckInput(true);
    }
    public Exercise handle(String content){
        exercise  = new Exercise();
        int n = Integer.parseInt(content);
        String output= "Ước nguyên tố nhỏ nhất của " + n + " là : " +inSNTNhoNhat(n);
        exercise.setDataOutput(output);
        return exercise;
    }

    public  boolean checkSNT(int n) {
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public  int inSNTNhoNhat(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && (checkSNT(i))) {
                count++;
                return i;
            }
            if (count == 1) {
                return 1;
            }
        }
        return 0;
    }
}
