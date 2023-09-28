function send() {
    let name = document.getElementById("name").value;
    if (name != ""){
        let message = document.getElementById("message").value;

        if (message=="") {
            document.getElementById("error").innerText = "Нужно ввести сообщение";
            return;
        }
        else {
            document.getElementById("error").innerText = "";
        }
        var currentdate = new Date();
        var datetime = currentdate.getDate() + "/"
                        + (currentdate.getMonth()+1)  + "/" 
                        + currentdate.getFullYear() + " "  
                        + currentdate.getHours() + ":"  
                        + currentdate.getMinutes() + ":" 
                        + currentdate.getSeconds();
        document.getElementById("result").innerHTML += `${datetime} ${name}: ${message}\n`;
        document.getElementById("message").value = "";
    }
    else {
        document.getElementById("error").innerText = "Нужно ввести имя";
    }
    
}