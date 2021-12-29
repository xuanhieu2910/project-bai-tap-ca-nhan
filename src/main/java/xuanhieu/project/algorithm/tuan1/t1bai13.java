package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai13 extends Exercise{

    private Exercise exercise;
    public t1bai13(){
//        exercise = new Exercise();
        this.setTitle("Nhập số tự nhiên N bất kỳ Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        exercise = new Exercise();
        int n = Integer.parseInt(content);
        float result =0;
        float t =0;
        for(int i=1 ; i <=n ; i++){
            t=t+i;
            result+=(float)(1/t);
        }
        String output = String.valueOf(result);
        exercise.setDataOutput(output);
        return exercise;
    }
}
