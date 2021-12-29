package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.stream.Collectors;

public class t2bai10 extends Exercise {

    public t2bai10(){
        this.setTitle("Cho một dãy số nguyên bất kỳ, hãy tìm ra 1 một dãy số liền nhau dài nhất bao\n"+
                "gồm các số bằng nhau. Hãy in ra số lượng và các chỉ số đầu tiên của dãy con này.");
        this.setCheckInput(true);
    }


    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        int n = content.split("").length;
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
        int max = 1;
        List<Integer>d = new ArrayList<>();
        for(int i = 0 ; i < c.size()-1;i++){
            int count =1;
            for(int j=i+1;j<c.size();j++){
                if(c.get(j)!=c.get(i)){
                    break;
                }
                else{
                    ++count;
                }
            }
            if(max<count){
                max=count;
                d.add(c.get(i));//Chi so dau tien luu gia tri
                d.add(max);//Chi so thu hai luu so luong;
            }

        }
        String output=null;
        for(int i=1;i<d.size();i+=2){
            if(max==d.get(i)){
                output ="Dãy con có số lượng dãy số bằng nhau dài nhất là: "+max + " chỉ số của dãy con là: "+d.get(i-1);
                break;
            }
        };
        exercise.setDataOutput(output);
        return exercise;
    }
}
