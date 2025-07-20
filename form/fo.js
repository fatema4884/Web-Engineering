function validateForm() {
  const email = document.getElementById("email").value;
  const id = document.getElementById("id").value;
  const name = document.getElementById("name").value;

 
  const emailPattern = /^[a-zA-Z0-9.]+@diu\.edu\.bd$/;
  if (!emailPattern.test(email)) {
    alert("Please enter a valid email address.");
    return false;
  }

 
  const idPattern = /^\d{3}-\d{2}-\d{4}$/;
  if (!idPattern.test(id)) {
    alert("ID must be in format:");
    return false;
  }

  if (name.trim() === "") {
    
    return false;
  }

  alert("Form submitted successfully!");
  return true;
}
