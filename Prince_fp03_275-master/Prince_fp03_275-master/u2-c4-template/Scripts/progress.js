// Write code for the Progress page here
let prodata = JSON.parse(localStorage.getItem("progras")) || [];
console.log(prodata);
let donedata = JSON.parse(localStorage.getItem("done")) || [];
console.log(donedata);
display(prodata);
function display(prodata) {
  // document.querySelector("tbody").innerHTML = ""
  prodata.forEach(function (ele, index) {
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
    td6.innerText = "ADD";
    td6.style.background = "green";
    td6.style.color = "white";
    td6.addEventListener("click", function () {
      done(ele, index);
    });
    tr.append(td1, td2, td3, td4, td5, td6);
    document.querySelector("tbody").append(tr);
  });
}
function done(ele, index) {
  donedata.push(ele);
  localStorage.setItem("done", JSON.stringify(donedata));
  prodata.splice(index, 1);
  localStorage.setItem("progras", JSON.stringify(prodata));
  window.location.reload();
}
