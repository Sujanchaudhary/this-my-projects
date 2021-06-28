 function validate(){//using javscript
      var name=document.forms["myForm"]["name"].value;
      var email=document.forms["myForm"]["email"].value;
      var feedback=document.forms["myForm"]["feedback"].value;
      if(name=="" || email=="" || feedback=="" || 
        alert("Please fill the form");
      }
      else{
        alert("Thank you, "+name);
      }
    }
}