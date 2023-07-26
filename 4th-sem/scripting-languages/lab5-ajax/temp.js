let request = new XMLHttpRequest();
request.open("GET", "http://icanhazdadjoke.com");
request.send();
request.setRequestHeader("Accept", "application/json");

request.onreadystatechange = function() {
    console.log({request}); }

// !NOTE:  finished file is in htdocs. try doing with php local server & CORS extenstion
