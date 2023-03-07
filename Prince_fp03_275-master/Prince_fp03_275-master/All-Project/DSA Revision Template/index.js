document.querySelector("form").addEventListener("submit", myfun);
//let datarr = JSON.parse(localStorage.getItem("studata")) || [];

let arr = JSON.parse(localStorage.getItem("data")) || [];

function myfun(event) {
  event.preventDefault();
  let obj = {
    tittle: document.querySelector("#title").value,
    link1: document.querySelector("#link").value,
    level1: document.querySelector("#difficulty").value,
  };
  arr.push(obj);
  localStorage.setItem("data", JSON.stringify(arr));
  display(arr);
}
let pr = JSON.parse(localStorage.getItem("data")) || [];
display(pr);
function display(pr) {
  document.querySelector("tbody").innerHTML = "";
  pr.forEach(function (elem) {
    let tr = document.createElement("tr");
    let td1 = document.createElement("td");
    td1.innerText = elem.tittle;
    let td2 = document.createElement("td");
    td2.innerText = elem.link1;
    let td3 = document.createElement("td");
    td3.innerText = elem.level1;
    let td4 = document.createElement("td");
    if (td3.innerText == "Easy") {
      td4.innerText = "NO";
    } else {
      td4.innerText = "YES";
    }
    tr.append(td1, td2, td3, td4);
    document.querySelector("tbody").append(tr);
  });
}
