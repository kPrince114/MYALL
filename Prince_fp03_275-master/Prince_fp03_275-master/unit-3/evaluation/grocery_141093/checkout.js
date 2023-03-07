/*
Alerts 
0 seconds : Your order is accepted 
3 seconds : Your order is being Packed 
8 seconds : Your order is in transit  
10 seconds : Your order is out for delivery 
12 seconds : Order delivered
*/
let coun = 0;
function clickfun() {
  id = setInterval(function () {
    if (coun == 0) {
      alert("Your order is accepted ");
    } else if (coun == 3) {
      alert("Your order is being Packed");
    } else if (coun == 8) {
      alert("Your order is in transit   ");
    } else if (coun == 10) {
      alert("Your order is out for delivery  ");
    } else if (coun == 12) {
      alert("Order delivered ");
    }
    coun++;
  }, 1000);

  console.log(coun);
}
