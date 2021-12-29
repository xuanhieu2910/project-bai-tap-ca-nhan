package xuanhieu.project.service;

import org.springframework.stereotype.Component;
import xuanhieu.project.algorithm.tuan1.*;
import xuanhieu.project.algorithm.tuan2.*;
import xuanhieu.project.entity.Exercise;

@Component
public class ExerciseTwoService {

    public Exercise chooseExercise(int bai) {
        switch (bai) {
            case 1:
                return new t2bai1();
            case 2:
                return new t2bai2();
            case 3:
                return new t2bai3();
            case 4:
                return new t2bai4();
            case 5:
                return new t2bai5();
            case 6:
                return new t2bai6();
            case 7:
                return new t2bai7();
            case 8:
                return new t2bai8();
            case 9:
                return new t2bai9();
            case 10:
                return new t2bai10();
            case 11:
                return new t2bai11();
            case 12:
                return new t2bai12();
            case 13:
                return new t2bai13();
        }
        return null;
    }
    public Exercise handleService(int bai){
        switch (bai){

        }
        return null;
    }


    public Exercise handleService(int bai,String content){
        switch (bai){
            case 1:
                t2bai1 t2bai1 = new t2bai1();
                return t2bai1.handle(content);
            case 2:
                t2bai2 t2bai2 = new t2bai2();
                return t2bai2.handle(content);
            case 3:
                t2bai3 t2bai3 = new t2bai3();
                return t2bai3.handle(content);
            case 4:
                t2bai4 t2bai4 = new t2bai4();
                return t2bai4.handle(content);
            case 5:
                t2bai5 t2bai5 = new t2bai5();
                return t2bai5.handle(content);
            case 6:
                t2bai6 t2bai6 = new t2bai6();
                return t2bai6.handle(content);
            case 7:
                t2bai7 t2bai7 = new t2bai7();
                return t2bai7.handle(content);
            case 8:
                t2bai8 t2bai8 = new t2bai8();
                return t2bai8.handle(content);
            case 9:
                t2bai9 t2bai9 = new t2bai9();
                return t2bai9.handle(content);
            case 10:
                t2bai10 t2bai10 = new t2bai10();
                return t2bai10.handle(content);
            case 11:
                t2bai11 t2bai11  = new t2bai11();
                return t2bai11.handle(content);
            case 12:
                t2bai11 t2bai111  = new t2bai11();
                return t2bai111.handle(content);
            case 13:
                t2bai11 t2bai1111  = new t2bai11();
                return t2bai1111.handle(content);

        }
        return null;
    }
}
