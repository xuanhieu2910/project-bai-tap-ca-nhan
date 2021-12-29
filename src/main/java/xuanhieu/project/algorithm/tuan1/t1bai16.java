package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai16 extends Exercise{

    private Exercise exercise;
    public t1bai16(){
        this.setTitle("Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.");
        this.setCheckInput(true);
    }


    public Exercise handle(String content){
        exercise = new Exercise();
        int n = Integer.parseInt(content);
        String output =String.valueOf(Fibonaxi(n));
        exercise.setDataOutput(output);
        return exercise;
    }

    public int Fibonaxi(int k){
        if(k==1){
            return 1;
        }
        else if(k==0){
            return 0;
        }
        else{
            return Fibonaxi(k-1)+Fibonaxi(k-2);
        }
    }

}
