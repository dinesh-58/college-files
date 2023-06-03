function calculate(symbol) {
    let values = [];
    document.querySelectorAll('input').forEach(input => values.push(parseInt(input.value)));
    let result = 0;

    result = (symbol === '+') ? values[0] + values[1]
           : (symbol === '-') ? values[0] - values[1]
           : (symbol === '*') ? values[0] * values[1]
           : (symbol === '/') ? parseInt(values[0] / values[1])
           : (symbol === '%') ? values[0] % values[1]
           : 0;
    document.querySelector('#result').innerText = `${values[0]} ${symbol} ${values[1]} = ${result}`;
}
