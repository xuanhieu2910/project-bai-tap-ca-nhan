package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;
import java.util.*;
import java.util.Random;

public class t1bai11 extends Exercise{

    private Exercise exercise;
    public t1bai11(){
//        exercise = new Exercise();
        this.setTitle(" Viết chương trình tráo đổi ngẫu nhiên vị trí một dãy số cho trước. Để lấy một số int ngẫu nhiên từ 0 đến n-1 ta dùng lệnh int i = Random.nextInt(n);");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        exercise = new Exercise();
        int n = Integer.parseInt(content);
        String m = String.valueOf(n);
        String []b = m.split("");
        String luutru[] = new String[b.length];
        Random random = new Random();
        String[]after = manglucsau(b);
        for(int i = 0 ; i  < b.length ; i++){
            int vitri = random.nextInt(after.length);
            luutru[i]=after[vitri];
            after[vitri]="0";
            after = manglucsau(after);
        }
        String output = "Danh sách lúc sau: ";
        for(int i=0;i< luutru.length;i++){
            output+=luutru[i]+" ; ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
    public static String[] manglucsau(String[]b){
        List<String>a = new ArrayList<>();
        for(int i= 0 ; i <b.length;i++){
            if(b[i]!="0"){
                a.add(b[i]);
            }
        }
        String after[] = new String[a.size()];
        for(int i = 0 ; i < a.size();i++){
            after[i] = a.get(i);
        }
        return after;
    }
}
