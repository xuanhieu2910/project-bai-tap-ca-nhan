package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t1bai3 extends Exercise{


    private Exercise exercise;
    public t1bai3(){
        this.setTitle("In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
        this.setCheckInput(false);
    }

    public Exercise  handle(){
        exercise = new Exercise();
        List<Integer> nguyento = songuyento(2000);
        String output = "Số nguyên tố từ 1000 đến 2000 là: ";
        for(int i = 0 ; i < nguyento.size(); i++){
            output+=nguyento.get(i)+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
    public static List<Integer> songuyento(int n){
        List<Integer>nt = new ArrayList<>();
        for(int i =1001 ; i <n;i++){
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
