package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class t2bai4 extends Exercise {

    public t2bai4(){
        this.setTitle("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các\n"+
                "chỉ số ứng với giá trị max này");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        int n = content.split("").length;
        List<Integer> b = new ArrayList();
        System.out.println("Nhập dãy số : ");
        for (int i = 0; i < n; i++) {
            int nhap = Integer.parseInt(content.split("")[i]);
            b.add(nhap);
        }
        b = b.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).collect(Collectors.toList());
        String output=String.valueOf(b.get(0));
        exercise.setDataOutput(output);
        return exercise;
    }
}
