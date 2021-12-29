package xuanhieu.project.service;

import org.springframework.stereotype.Component;
import xuanhieu.project.algorithm.tuan1.*;
import xuanhieu.project.entity.Exercise;


@Component
public class ExerciseOneService {
    private Exercise exercise;


    public Exercise chooseExercise(int bai){
        switch (bai){
            case 1:
                return new t1bai1();
            case 2:
                return new t1bai2();
            case 3:
                return new t1bai3();
            case 4:
                return new t1bai4();
            case 5:
                return new t1bai5();
            case 6:
                return new t1bai6();
            case 7:
                return new t1bai7();
            case 8:
                return new t1bai8();
            case 9:
                return new t1bai9();
            case 10:
                return new t1bai10();
            case 11:
                return new t1bai11();
            case 12:
                return new t1bai12();
            case 13:
                return new t1bai13();
            case 14:
                return new t1bai14();
            case 15:
                return new t1bai15();
            case 16:
                return new t1bai16();
        }
        return null;
    }

    public Exercise handleService(int bai){
        switch (bai){
            case 1:
                t1bai1 t1bai1 = new t1bai1();
                return t1bai1.handle();
            case 2:
                t1bai2 t1bai2 = new t1bai2();
                return t1bai2.handle();
            case 3:
                t1bai3 t1bai3 = new t1bai3();
                return t1bai3.handle();
            case 4:
                t1bai4 t1bai4 = new t1bai4();
                return t1bai4.handle();
            case 5:
                t1bai5 t1bai5 = new t1bai5();
                return t1bai5.handle();
            case 6:
                t1bai6 t1bai6 = new t1bai6();
                return t1bai6.handle();
            case 7:
                t1bai7 t1bai7 = new t1bai7();
                return t1bai7.handle();
        }
        return null;
    }

    public Exercise handleService(int bai,String content){
        switch (bai){
            case 8:
                t1bai8 t1bai8 = new t1bai8();
                return t1bai8.handle(content);
            case 9:
                t1bai9 t1bai9 = new t1bai9();
                return t1bai9.handle(content);
            case 10:
                t1bai10 t1bai10 = new t1bai10();
                return t1bai10.handle(content);
            case 11:
                t1bai11 t1bai11  = new t1bai11();
                return t1bai11.handle(content);
            case 12:
                t1bai11 t1bai111 = new t1bai11();
                return t1bai111.handle(content);
            case 13:
                t1bai13 t1bai13 = new t1bai13();
                return t1bai13.handle(content);
            case 14:
                t1bai14 t1bai14 = new t1bai14();
                return t1bai14.handle(content);
            case 15:
                t1bai15 t1bai15 = new t1bai15();
                return t1bai15.handle(content);
            case 16:
                t1bai16 t1bai16 = new t1bai16();
                return t1bai16.handle(content);
        }
        return null;
    }
}
