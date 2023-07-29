let request = new XMLHttpRequest();
// Note: these files should be placed somewhere inside htdocs (basically, server directory) 
function getJoke() {
    request.open("GET", "https://icanhazdadjoke.com");
    request.setRequestHeader("Accept", "text/plain");
    request.send();

    request.onreadystatechange = function() {
        if(request.readyState ===4) { 
            if(request.status === 200) {
                console.log(request); 
                document.querySelector('.joke-container').innerText = request.responseText;
            }
        }
    }
}

getJoke(); // show joke on 1st load;
document.querySelector('#refresh').onclick = getJoke;

