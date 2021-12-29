package xuanhieu.project.algorithm.tuan1;

import xuanhieu.project.entity.Exercise;

public class t1bai7 extends Exercise{

    private Exercise exercise;
    public t1bai7(){
//        exercise = new Exercise();
        this.setTitle("Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số\n"+
                "a. Chia hết cho 5\n"+
                "b. Chia 5 dư 1\n"+
                "c. Chia 5 dư 2\n"+
                "d. Chia 5 dư 3");
        this.setCheckInput(false);
    }

    public Exercise handle() {
        exercise = new Exercise();
        System.out.println("Kết quả: ");
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                ++count0;

            }
        }
        System.out.println("Số các số tự nhiên chia hết cho 5 là:" + count0);
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 1) {
                ++count1;
            }
        }
        System.out.println("Số tự nhiên chia 5 dư 1: " + count1);
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 2) {
                ++count2;
            }
        }
        System.out.println("Số tự nhiên chia 5 dư 2: " + count2);
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 3) {
                ++count3;
            }
        }
        String output ="Số tự nhiên <=100 chia hết cho 5 dư 0 là : "+ count0 +" dư 1: "+count1 +"\n"
                + " dư 2: "+count2 +" dư 3: "+count3;
        exercise.setDataOutput(output);
        return exercise;
    }
}
