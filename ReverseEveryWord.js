const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function reverseWords(sentence) {
    const words = sentence.split(" ");
    const result = [];

    for (const word of words) {
        result.push([...word].reverse().join(""));
    }

    return result.join(" ");
}

rl.question('Enter a sentence: ', (sentence) => {
    const reversedSentence = reverseWords(sentence);
    console.log(reversedSentence);
    rl.close();
});
