package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai6 extends Exercise{


    private Exercise exercise;
    public t1bai6(){
//        exercise = new Exercise();
        this.setTitle("In ra màn hình 5 số hoàn hảo đầu tiên '('Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        exercise = new Exercise();
        String output = "Số hoàn hảo là :";
        for(int i = 1 ; i < 10000; i++) {
            int sum = 0;
            for(int j = 1 ; j <= i/2;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
            if(i==1){
                output+=i+" ; ";
            }
            else if(sum == i){
                output+=i+" ; ";
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
