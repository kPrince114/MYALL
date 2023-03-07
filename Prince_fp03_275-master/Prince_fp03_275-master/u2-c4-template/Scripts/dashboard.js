// Write code related to dashboard page here
let dashdata = JSON.parse(localStorage.getItem("input")) || [];
let add = localStorage.getItem("add");

console.log(dashdata);
document.querySelector("#filter").addEventListener("change", changerole);
function changerole() {
  let p = document.querySelector("#filter").value;
  let fil = dashdata.filter(function (ele) {
    return ele.proti == p;
  });
  display(fil);
  console.log(fil);
}
let prograsdata = JSON.parse(localStorage.getItem("progras")) || [];
console.log(prograsdata);
display(dashdata);
function display(dashdata) {
  document.querySelector("tbody").innerHTML = "";
  dashdata.forEach(function (ele, index, add) {
    let tr = document.createElement("tr");
    let td1 = document.createElement("td");
    td1.innerText = ele.name;
    let td2 = document.createElement("td");
    td2.innerText = ele.desc;
    let td3 = document.createElement("td");
    td3.innerText = ele.start;
    let td4 = document.createElement("td");
    td4.innerText = ele.end;
    let td5 = document.createElement("td");
    td5.innerText = ele.proti;
    let td6 = document.createElement("td");
    td6.innerText = "ADD TO PROGRAS";
    td6.style.background = "green";
    td6.style.color = "white";

    td6.addEventListener("click", function () {
      progras(ele, index);
    });
    tr.append(td1, td2, td3, td4, td5, td6);
    document.querySelector("tbody").append(tr);
  });
}
function progras(ele, index) {
  document.querySelector("#task-count").innerText = add;
  prograsdata.push(ele);
  localStorage.setItem("progras", JSON.stringify(prograsdata));

  dashdata.splice(index, 1);
  localStorage.setItem("input", JSON.stringify(dashdata));
  window.location.reload();
}
document.querySelector("#task-count").innerText = dashdata.length;
