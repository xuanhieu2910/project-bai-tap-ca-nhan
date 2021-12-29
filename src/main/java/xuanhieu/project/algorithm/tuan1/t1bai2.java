package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t1bai2 extends Exercise{

    private Exercise exercise;
    public t1bai2(){
//        exercise = new Exercise();
        this.setTitle("In ra màn hình 20 số nguyên tố đầu tiên");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        exercise = new Exercise();
        List<Integer> nguyento = songuyento(20);
        String output =  "Số nguyên tố < 20 là: ";
        for(int i = 0 ; i < nguyento.size(); i++){
            output+= nguyento.get(i)+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
    public List<Integer> songuyento(int n){
        List<Integer>nt = new ArrayList<>();
        for(int i =2 ; i <n;i++){
            boolean KT= true;
            for(int j = 2; j <i ; j++){
                if(i%j ==0){
                    KT = false;
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
