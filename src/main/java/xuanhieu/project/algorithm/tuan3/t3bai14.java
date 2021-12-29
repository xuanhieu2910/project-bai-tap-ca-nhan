package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai14 extends Exercise {

    public t3bai14(){
        this.setTitle(" Dãy xâu ký tự S1, S2,… được cho theo quy tắc sau: S1= “1111100000”, Sk thu được từ Sk-1 bằng cách thay đổi cho lần lượt các vị trí 1-2; 2-3; 3-4; 4-5; 5-6; 6-7; 7-8; 8-9; 9-10. Cho trước số tự nhiên N, Hãy in ra xâu Sn.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String s1 = content;
        int count= s1.length();

        char[] s2 = s1.toCharArray();
        char s3 = s2[0];
        for (int i = 1; i < count; i++) {
            for (int j = 0; j < count-1; j++) {
                s2[j] = s2[j+1];
            }
            s2[count-1] = s3;
            s3 = s2[0];
        }
        String output ="Kết quả: ";
        for (int i = 0; i < count; i++) {
            output+=s2[i];

        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
