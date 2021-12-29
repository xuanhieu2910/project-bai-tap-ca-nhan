package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t3bai11 extends Exercise {

    public t3bai11(){
        this.setTitle("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”. VD: "+
                "Nguyen Van An ; Ha Tuan An ; Vuong Xuan Hieu");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        Exercise exercise = new Exercise();
        String s1 = "Nguyen Van An";
        String s2 = "Ha Tuan An";
        String s3 = "Vuong Xuan Hieu";
        int count=0;
        List<String> arr = Arrays.asList(s1,s2,s3);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains("An")){
                ++count;
            }
        }
        String output="Số bạn có tên An: "+count;
        exercise.setDataOutput(output);
        return exercise;
    }
}
