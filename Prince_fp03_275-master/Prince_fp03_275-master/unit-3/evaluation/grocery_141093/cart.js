//let p = JSON.parse(localStorage.getItem("items"));
let allprice = 0;
let dat = JSON.parse(localStorage.getItem("items"));
console.log(dat);
let maindiv = document.querySelector("#main");
display(dat);
function display(data) {
  maindiv.innerHTML = null;
  dat.forEach(function (el, index) {
    let div = document.createElement("div");

    let img = document.createElement("img");

    img.src = el.image;

    let title = document.createElement("p");

    title.innerText = el.name;

    let price = document.createElement("p");

    price.innerText = el.price;

    let but = document.createElement("button");
    but.innerText = "delete";
    but.style.color = "red";
    but.addEventListener("click", function () {
      data.splice(index, 1);
      console.log(data);
      localStorage.setItem("items", JSON.stringify(data));
      window.location.reload();
    });
    div.append(img, title, price, but);
    maindiv.append(div);
  });
  for (var i = 0; i < dat.length; i++) {
    allprice = allprice + dat[i].price;
  }
  //let coun = document.createElement("P");
  let h2 = document.getElementById("cart_total");
  h2.innerText = allprice;
  //coun.innerText = `Total-Bucket:- ${data.length}`;

  // document.getElementById("total-div").append(coun, h3);
}
let gobut = document.getElementById("Checkout");
gobut.onclick = () => {
  window.location.href = "checkout.html";
};
