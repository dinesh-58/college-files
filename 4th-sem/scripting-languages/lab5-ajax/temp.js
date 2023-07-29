let request = new XMLHttpRequest();
// Note: these files should be placed somewhere inside htdocs (basically, server directory) 
function getJoke() {
    request.open("GET", "https://icanhazdadjoke.com");
    request.setRequestHeader("Accept", "application/json");
    request.send();

    request.onreadystatechange = function() {
        if(request.readyState ===4) { 
            if(request.status === 200) {
                console.log({request}); 
                let response = JSON.parse(request.responseText); 
                document.querySelector('.joke-container').innerText = (response["joke"]);;
            }
        }
    }
}

getJoke(); // show joke on 1st load;
document.querySelector('#refresh').onclick = getJoke;

