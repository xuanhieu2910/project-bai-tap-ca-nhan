package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai3 extends Exercise {

    public t3bai3(){
        this.setTitle("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String n = content;
        String output="Kết quả: ";
        String[] arr = n.split("");
        for(int i = arr.length-1; i>0;i--){
            if(arr[i].equals(" ")){
                for(int j=i+1;j<arr.length;j++){
                    output+=arr[j];
                }
                break;
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
