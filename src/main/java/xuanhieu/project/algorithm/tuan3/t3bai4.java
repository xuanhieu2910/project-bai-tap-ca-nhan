package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai4 extends Exercise {

    public t3bai4(){
        this.setTitle("Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
        this.setCheckInput(true);
    }
    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String n = content;
        String output="Kết quả: ";
        String[] arr = n.split("");
        for(int i= 0; i< arr.length;i++){
            if(arr[i].equals(" ")){
                for(int j=0;j<i;j++){
                    output+=arr[j];
                }
                break;
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
