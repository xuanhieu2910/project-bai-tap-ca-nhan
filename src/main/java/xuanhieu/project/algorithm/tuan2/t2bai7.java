package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class t2bai7 extends Exercise {

    public t2bai7(){
        this.setTitle("Cho một dãy số tự nhiên, hãy tìm 1 số tự nhiên nhỏ nhất c không bằng bất cứ số\n"+
                "nào trong dãy trên.");
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
        c=c.stream().sorted().collect(Collectors.toList());
        for(int i = 0 ; i <c.size();i++){
            for(int j=i+1;j<c.size();j++){
                if(c.get(j)==c.get(i)){
                    c.set(j,0);
                    c.set(i,0);
                }
            }
        }
        String output = String.valueOf(c.stream().filter(s->s!=0).collect(Collectors.toList()).get(0));
        exercise.setDataOutput(output);
        return exercise;
    }
}
