// declare a reference of indexdDB
const indexdDB = 
window.indexedDB||
window.mozIndexdDB||
window.webkitIndexdDB||
window.msIndexdDB||
window.shimIndexdDB;

//open\create the DB
const requestOpen = indexdDB.open("Cars",1);
requestOpen.onerror = function (event){
    console.error("An error occured with IndexdDB.");
    console.error(event);
};

// create the shape(schame) of the DB

requestOpen.onupgradeneeded = function (){
    const db = requestOpen.result;
    const store = db.createObjectStore("Cars", {keyPath: "id"});
    store.createIndex("Cars_Colour", ["colour"], {unique:false});
    store.createIndex("colour_and_make", ["colour", "make"], {unique:false,});
};

//

requestOpen.onsuccess = function(){
    const db = requestOpen.result;
    const transaction = db.transaction("Cars", "readwrite");
    const store = transaction.objectStore("Cars");
    const colourIndex = store.index("Cars_Colour");
    const makeModelIndex = store.index("colour_and_make");

    store.put({id:1, colour: "red", make: "Toyota"});
    store.put({id:2, colour: "black", make: "Kia"});
    store.put({id:3, colour: "white", make: "Isuzu"});
    store.put({id:4, colour: "gray", make: "Honda"});
    store.put({id:5, colour: "pink", make: "Sabaru"});
    //add as many as you want

    const idQuery = store.get(4);
    const colourQuery = colourIndex.getAll(["gray"]);
    const colourMakeQuery = makeModelIndex.get(["white","Toyota"]);

    //check results per each query

    idQuery.onsuccess = function(){
        console.log("idQuery", idQuery.result);  
    //visualize data
    // create a new html object
    var visibleObj = document.createElement("div");
    visibleObj.textContent = "idQuery " + JSON.stringify(idQuery.result);
    visibleObj.style.backgroundColor = "pink";
    visibleObj.style.textAlign = "center";
    visibleObj.style.width = "470px"
    visibleObj.style.padding = "10px";
    visibleObj.style.marginTop = "10px";
    //get the container to store the object created before
    var dbcontainer = document.getElementById("db");
    //add object to the container
    dbcontainer.appendChild(visibleObj);};

    colourQuery.onsuccess = function(){
        console.log("colourQuery", colourQuery.result);
    //visualize data
    // create a new html object
    var visibleObj = document.createElement("div");
    visibleObj.textContent = "colourQuery " + JSON.stringify(colourQuery.result);
    visibleObj.style.backgroundColor = "white";
    visibleObj.style.textAlign = "center";
    visibleObj.style.width = "470px"
    visibleObj.style.padding = "10px";
    visibleObj.style.marginTop = "10px";
    //get the container to store the object created before
    var dbcontainer = document.getElementById("db");
    //add object to the container
    dbcontainer.appendChild(visibleObj);  };

    colourMakeQuery.onsuccess = function(){
        console.log("colourMakeQuery",  colourMakeQuery.result); 
    //visualize data
    // create a new html object
    var visibleObj = document.createElement("div");
    visibleObj.textContent = "colourMakeQuery " + JSON.stringify(colourMakeQuery.result);
    visibleObj.style.backgroundColor = "pink";
    visibleObj.style.textAlign = "center";
    visibleObj.style.width = "470px"
    visibleObj.style.padding = "10px";
    visibleObj.style.marginTop = "10px";
    //get the container to store the object created before
    var dbcontainer = document.getElementById("db");
    //add object to the container
    dbcontainer.appendChild(visibleObj);
    };
    
    //close DB conection after fulfill the required transaction

    transaction.oncomplete = function (){
        db.close();  };
    
   

};

console.log("Height: " + window.innerHeight + " Width: " + window.innerWidth);



