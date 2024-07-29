'use strict';

/*
console.log(document.querySelector('.message').textContent);
document.querySelector('.message').textContent = 'Correct Number';
console.log(document.querySelector('.message').textContent);

*/

// event listners

const secretNumber = Math.trunc(Math.random() * 20) + 1;

let score = 20;
let highscore = 0;

document.querySelector('.number').textContent = secretNumber;

document.querySelector('.check').addEventListener('click', function () {
  const guess = Number(document.querySelector('.guess').value);

  console.log(guess, typeof guess);

  // no input
  if (!guess) {
    document.querySelector('.message').textContent = '⛔ No Number';

    // correct input
  } else if (guess === secretNumber) {
    document.querySelector('.message').textContent = 'Correct Number';

    document.querySelector('body').style.backgroundColor = '#60b347';

    if (score > highscore) {
      highscore = score;
      document.querySelector('.highscore').textContent = highscore;
    }
  } else if (guess !== secretNumber) {
    if (score > 1) {
      document.querySelector('.message').textContent =
        guess > secretNumber ? 'Too high' : 'too low';
      score--;
      document.querySelector('.score').textContent = score;
    } else {
      document.querySelector('.message').textContent = 'you lost the game!';
      document.querySelector('.score').textContent = 0;
    }
  }
});

// too high
// } else if (guess > secretNumber) {
//   if (score > 1) {
//     document.querySelector('.message').textContent = 'Too high';
//     score--;
//     document.querySelector('.score').textContent = score;
//   } else {
//     document.querySelector('.message').textContent = 'you lost the game!';
//     document.querySelector('.score').textContent = 0;
//   }

//   // too low
// } else if (guess < secretNumber) {
//   if (score > 1) {
//     document.querySelector('.message').textContent = 'Too low';
//     score--;
//     document.querySelector('.score').textContent = score;
//   } else {
//     document.querySelector('.message').textContent = 'you lost the game!';
//     document.querySelector('.score').textContent = 0;
//   }
// }
