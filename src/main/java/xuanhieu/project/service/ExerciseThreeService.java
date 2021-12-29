package xuanhieu.project.service;

import org.springframework.stereotype.Component;
import xuanhieu.project.algorithm.tuan1.*;
import xuanhieu.project.algorithm.tuan3.*;
import xuanhieu.project.entity.Exercise;
@Component
public class ExerciseThreeService {

    public Exercise chooseExercise(int bai){
        switch (bai){
            case 1:
                return new t3bai1();
            case 2:
                return new t3bai2();
            case 3:
                return new t3bai3();
            case 4:
                return new t3bai4();
            case 5:
                return new t3bai5();
            case 6:
                return new t3bai6();
            case 7:
                return new t3bai7();
            case 8:
                return new t3bai8();
            case 9:
                return new t3bai9();
            case 10:
                return new t3bai10();
            case 11:
                return new t3bai11();
            case 12:
                return new t3bai12();
            case 13:
                return new t3bai13();
            case 14:
                return new t3bai14();
            case 15:
                return new t3bai15();
            case 16:
                return new t3bai16();
        }
        return null;
    }

    public Exercise handleService(int bai){
        switch (bai){
            case 10:
                t3bai10 t3bai10 = new t3bai10();
                return t3bai10.handle();
            case 11:
                t3bai11 t3bai11 = new t3bai11();
                return t3bai11.handle();
            case 12:
                t3bai12 t3bai12 = new t3bai12();
                return t3bai12.handle();
            case 13:
                t3bai13 t3bai13 = new t3bai13();
                return t3bai13.handle();
            case 15:
                t3bai15 t3bai15 = new t3bai15();
                return t3bai15.handle();
            case 16:
                t3bai16 t3bai16 = new t3bai16();
                return t3bai16.handle();
        }
        return null;
    }


    public Exercise handleService(int bai,String content){
        switch (bai){
            case 1:
                t3bai1 t3bai1 = new t3bai1();
                return t3bai1.handle(content);
            case 2:
                t3bai2 t3bai2  = new t3bai2();
                return t3bai2.handle(content);
            case 3:
                t3bai3 t3bai3 = new t3bai3();
                return t3bai3.handle(content);
            case 4:
                t3bai4 t3bai4 = new t3bai4();
                return t3bai4.handle(content);
            case 5:
                t3bai5 t3bai5 = new t3bai5();
                return t3bai5.handle(content);
            case 6:
                t3bai6 t3bai6 = new t3bai6();
                return t3bai6.handle(content);
            case 7:
                t3bai7 t3bai7 = new t3bai7();
                return t3bai7.handle(content);
            case 8:
                t3bai8 t3bai8 = new t3bai8();
                return t3bai8.handle(content);
            case 9:
                t3bai9 t3bai9 = new t3bai9();
                return t3bai9.handle(content);
            case 14:
                t3bai14 t3bai14 = new t3bai14();
                return t3bai14.handle(content);
        }
        return null;
    }
}
