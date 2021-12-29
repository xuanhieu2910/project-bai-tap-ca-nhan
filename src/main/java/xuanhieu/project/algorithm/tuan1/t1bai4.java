package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai4 extends Exercise{

    private Exercise exercise;
    public t1bai4(){
//        exercise = new Exercise();
        this.setTitle("In ra màn hình các số <100 và chia hết cho 3,7");
        this.setCheckInput(false);
    }


    public Exercise handle(){
        exercise  = new Exercise();
        String output = "Các số < 100 chia hết cho 3 và 7 là: ";
        for(int i = 0 ; i < 100 ; i ++){
            if(i%3==0 && i%7==0){
                output+=i+" ; ";
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
