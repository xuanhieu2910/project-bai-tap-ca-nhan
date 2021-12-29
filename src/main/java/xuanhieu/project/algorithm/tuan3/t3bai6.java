package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai6 extends Exercise {

    public t3bai6(){
        this.setTitle("Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String n = content;
        String[]a=n.split("");
        String output ="Kết quả: ";
        for(int i=a.length-1;i>=0;i--){
            output+=a[i];
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
