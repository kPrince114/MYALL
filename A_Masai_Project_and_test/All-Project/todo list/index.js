document.querySelector("form").addEventListener("submit", myfun);
function myfun(event) {
  event.preventDefault();
  console.log("peince");
  let name = document.querySelector("#name").value;
  let docId = document.querySelector("#docID").value;
  let Specialization = document.querySelector("#dept").value;
  let expersion = document.querySelector("#exp").value;
  let email = document.querySelector("#email").value;
  let mobile = document.querySelector("#mbl").value;

  let tr = document.createElement("tr");
  let td1 = document.createElement("td");
  td1.innerText = name;
  let td2 = document.createElement("td");
  td2.innerText = docId;
  let td3 = document.createElement("td");
  td3.innerText = Specialization;
  let td4 = document.createElement("td");
  td4.innerText = expersion;
  let td5 = document.createElement("td");
  td5.innerText = email;
  let td6 = document.createElement("td");
  td6.innerText = mobile;
  let td7 = document.createElement("td");
  if (Number(expersion) > 5) {
    td7.innerText = "SENIOR";
  } else if (Number(expersion) < 5 && Number(expersion) > 2) {
    td7.innerText = "Junior";
  } else {
    td7.innerText = "Trainee";
  }
  let td8 = document.createElement("td");
  td8.innerText = "DELETE";
  td8.style.background = "red";
  td8.addEventListener("click", func);
  //event.target.parentNode.remove(td);
  tr.append(td1, td2, td3, td4, td5, td6, td7, td8);
  document.querySelector("tbody").append(tr);
}
function func(event) {
  // console.log(event.target.parentNode);
  event.target.parentNode.remove();
}
