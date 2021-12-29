package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class t2bai8 extends Exercise {

    public t2bai8(){
        this.setTitle("Cho một dãy số nguyên bất kỳ, hãy xóa đi trong dãy này các số hạng =0 và in ra\n"+
                "màn hình các số còn lại.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        int n = content.split("").length;
        System.out.println("Nhập số: ");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap = Integer.parseInt(content.split("")[i]);
            b[i] =nhap;
        }
        List<Integer> c = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            c.add(b[i]);
        }
        c=c.stream().filter(s->s!=0).collect(Collectors.toList());
        String output ="Kết quả: ";
        for(int i=0;i<c.size();i++){
            output+= c.get(i)+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
