package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t3bai10 extends Exercise {

    public t3bai10(){
        this.setTitle("Cho mảng xâu ký tự S1, S2, ..Sn. Hãy tìm và in ra phần tử xâu có độ dài lớn nhất.");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        Exercise exercise = new Exercise();
        String s1="Vương Xuân Hiệu";
        System.out.println("Xâu ký tự 1: "+s1);
        String s2 = "Vương Xuân Hiệu - SVBK";
        System.out.println("Xâu ký tự 2: "+s2);
        List<String> arr = Arrays.asList(s1,s2);
        Map<Integer,String>stringMap = new HashMap<>();
        int max = s1.length();
        for(int i=1;i < arr.size();i++){
            if(max < arr.get(i).length()){
                max = arr.get(i).length();
                stringMap.put(1,arr.get(i));
            }
        }
       String output="Xâu có độ dài nhất là: "+stringMap.get(1);
        exercise.setDataOutput(output);
        return exercise;
    }
}
