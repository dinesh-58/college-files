
// input's name attribute is used as key 
// value is initially empty & later set to user input
const inputs = {
    fullName: {
        value: '',
        pattern: /^[a-zA-Z]+\s[a-zA-Z]+$/,
        errorMsg: 'First & last name must be letters'
    },
    address: {
        value: '',
        pattern: /^[a-zA-Z]+,\s?[a-zA-Z]+,\s?\d{5}(-\d{4})?$/,
        errorMsg: 'City & State must be words. ZIPcode must be valid. Split them with comma'
    },
    phone: {
        value: '',
        pattern: /^\d{10}$/,
        errorMsg: 'Must be a 10-digit number'
    },
    email: {
        value: '',
        pattern: /^\w+@[a-zA-Z]+.\w{3}$/,
        errorMsg: 'Must be name@domain.extenstion with extension of 3 letters'
    },
    birthDate: {
        value: '',
        pattern: /^\d{4}-\d?\d-\d?\d$/,
        errorMsg: 'Must be in format & must not be in the future'
    },
    message: {
        value: '',
        pattern: /^\S+[\s\S]*$/,
        errorMsg: 'Must not be empty'
    },
};

const mainForm = document.querySelector('#mainForm'); // returns an HTMLFormElement object
const confirmDialog = document.querySelector('#confirmDialog');
function validate(event) {

    // hide errors if previously shown
    document.querySelectorAll('.invalidMessage').forEach((message) => message.classList.add('hidden'))

    // TODO 1: get inputs & put them in objects
    for (let i=0, formControl; i < mainForm.length; i++) {
        formControl = mainForm[i];
        if (formControl.nodeName==='INPUT' || formControl.nodeName==='TEXTAREA') {
            // input values are stored as strings regardless of type attribute.
            // thus, we can use trim() on all
            inputs[formControl.name]['value'] = formControl.value.trim();
        }
    }

    // TODO 2: match regex
    let valid = true; // boolean to keep track if any input is invalid;
    // loop through input values & match them with regex
    // here, name variable will hold one key at a time
    for (const name in inputs) {
        if (!inputs[name]['pattern'].test(inputs[name]['value'])) {
            valid = false;
            addInvalidMessage(name);
        }
    }

    // additional validation for birthDate
    if (checkUnreasonablDate()){
        valid = false;
        addInvalidMessage('birthDate');
    }

    if (valid) formConfirm(mainForm);
}

function checkUnreasonablDate() {
    // get today's date & compare
    let timestamp = {
        today: Date.now(),
        input: Date.parse(inputs['birthDate']['value'])
    }
    // both today & formattedDate are in timestamp format (i.e. milliseconds since UNIX epoch)
    return timestamp['input'] >= timestamp['today'] ;
}

function addInvalidMessage(name) {
    const invalidMessage = document.createElement('p');
    invalidMessage.classList.add('invalidMessage');
    invalidMessage.classList.remove('hidden');
    invalidMessage.innerHTML = `${inputs[name]['errorMsg']}`;
    if (name === 'message') document.querySelector(`label:has(textarea)`).append(invalidMessage); // for the sole textarea
    else document.querySelector(`label:has(input[name="${name}"])`).append(invalidMessage);
}

function formConfirm(form) {
    mainForm.classList.add('hidden');
    confirmDialog.classList.remove('hidden');

    let confirmValues = confirmDialog.querySelectorAll('td');
    console.log(confirmValues);
    let confirmTable = confirmDialog.querySelector('table');
    let row;
    for (const name in inputs) {
        // important to assign row to a domNode inside loop rather than outside
        row = document.createElement('tr');
        row.innerHTML = `<th>${name}</th><td>${inputs[name]['value']}</td>`;
        confirmTable.append(row);
        console.log(name);
    }
}

function hideConfirmDialog() {
    confirmDialog.classList.add('hidden');
    mainForm.classList.remove('hidden');
    // clear contents of table
    confirmDialog.querySelector('table').innerHTML = '';
}
