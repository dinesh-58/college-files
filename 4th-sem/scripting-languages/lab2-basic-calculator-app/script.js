let calculator = document.querySelector('#calculator');
console.log({calculator});

calculator.querySelectorAll('button').forEach( clickedButton => {
});

// on any button click, get values
//

function getInputs() {
    let values = [];
    document.querySelectorAll('input').forEach(input => values.push(parseInt(input.value)));
    return values;
}

function displayResult(result) {
    calculator.querySelector('#result').innerText = result;
}

function add() {
    let values = getInputs();
    displayResult(values[0]+values[1]);
}
function subtract() {
    let values = getInputs();
    displayResult(values[0]-values[1]);
}
function multiply() {
    let values = getInputs();
    displayResult(values[0]*values[1]);
}
function divide() {
    let values = getInputs();
    displayResult(Math.trunc(values[0]/values[1]));
}
function remainder() {
    let values = getInputs();
    displayResult(values[0]%values[1]);
}
