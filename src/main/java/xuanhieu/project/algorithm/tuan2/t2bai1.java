package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class t2bai1 extends Exercise {

    public t2bai1(){
        this.setTitle("Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        int n = Integer.parseInt(content);
        String[]range = content.split("");

        Exercise exercise = new Exercise();
        List<Integer> c = new ArrayList<>();
        for(int i = 0 ; i < range.length ; i++){
            int nhap = Integer.parseInt(range[i]);
            c.add(nhap);
        }
        c=c.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).collect(Collectors.toList());
        String output ="Dãy số sắp xếp là: ";
        for(int i=0;i<c.size();i++){
            output+=c.get(i)+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
