package xuanhieu.project.controller.api;


import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xuanhieu.project.entity.Exercise;
import xuanhieu.project.service.ExerciseOneService;
import xuanhieu.project.service.ExerciseThreeService;
import xuanhieu.project.service.ExerciseTwoService;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/api")
public class MainAPI {

    private Exercise exercise;

    @Autowired
    ExerciseOneService exerciseOneService;
    @Autowired
    ExerciseTwoService exerciseTwoService;
    @Autowired
    ExerciseThreeService exerciseThreeService;

    @GetMapping("/tuan1")
    public ResponseEntity<Exercise> tuan1(@RequestParam(value = "bai",required = false)int bai){
        if(exerciseOneService.chooseExercise(bai)!=null){
            exercise = exerciseOneService.chooseExercise(bai);
            return new ResponseEntity<>(exerciseOneService.chooseExercise(bai), HttpStatus.OK);
        }
        return new ResponseEntity(null,HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/tuan2")
    public ResponseEntity<Exercise> tuan2(@RequestParam(value = "bai",required = false)int bai){
        if(exerciseTwoService.chooseExercise(bai)!=null){
            exercise = exerciseTwoService.chooseExercise(bai);
            return new ResponseEntity<>(exerciseTwoService.chooseExercise(bai), HttpStatus.OK);
        }
        return new ResponseEntity(null,HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/tuan3")
    public ResponseEntity<Object> tuan3(@RequestParam(value = "bai",required = false)int bai){
        if(exerciseThreeService.chooseExercise(bai)!=null){
            exercise = exerciseThreeService.chooseExercise(bai);
            return new ResponseEntity<>(exerciseThreeService.chooseExercise(bai), HttpStatus.OK);
        }
        return new ResponseEntity(null,HttpStatus.BAD_REQUEST);
    }


    @PostMapping("/tuan1")
    public ResponseEntity resultTuan1(@RequestParam("bai")int bai, @RequestParam(value = "noidung",required = false)String noidung){
        if(noidung==null){
            return new ResponseEntity(exerciseOneService.handleService(bai),HttpStatus.OK);
        }
        else{
            return new ResponseEntity(exerciseOneService.handleService(bai,noidung),HttpStatus.OK);
        }
    }

    @PostMapping("/tuan2")
    public ResponseEntity resultTuan2(@RequestParam("bai")int bai, @RequestParam(value = "noidung",required = false)String noidung){
        if(noidung==null){
            return new ResponseEntity(exerciseTwoService.handleService(bai),HttpStatus.OK);
        }
        else{
            return new ResponseEntity(exerciseTwoService.handleService(bai,noidung),HttpStatus.OK);
        }
    }

    @PostMapping("/tuan3")
    public ResponseEntity resultTuan3(@RequestParam("bai")int bai, @RequestParam(value = "noidung",required = false)String noidung){
        if(noidung==null){
            return new ResponseEntity(exerciseThreeService.handleService(bai),HttpStatus.OK);
        }
        else{
            return new ResponseEntity(exerciseThreeService.handleService(bai,noidung),HttpStatus.OK);
        }
    }
}
