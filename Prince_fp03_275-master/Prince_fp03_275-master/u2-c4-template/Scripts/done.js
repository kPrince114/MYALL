// Write code related to Done page here
let done = JSON.parse(localStorage.getItem("done")) || [];
console.log(done);
display(done);
function display(done) {
  // document.querySelector("tbody").innerHTML = ""
  done.forEach(function (ele) {
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

    tr.append(td1, td2, td3, td4, td5);
    document.querySelector("tbody").append(tr);
  });
}
