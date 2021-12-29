package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai9 extends Exercise {

    public t3bai9(){
        this.setTitle("Cho xâu S và 2 chỉ số i, j. Hãy đổi chỗ 2 vị trí i, j trong S.");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String []noidung = content.split(" ");
        String[] xauA = noidung[0].split("");
        String output="Kết quả: ";
        int i= Integer.parseInt(noidung[1]);
        int j = Integer.parseInt(noidung[2]);

        if(isCheckContains(i,j,xauA)){
            System.out.println("Một trong 2 chỉ số không nằm trong dãy!\n Vui lòng kiểm tra lại!");
        }
        else{
            for(int h=0;h< xauA.length;h++){
                System.out.print(xauA[h]);
            }
            String tmp = xauA[i];
            xauA[i] = xauA[j];
            xauA[j] =tmp;

            for(int h=0;h< xauA.length;h++){
                output+=xauA[h];
            }
        }
        exercise.setDataOutput(output);
        return exercise;
    }

    public static boolean isCheckContains(int i,int j,String[] xau){
        if(i>= xau.length || j>= xau.length){
            return true;
        }
        else{
            return false;
        }

    }
}
