//Function to validate data before storing it
function validateForm(){
    var name = document.getElementById("name").value;
    var age = document.getElementById("age").value;
    var address = document.getElementById("address").value;
    var email = document.getElementById("email").value;

    if(name==""){
        alert("This field is required.");
        return false;
    }
    if(age==""){
        alert("This field is required.");
        return false;
    }else if(age<1){
        alert("Age should be greater or equal 1");
        return false;
    }

    if(address==""){
        alert("This field is required.");
        return false;
    }

    if(email==""){
        alert("This field is required.");
        return false;
    } else if (!email.includes("@")){
        alert("Invalid email address");
    }
}

//Function to show date if saved
function showData(){
    var peopleList;
    if(localStorage.getItem("peopleList") == null){
        peopleList=[];
    }else{
        peopleList = JSON.parse(localStorage.getItem("peopleList"));
    }

    var html ="";

    peopleList.forEach(function(element, index){
        html +="<tr>";
        html +="<td>" + element.name + "</td>";
        html +="<td>" + element.age + "</td>";
        html +="<td>" + element.address + "</td>";
        html +="<td>" + element.email + "</td>";
        html += 
        '<td><button onclick="deleteData('+index+')" class="btn btn-danger">Delete</button><button onclick="update('+index+')" class="btn btn-warning m-2">Edit</button></td>';

        html +="</tr>"  })
        document.querySelector("#crudTable").innerHTML = html;
}

//Loads all data when documento or page loaded
document.onload = showData();

//Function to add data
function AddData(){
    if(validateForm()==true){
        var name = document.getElementById("name").value;
        var age = document.getElementById("age").value;
        var address = document.getElementById("address").value;
        var email = document.getElementById("email").value;
    
        var peopleList;
        if(localStorage.getItem("peopleList") == null){
            peopleList=[];
        }else{
            peopleList = JSON.parse(localStorage.getItem("peopleList"));
        }
        peopleList.push({
            name:name,
            age:age,
            address: address,
            email:email,});
    localStorage.setItem("peopleList", JSON.stringify(peopleList));
    showData();
    document.getElementById("name").value ="";
    document.getElementById("age").value ="";
    document.getElementById("address").value ="";
    document.getElementById("email").value ="";
    
    }
}
