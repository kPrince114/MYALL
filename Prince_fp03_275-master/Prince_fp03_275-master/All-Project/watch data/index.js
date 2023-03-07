document.querySelector("form").addEventListener("submit", myfun);
function myfun(event) {
  event.preventDefault();
  console.log("peince");
  let task = document.querySelector("#task").value;
  let priority = document.querySelector("#priority").value;

  let tr = document.createElement("tr");
  let td1 = document.createElement("td");
  td1.innerText = task;
  let td2 = document.createElement("td");
  td2.innerText = priority;

  let td3 = document.createElement("td");
  td3.innerText = "DELETE";
  td3.style.background = "red";
  td3.addEventListener("click", func);
  //event.target.parentNode.remove(td);
  tr.append(td1, td2, td3);
  document.querySelector("tbody").append(tr);
}
function func(event) {
  // console.log(event.target.parentNode);
  event.target.parentNode.remove();
}
