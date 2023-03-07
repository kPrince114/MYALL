// Write code related to Home page here
let add = 0;
document.querySelector("form").addEventListener("submit", myfun);
let dataArr = JSON.parse(localStorage.getItem("input")) || [];
function myfun(event) {
  event.preventDefault();
  add++;
  let obj = {
    name: document.querySelector("#name").value,
    desc: document.querySelector("#desc").value,
    start: document.querySelector("#start").value,
    end: document.querySelector("#end").value,
    proti: document.querySelector("#priority").value,
  };
  dataArr.push(obj);
  localStorage.setItem("input", JSON.stringify(dataArr));
  localStorage.setItem("add", add);
}
