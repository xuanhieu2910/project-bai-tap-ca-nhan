package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai8 extends Exercise {

    public t3bai8(){
        this.setTitle("Cho trước 2 xâu ký tự S1, S2. Hãy đếm xem xâu S1 xuất hiện trong S2 tại bao nhiêu vị trí");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String []demo = content.split(" ");
        String[] xauA = demo[0].split("");
        String[] xauB = demo[1].split("");
        boolean KT = true;
        int count=0;
        if(xauA.length > xauB.length){
            System.out.println("Xâu A không xuất hiện trong xâu B!");
        }
        else {
            for (int i = 0; i < xauB.length; i++) {
                if(xauB[i].equals(xauA[0]) && xauB.length >= xauA.length){
                    for(int j=0;j< xauA.length;j++){
                        if(!xauA[j].equals(xauB[i])){
                            KT=false;
                            break;
                        }
                        else{
                            i++;
                        }
                    }
                    if(KT){
                        ++count;
                    }
                }

            }
        }
        String output ="Kết quả: ";
        output+="Số lần xuất hiện xâu A trong xâu B là: "+count;
        exercise.setDataOutput(output);
        return exercise;
    }
}
