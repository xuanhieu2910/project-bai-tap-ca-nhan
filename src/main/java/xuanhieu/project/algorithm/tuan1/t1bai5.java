package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai5 extends Exercise{


    private Exercise exercise;
    public t1bai5(){
//        exercise = new Exercise();
        this.setTitle("In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");
        this.setCheckInput(false);
    }


    public Exercise handle(){
        exercise = new Exercise();
        String output ="Các số nằm giữa 1000 và 2000 chia hết cho 3,7,5 là: ";
        for(int i = 1001 ; i< 2000 ; i ++){
            if(i%3==0 && i%7==0 && i%5==0){
             output+=i+" ; ";
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
