// due to CORS error, file is moved to htdocs in order to work properly
let request = new XMLHttpRequest();
// request.open('GET', 'http://localhost:8080'); // doesn't work for php's development server?
request.open('GET', 'http://localhost/scr');
request.send();

request.onreadystatechange = function() {
    if (request.readyState == 4 ) {
        if (request.status == 200) alert(request.responseText);
        else alert('Error'+request.statusText);
    }
}

