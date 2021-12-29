package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai5 extends Exercise {

    public t3bai5(){
        this.setTitle("Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0=1,1=0 và in ra kết quả");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String n = content;
        String[]a=n.split("");
        for(int i=0;i<a.length;i++){
            if(a[i].equals("0")){
                a[i]="1";
            }
            else if(a[i].equals("1")){
                a[i]="0";
            }
        }
        String output ="Kết quả: ";
        for(int i=0;i<a.length;i++){
            output+=a[i];
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
