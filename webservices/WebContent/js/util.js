function getUserDetail() {

	var id = document.getElementById("userId").value;
	var url = "http://localhost:8080/webservices/users/" + id + "/";
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState == 4) {
			if (xmlHttp.status = 200 && xmlHttp.responseText.length > 0) {
				var userData = JSON.parse(xmlHttp.responseText);
				document.getElementById("userName").value = userData.userName;
				document.getElementById("email").value = userData.email;
				document.getElementById("contact").value = userData.cNumber;
			} else if (xmlHttp.responseText.length == 0) {
				document.getElementById("userName").value = '';
				document.getElementById("email").value = '';
				document.getElementById("contact").value = '';
				alert("user with id " + id + " does't exist");
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send()
}
function addUser() {
	var name = document.getElementById("userName").value;
	var useremail = document.getElementById("email").value;
	var userno = document.getElementById("cNumber").value;
	var userData = {
		userName : name,
		email : useremail,
		cNumber : userno

	}
	var url = "http://localhost:8080/webservices/users";

	var ajax = new XMLHttpRequest();
	ajax.onreadystatechange = function() {
		if (ajax.readyState == 4 && ajax.status == 201) {
			alert(ajax.responseText);
		}
	}

	ajax.open("POST", url, true);
	ajax.setRequestHeader('Content-Type', 'application/json')
	ajax.send(JSON.stringify(userData));
}

function deleteById() {
	var id = document.getElementById("did").value;
	var url = "http://localhost:8080/webservices/delete/" + id + "/";

	var http = new XMLHttpRequest();
	http.onreadystatechange = function() {

		if (http.readyState == 4 && http.status == 200) {
			console.log(http.responseText);
		}
	}
	http.open("DELETE", url, true);
	http.send();
}

function updateUser() {

	var id = document.getElementById("userId").value;
	var name = document.getElementById("userN").value;
	var useremail = document.getElementById("emailId").value;
	var userno = document.getElementById("cN").value;

	var data = {

		userName : name,
		email : useremail,
		cNumber : userno
	}
	var uri = "http://localhost:8080/webservices/update/" + id + "/";
	var http = new XMLHttpRequest();
	http.onreadystatechange = function() {

		if (http.readyState == 4 && http.status == 200) {

			console.log(http.responseText)
		}
	}
	http.open("PUT", uri, true);
	http.setRequestHeader('Content-Type', 'application/json');
	http.send(JSON.stringify(data));

}
