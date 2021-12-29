package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t2bai2 extends Exercise {

    public t2bai2(){
        this.setTitle("Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        int size = content.split("").length;
        int b[] = new int[size];
        String []abc = content.split("");
        for(int i = 0 ; i < size ; i ++){
            b[i] = Integer.parseInt(abc[i]);
        }
        List<Integer>c = new ArrayList<>();
        for(int i = 0 ; i < b.length ; i++){
            if(isCheck(b[i])){
                c.add(b[i]);
            };
        }
        String output = "Số nguyên tố của dãy này là: ";
        for(int i=0;i<c.size();i++){
            output+=c.get(i)+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }

    public static boolean isCheck(int input){
        boolean KT = true;
        if(input==1){
            KT=false;
            return KT;
        }
        for(int i=2; i<input;i++){
            if(input%i==0){
                KT=false;
                break;
            }
        }
        return KT;
    }

}
