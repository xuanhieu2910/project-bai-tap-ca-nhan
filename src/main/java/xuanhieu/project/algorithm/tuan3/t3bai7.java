package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai7 extends Exercise {

    public t3bai7(){
        this.setTitle("Cho trước xâu ký tự S. Hãy biến đổi S theo quy tắc sau: Chữ số thì biến thành'$', ký tự thì giữ nguyên.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String n =content;
        String[] arr = n.split("");
        for(int i=0;i<arr.length;i++){
            if(isCheckKyTu(arr[i])){
                arr[i]="$";
            }
        }

        String output ="Kết quả : ";
        for(int i=0;i<arr.length;i++){
            output+=arr[i];
        }
        exercise.setDataOutput(output);
        return exercise;
    }
    public static boolean isCheckKyTu(String input){
        String mang[]={"1","2","3","4","5","6","7","8","9","0"};
        for(int i =0;i<mang.length;i++){
            if(input.equals(mang[i])){
                return true;
            }
        }
        return false;
    }
}
