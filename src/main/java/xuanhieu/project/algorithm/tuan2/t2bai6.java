package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class t2bai6 extends Exercise {

    public t2bai6(){
        this.setTitle("Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số\n"+
                "này là ước số thực sự của 1 số hạng khác trong dãy trên.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        int n = content.split("").length;
        System.out.println("Nhập số: ");
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            int nhap =Integer.parseInt(content.split("")[i]);
            b[i] =nhap;
        }
        List<Integer> c = new ArrayList<>();

        for(int i = 0 ; i < b.length;i++){
            if(b[i]==1){
                c.add(b[i]);
                continue;
            }
            for(int j=0;j<b.length;j++){
                if(b[i]==b[j]){
                    continue;
                }
                if(b[j]%b[i]==0&&b[i]!=b[j]){
                    c.add(b[i]);
                }
            }
        }
        c=c.stream().sorted().collect(Collectors.toList());
        for(int i = 0 ; i <c.size()-1;i++){
            for(int j=i+1;j<c.size();j++){
                if(c.get(i)==c.get(j)){
                    c.set(j,0);
                }
            }
        }
        c = c.stream().filter(i->i!=0).collect(Collectors.toList());
        String output = "Kết quả: ";
        for(int i=0;i<c.size();i++){
            output+=c.get(i)+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
