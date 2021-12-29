package xuanhieu.project.algorithm.tuan3;

import xuanhieu.project.entity.Exercise;

public class t3bai2 extends Exercise {
    public t3bai2(){
        this.setTitle("Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con 'abc'");
        this.setCheckInput(true);
    }

    public Exercise handle(String content){
        Exercise exercise = new Exercise();
        String[]abc={"a","b","c"};
        String output=null;
        System.out.println("Nhập tên đầy đủ: ");
        String n = content;
        String[] arr = n.split("");
        if (arr.length < 3) {
            System.out.println("Số lần xuất hiện: 0");
        } else {
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals("a") && arr.length-i>=3) {
                    for (int j=0;j<3;j++){
                        if(!arr[i+1].equals(abc[j+1])){
                            break;
                        }
                        else{
                            ++count;
                        }
                    }

                }
            }
            output = "Số dãy con là: "+count;
        }
        exercise.setDataOutput(output);
        return exercise;
    }
}
