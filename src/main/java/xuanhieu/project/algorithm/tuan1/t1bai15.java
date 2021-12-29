package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai15 extends Exercise{

    private Exercise exercise;
    public t1bai15(){
//        exercise = new Exercise();
        this.setTitle("Cho số tự nhiên N bất kỳ,tính tổng S=1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        exercise = new Exercise();
        int n = Integer.parseInt(content);
        float result =0;
        int t =0;
        int a=1;
        for(int i=1 ; i <=n ; i++){
            a*=i;
            t+=a;
            result+=(float)1/t;
        }
        String output = String.valueOf(result);
        exercise.setDataOutput(output);
        return exercise;
    }

}
