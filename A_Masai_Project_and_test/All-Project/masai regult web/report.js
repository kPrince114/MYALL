// write code here, dont change anything in HTML and css files
// refer to id's mentioned in html files carefully
// Follow the exact column order for tables,for eg: name should be filled under "name" column
// we are using form here, make sure you are using "submit" eventListener , or else you will get 0 marks

document.querySelector("form").addEventListener("submit", myfun);
function myfun(event) {
  event.preventDefault();
  let img1 = document.querySelector("#image").value;
  let name1 = document.querySelector("#name").value;
  let batch1 = document.querySelector("#batch").value;
  let dsa1 = document.querySelector("#dsa").value;
  let cs1 = document.querySelector("#cs").value;
  let coding1 = document.querySelector("#coding").value;

  let tr = document.createElement("tr");
  let td1 = document.createElement("td");
  let im = document.createElement("img");
  im.setAttribute(
    "src",
    "https://i.insider.com/5b4df27ac0229b1b008b4c15?width=1136&format=jpeg"
  );
  td1.append(im);
  let td2 = document.createElement("td");
  td2.innerText = name1;
  let td3 = document.createElement("td");
  td3.innerText = batch1;
  let td4 = document.createElement("td");
  td4.innerText = dsa1;
  let td5 = document.createElement("td");
  td5.innerText = cs1;
  let td6 = document.createElement("td");
  td6.innerText = coding1;
  let td7 = document.createElement("td");
  let td8 = document.createElement("td");
  let p = Number(dsa1) + Number(cs1) + Number(coding1);
  let s = (p / 30) * 100;
  if (s >= 50) {
    td7.innerText = s.toFixed(3);
    td8.innerText = "regular";
    td8.style.color = "white";
    td8.style.background = "green";
  } else {
    td7.innerText = s.toFixed(3);
    td8.innerText = "Async";
    td8.style.color = "white";
    td8.style.background = "red";
  }
  let td9 = document.createElement("td");
  td9.innerText = "DELETE";
  td9.style.background = "red";
  td9.addEventListener("click", func);
  //event.target.parentNode.remove(td);
  tr.append(td1, td2, td3, td4, td5, td6, td7, td8, td9);
  document.querySelector("tbody").append(tr);
}
function func(event) {
  // console.log(event.target.parentNode);
  event.target.parentNode.remove();
}
