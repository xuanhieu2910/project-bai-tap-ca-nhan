package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;
import java.util.*;
public class t3bai1 extends Exercise {

    public t3bai1(){
        this.setTitle("Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String []arr = content.split("");
        int count=0;
        List<String>fullName = new ArrayList<>();
        for(int i = 0 ; i <arr.length;i++){
            if(arr[0].equals(" ")&&i==0){
                for(int j=i+1;j< arr.length-1;j++){
                    if(!arr[j].equals(" ")){
                        i=j;
                        break;
                    }
                }
            }
            if(arr[i].equals(" ")){
                fullName.add(arr[i]);
                for(int j=i+1;j<arr.length-1;j++){
                    if(!arr[j].equals(" ")){
                        fullName.add(arr[j]);
                        i=j;
                        break;
                    }
                }
            }
            else{
                fullName.add(arr[i]);
            }
        }
        String output = "Kết quả: ";
        for(int i=0;i<fullName.size();i++){
            output+=fullName.get(i);
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
