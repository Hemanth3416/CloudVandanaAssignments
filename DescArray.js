const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function sortDescending(arr) {
    return arr.slice().sort((a, b) => b - a);
}

rl.question('Enter numbers separated by spaces: ', (userInput) => {
    let numbers = userInput.split(' ').map(Number);
    let sortedDescending = sortDescending(numbers);
    console.log(sortedDescending);
    rl.close();
});
