package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t2bai5 extends Exercise {

    public t2bai5(){
        this.setTitle("Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên\n"+
                "tố, có bao nhiêu hợp số.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        int n = content.split("").length;
        System.out.println("Nhập số:");
        int b[] = new int[n];
        for(int i = 0 ; i <n ; i++){
            int nhap = Integer.parseInt(content.split("")[i]);
            b[i] = nhap;
        }
        List<Integer>c = new ArrayList<>();
        List<Integer>d = new ArrayList<>();
        for(int i = 0 ; i < b.length ; i++){
            if(isCheck(b,b[i])){
                c.add(b[i]);
            };
            if(isCheckHopso(b,b[i])==false){
                d.add(b[i]);
            }
        }
        String output="Nguyên tố: "+ c.size() + " ; "+"Hợp số: "+d.size();

        exercise.setDataOutput(output);
        return exercise;
    }

    public  boolean isCheck(int b[],int input){
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
    public  boolean isCheckHopso(int b[],int input){
        boolean KT = true;
        if (input == 1) {
            KT=true;
            return KT;
        }
        for(int i=2;i<input;i++){
            if(input%i==0){
                KT=false;
                break;
            }
        }

        return KT;
    }
}
