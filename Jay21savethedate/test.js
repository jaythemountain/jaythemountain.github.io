
var nickname = prompt("Can i Please know your name", "Guest");
if (nickname != null) {
    document.getElementById("welcome").innerText = "Hi " 
    + nickname + 
    "!, You are invited to Jay's 21st";
} 


const time = new Date().getHours();
let greeting;
if (time < 10) {
  greeting = "Good morning,";
} else if (time < 20) {
  greeting = "Good afternoon,";
} else {
  greeting = "Good evening,";
}
document.getElementById("greet").innerHTML = greeting;