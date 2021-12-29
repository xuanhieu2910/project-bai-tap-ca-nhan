var buttonWeek = document.querySelectorAll(".weeken");
var buttonClass = document.querySelectorAll(".button-baitap");
var buttonResult= document.querySelector("#result");
var tuan;
var bai;
buttonWeek.forEach(element=>element.addEventListener("click",(e)=>{
    switch (e.target.textContent){
        case "Tuần 1":
            for(var i in buttonClass){
                if(buttonClass.item(i).classList.contains("tuan1")){
                    buttonClass.item(i).classList.add("avtive--baitap");
                }
                else{
                    buttonClass.item(i).classList.remove("avtive--baitap");
                }
            }
            buttonClass.forEach(el=>el.addEventListener("click",handleExercise))
            break;
        case "Tuần 2":
            for(var i in buttonClass){
                if(buttonClass.item(i).classList.contains("tuan2")){
                    buttonClass.item(i).classList.add("avtive--baitap");
                }
                else{
                    buttonClass.item(i).classList.remove("avtive--baitap");
                }
            }
            buttonClass.forEach(el=>el.addEventListener("click",handleExercise))
            break;
        case "Tuần 3":
            for(var i in buttonClass){
                if(buttonClass.item(i).classList.contains("tuan3")){
                    buttonClass.item(i).classList.add("avtive--baitap");
                }
                else{
                    buttonClass.item(i).classList.remove("avtive--baitap");
                }
            }
            buttonClass.forEach(el=>el.addEventListener("click",handleExercise))
            break;
    }
}))

function handleExercise(data){
    var demo = data.target.getAttribute("class");
    tuan = demo.split(" ")[1];
    bai=demo.split(" ")[2];
    $.ajax({
        type:"GET",
        url:"/api/"+tuan+"?bai="+bai
    }).then(function(dataOutput){
        document.querySelector("#debai").innerHTML= dataOutput.title;
        if(dataOutput.checkInput==false){
            document.querySelector("#inputResult").style.display="none";
        }
        else{
            document.querySelector("#inputResult").style.display="block";
        }
        document.querySelector("#outputText").value="";
        document.querySelector("#inputText").value="";
    })
}

buttonResult.addEventListener("click",(e)=>{
    var input;
    if(document.querySelector("#inputResult").style.display=="none"){
        input=null;
        $.ajax({
            type:"POST",
            url:"/api/"+tuan+"?bai="+bai
        }).then(function(data){
            document.querySelector("#outputText").value= data.dataOutput;
        })
    }
    else{
        input = document.querySelector("#inputText").value;
        $.ajax({
            type:"POST",
            url:"/api/"+tuan+"?bai="+bai+"&noidung="+input
        }).then(function(data){
            console.log(data);
            document.querySelector("#outputText").value= data.dataOutput;
        })
    }
})

