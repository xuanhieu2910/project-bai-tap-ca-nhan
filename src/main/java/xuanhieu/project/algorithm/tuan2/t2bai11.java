package xuanhieu.project.algorithm.tuan2;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t2bai11 extends Exercise {

    public t2bai11(){
        this.setTitle("Cho một dãy số nguyên bất kỳ. Hãy tìm 1 một dãy con liên tục đơn điệu tăng dàinhất của dãy trên.");
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
        for (int i = 0; i < b.length; i++) {
            c.add(b[i]);
        }
        List<Integer>d = new ArrayList<>();
        int max = 1;
        for(int i=0;i<c.size();i++){
            int count=1;
            for(int j=i;j<c.size()-1;j++){
                if(c.get(j)<=c.get(j+1)){
                    ++count;
                }
                else{
                    break;
                }
            }
            if(max<count){
                max=count;
                d.add(max);//vi tri dau luu so luong day con
                d.add(i);// vi tri 2 luu vi tri bat dau day con
            }
        }
        String output ="Kết quả: ";
        for(int i=0;i<d.size();i+=2){
            if(d.get(i)==max){
                System.out.println("Độ dài dãy con dài nhất liên tục đơn điệu tăng là: "+max +" tại vị trí: "+d.get(i+1));
                System.out.println("Chỉ số dãy con đó là");
                int vitri=d.get(i+1);
                for(int j=0;j<max;j++){
                    output+=c.get(vitri)+" ";
                    vitri++;
                }
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
