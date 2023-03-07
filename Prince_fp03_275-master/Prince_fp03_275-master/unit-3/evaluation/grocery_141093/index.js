// The items should be stored in local storage with key :- “items”
// API :- https://grocery-mock-api.herokuapp.com/items
let arr = JSON.parse(localStorage.getItem("items")) || [];
let maindiv = document.getElementById("items");
let data;
let data1;
async function getData() {
  try {
    let res = await fetch("https://grocery-mock-api.herokuapp.com/items");
    //convert the stream into actual data
    data = await res.json();
    data1 = data.data;
    //console.log(data1);
    appendProducts(data1);
  } catch (err) {
    console.log("err:", err);
  }
}
let cont = document.getElementById("item_count");
getData();
function appendProducts(data1) {
  //data - array of object

  maindiv.innerHTML = null;

  data1.forEach(function (el) {
    let div = document.createElement("div");

    let img = document.createElement("img");

    img.src = el.image;

    let title = document.createElement("p");

    title.innerText = el.name;

    let price = document.createElement("p");

    price.innerText = el.price;

    let but = document.createElement("button");
    but.innerText = "Add To Cart";
    but.style.color = "green";
    but.addEventListener("click", function () {
      arr.push(el);
      localStorage.setItem("items", JSON.stringify(arr));
      cont.innerText = arr.length;
      // window.location.href = "cart.html";
      console.log(arr);
    });

    div.append(img, title, price, but);

    maindiv.append(div);
  });
}
