package xuanhieu.project.algorithm.tuan1;
import java.util.*;
import xuanhieu.project.entity.Exercise;

public class t1bai10 extends Exercise{

    private Exercise exercise;
    public t1bai10(){
//        exercise = new Exercise();
        this.setTitle("Nhập trước số tự nhiên N bất kỳ. In ra màn hình tất cả các ước số nguyên tố khác nhau của N");
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
        for(int i = 0 ; i < trienkhai.size()-1;i++){
            for(int j =i+1;j< trienkhai.size();j++){
                if(trienkhai.get(i)==trienkhai.get(j)){
                    trienkhai.set(j,0);
                }
            }
        }
        String output= "Các ước số nguyên tố khác nhau của: ";
        for(int i = 0 ; i < trienkhai.size();i++){
            if(trienkhai.get(i)!=0){
                output+=trienkhai.get(i)+" ; ";
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }

    public static List<Integer> songuyento(int n){
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
