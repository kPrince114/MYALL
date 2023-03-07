let pr = JSON.parse(localStorage.getItem("data"));
console.log(pr);
let maindiv = document.getElementById("products_data");
display(pr);
function display(pr) {
  pr.forEach(function (ele, index) {
    let div = document.createElement("div");
    let img = document.createElement("img");
    img.src = ele.product_image;
    let name = document.createElement("p");
    name.innerText = "Name:- " + ele.product_name;
    let brand = document.createElement("p");
    brand.innerText = "brand:-" + ele.product_brand;
    let price = document.createElement("p");
    price.innerText = "price:-" + ele.product_price;
    let detl = document.createElement("button");
    detl.innerText = "delete";
    detl.style.background = "red";
    detl.addEventListener("click", function () {
      markdel(index);
    });
    div.append(img, name, price, brand, detl);
    document.querySelector("#products_data").append(div);
  });
}
function markdel(index) {
  pr.splice(index, 1);
  console.log(pr);
  localStorage.setItem("data", JSON.stringify(pr));
  window.location.reload();
}
