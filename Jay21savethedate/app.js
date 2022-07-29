
var nickname = prompt("Can i Please know your name", "Guest");
if (nickname != null) {
    document.getElementById("welcome").innerText = nickname;
} 


const time = new Date().getHours();
let greeting;
if (time < 10) {
  greeting = "Morning & Hi,";
} else if (time < 20) {
  greeting = "Afternoon & Hi,";
} else {
  greeting = "Evening & Hi,";
}
document.getElementById("greet").innerHTML = greeting;