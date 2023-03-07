// Write all the Javascript here
var sum = 0;
document.querySelector("form").addEventListener("submit", myfun);
function myfun(event) {
  event.preventDefault();
  let name = document.querySelector("#name").value;
  let category = document.querySelector("#category").value;
  let brand = document.querySelector("#brand").value;
  let price = document.querySelector("#price").value;
  let deliveredBy = document.querySelector("#deliveredBy").value;
  let tr = document.createElement("tr");
  let td1 = document.createElement("td");
  td1.innerText = name;
  let td2 = document.createElement("td");
  td2.innerText = category;
  let td3 = document.createElement("td");
  td3.innerText = brand;
  let td4 = document.createElement("td");
  td4.innerText = price;
  let td5 = document.createElement("td");
  td5.innerText = deliveredBy;
  let td6 = document.createElement("td");
  if (document.querySelector("#price").value > 1000) {
    td6.innerText = "expencive";
  } else {
    td6.innerText = "non-expencive";
  }
  let td7 = document.createElement("td");
  td7.innerText = "deleted";
  td7.style.color = "red";
  td7.style.cursor = "pointer";

  td7.style.background = "white";
  td7.addEventListener("click", deleted);
  tr.append(td1, td2, td3, td4, td5, td6, td7);
  document.querySelector("tbody").append(tr);
  sum = sum + Number(price);
  console.log(sum);
  document.querySelector("#total-price").innerText = "Total Price:-" + sum;
}
function deleted(event) {
  event.target.parentNode.remove();
}
