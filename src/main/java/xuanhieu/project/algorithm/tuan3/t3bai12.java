package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t3bai12 extends Exercise {
    public t3bai12(){
        this.setTitle("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là 'Thị' VD:"
        +"Nguyễn Thị A ; Nguyễn Thị B ; Nguyễn Thị C ; Vương Xuân Hiệu");
        this.setCheckInput(false);
    }

    public Exercise handle(){
        Exercise exercise = new Exercise();
        String s1 = "Nguyễn Thị A";
        String s2 = "Nguyễn Thị B";
        String s3 = "Nguyễn Thị C";
        String s4 = "Vương Xuân Hiệu";
        int count=0;
        List<String> arr = Arrays.asList(s1,s2,s3,s4);
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).contains("Thị")){
                ++count;
            }
        }
        String output="Số bạn có tên đệm Thị: "+count;
        exercise.setDataOutput(output);
        return exercise;
    }
}
