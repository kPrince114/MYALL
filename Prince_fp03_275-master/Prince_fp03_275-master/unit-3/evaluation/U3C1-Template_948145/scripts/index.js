//store the products array in localstorage as "data"
let datarr = JSON.parse(localStorage.getItem("data")) || [];
function fun() {
  let obj = {
    product_name: document.querySelector("#product_name").value,
    product_brand: document.querySelector("#product_brand").value,
    product_image: document.querySelector("#product_image").value,
    product_price: document.querySelector("#product_price").value,
  };
  datarr.push(obj);
  localStorage.setItem("data", JSON.stringify(datarr));
}
