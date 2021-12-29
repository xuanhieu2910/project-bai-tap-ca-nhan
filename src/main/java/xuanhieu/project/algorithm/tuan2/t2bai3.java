package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class t2bai3 extends Exercise {

    public t2bai3(){
        this.setTitle("Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        int size = content.split("").length;
        List<Integer> b = new ArrayList();
        System.out.println("Nhập dãy số : ");
        for(int i= 0 ; i<size;i++){
            int nhap = Integer.parseInt(content.split("")[i]);
            b.add(nhap);
        }
        b= b.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        }).collect(Collectors.toList());
        String output = String.valueOf(b.get(0));
        exercise.setDataOutput(output);
        return exercise;
    }
}
