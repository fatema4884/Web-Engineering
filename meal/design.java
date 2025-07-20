const greeting = document.getElementById("greeting");
const date = document.getElementById("date");
const hour = new Date().getHours();

if (hour < 12) {
  greeting.innerText = "Good Morning, Chef!";
} else if (hour < 18) {
  greeting.innerText = "Good Afternoon, Chef!";
} else {
  greeting.innerText = "Good Evening, Chef!";
}

date.innerText = new Date().toDateString();


];

function showTip() {
  const randomIndex = Math.floor(Math.random() * tips.length);
  document.getElementById("tipBox").innerText = tips[randomIndex];
}


document.getElementById("mealForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = document.getElementById("mealName").value.trim();
  const type = document.getElementById("mealType").value;

  if (name.length < 3) {
    alert("Meal name must be at least 3 characters.");
    return;
  }

  alert(`Meal "${name}" added as ${type}`);
});
