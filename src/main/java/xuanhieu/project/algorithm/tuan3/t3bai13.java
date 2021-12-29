package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t3bai13 extends Exercise {

    public t3bai13(){
        this.setTitle("Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ 'H'"+
                "VD : Nguyễn Văn H1 ; Nguyễn Văn T1 ; Nguyễn Thị CH1 ; Vương Xuân Hiệu");
        this.setCheckInput(false);
    }


    public Exercise handle(){
        Exercise exercise = new Exercise();
        String s1 = "Nguyễn Văn H1";
        String s2 = "Nguyễn Văn T1";
        String s3 = "Nguyễn Thị CH1";
        String s4 = "Vương Xuân Hiệu";
        int count=0;
        List<String> arrA = Arrays.asList(s1,s2,s3,s4);
        for(int h=0;h<arrA.size();h++) {
            String[]arr = arrA.get(h).split("");
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i].equals(" ")) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if(arr[j].equals("H")){
                            ++count;
                        }
                        else{
                            break;
                        }
                    }
                    break;
                }
            }
        }
        String output="Số bạn có tên bắt đầu bằng chữ H là : "+count;
        exercise.setDataOutput(output);
        return exercise;
    }
}
