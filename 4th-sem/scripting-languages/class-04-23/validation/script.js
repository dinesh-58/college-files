const form = document.forms[0];
const nameInput = form.name;
const emailInput = form.email;
const passwordInput = form.password;
const confirmPasswordInput = form.confirmPassword;
const submitButton = document.getElementById("submitButton");

submitButton.onclick = function (clickEvent) {
    clickEvent.preventDefault();
    let regexEmail = /^\w+@\w+\.\w{3}$/;
    if (nameInput.value.trim() === '') {
        // trim() is used to counter input value with only whitespaces
        const nameGroup = form.querySelector('#nameGroup');
        const nameMessage = form.querySelector('#nameGroup .message');
        nameGroup.classList.add('error');
        nameMessage.innerText = 'Name is required';
        nameMessage.style.color = 'red';
    } else if (emailInput.value.trim() === '') {
        const emailGroup = form.querySelector('#emailGroup');
        const emailMessage = emailGroup.querySelector('.message');
        emailGroup.classList.add('error');
        emailMessage.innerText = 'email is required';
        emailMessage.style.color = 'red';
    } else if (!(regexEmail.test(emailInput.value.trim()))) {
        const emailGroup = form.querySelector('#emailGroup');
        const emailMessage = emailGroup.querySelector('.message');
        emailGroup.classList.add('error');
        emailMessage.innerText = 'enter a valid email';
        emailMessage.style.color = 'red';
    } else if (passwordInput.value !== confirmPasswordInput.value) {
        const passwordGroup = form.querySelector('#passwordGroup');
        const passwordMessage = passwordGroup.querySelector('.message');
        passwordGroup.classList.add('error');
        passwordMessage.innerText = 'Passwords must match';
        passwordMessage.style.color = 'red';
    } else form.submit();
} 
