package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t1bai1 extends Exercise{

    private Exercise exercise;
    public  t1bai1(){
        this.setTitle("In ra màn hình tất cả các hợp số <100");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        exercise = new Exercise();
        List<Integer> nguyento = hopto(100);
        String output = "Hợp số < 100 là:";
        for(int i = 0 ; i < nguyento.size(); i++){
            output+=nguyento.get(i)+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
    public  List<Integer> hopto(int n){
        List<Integer>nt = new ArrayList<>();
        for(int i =2 ; i <n;i++){
            boolean KT= false;
            for(int j = 2; j <i ; j++){
                if(i%j ==0){
                    KT = true;
                    break;
                }
            }
            if(KT){
                nt.add(i);
            }
        }
        return nt;
    }

}
