package xuanhieu.project.algorithm.tuan1;
import java.util.*;
import xuanhieu.project.entity.Exercise;

public class t1bai9 extends Exercise{
    private Exercise exercise;
    public t1bai9(){
//        exercise = new Exercise();
        this.setTitle("Nhập số tự nhiên N>1 bất kỳ. In ra khai triển thành tích các số nguyên tố tính từ nhỏ đến lớn VD: 9=3*3,12=2*2*3");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        exercise = new Exercise();
        int n = Integer.parseInt(content);
        List<Integer> nguyento = songuyento(n);
        List<Integer>trienkhai = new ArrayList<>();
        int count=0;
        int length = n;
        boolean ab = true;
        do{
            if(n==1){
                ab=false;
            }
            if(n% nguyento.get(count)==0){
                n = n/nguyento.get(count);
                trienkhai.add(nguyento.get(count));
            }
            else{
                count++;
            }

        }while(ab);
        System.out.print(length+" = ");
        String output = n+" = ";
        for(int i = 0 ; i < trienkhai.size();i++){
            output+=trienkhai.get(i) + " x ";
        }
        exercise.setDataOutput(output);
        return exercise;
    }
    public  List<Integer> songuyento(int n){
        List<Integer>nt = new ArrayList<>();
        for(int i =2 ; i <n;i++){
            boolean KT= true;
            for(int j = 2; j <i ; j++){
                if(i%j ==0){
                    KT = false;
                    break;
                }
            }
            if(KT){
                nt.add(i);
            }
        }
        return nt;
    }


}
