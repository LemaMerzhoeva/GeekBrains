load_messages();

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
        add_message(datetime, name, message);
        document.getElementById("result").innerHTML += `${datetime} ${name}: ${message}\n`;
        document.getElementById("message").value = "";
    }
    else {
        document.getElementById("error").innerText = "Нужно ввести имя";
    }
}

function add_message(datetime, name, message){
    fetch("./json/messages.json")
        .then(response => response.json())
        .then(data => {
            data["messages"].push({"datetime" : datetime, "name": name, "message": message});
        change_file(data);
    
    });
}

function change_file(data){
    fetch("./json/messages.json", {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        }
    });
}

function load_messages(){
    let messages_box = document.getElementById("result");
    fetch("./json/messages.json")
        .then((response) => response.json())
        .then((json) => priv_load_messages(json));
}

function priv_load_messages(json){
    console.log(json);
    for (let i in json["messages"]){
        document.getElementById("result").innerHTML += `${json["messages"][i]["datetime"]} ${json["messages"][i]["name"]}: ${json["messages"][i]["message"]}\n`;
    }
}