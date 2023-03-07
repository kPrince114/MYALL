// display the listing cards
import data from "../data.json"
// console.log(data)
// let p=displayCards(data)
// console.log(p);
function displayCards(data) {
  let mainContainer = document.querySelector("#container");

  // console.log(data)
  // map through the data and append each acrd to the main container
  // let div=document.createElement("div");
  mainContainer.innerHTML(data);

  return mainContainer;
}
 let p= displayCards(data);
 console.log(p);

// filter by role

function filterByRole() {
  // let role=document.querySelector("#change-role").value;
  //   let fil = data.filter(function (ele) {
  //     return ele.position == role;
  //   });
  //   displayCards(fil);
  //   console.log(role);
}

// search by language
function searchByLanguage() {}
window.onload = function () {
  // on load display data
  // add click and chnage events for search button and input
};

if (typeof exports !== "undefined") {
  module.exports = {
    displayCards,
    filterByRole,
    searchByLanguage,
  };
}
