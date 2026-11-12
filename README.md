### Hexlet tests and linter status:
[![Actions Status](https://github.com/Dima258kk/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Dima258kk/java-project-61/actions)
Игра: "Проверка на чётность"
для запуске игры в терминале ввиде команду: make run-dist
После запуска меню игры и появления меню:
 
Please enter the game number and press Enter.
1 - Greet
2 - Even
0 - Exit
Your choice: 2

Нажмите число: 2

После приветствия:

Welcome to the Brain Games!
May I have your name?

Напишите свою имя латинскими буквами

После приветствия:
 Hello, Ваше имя!
Answer 'yes' if the number is even, otherwise answer 'no'.
Question: Случайное число

и двух последующих строк начнется игра где в сроке Question: будет появлятся случайное число и суть игры в следующем: играку показывается случайное число. И ему нужно ответить yes, если число чётное, или no — если нечётное.

Question: 6
Your answer: yes
Correct!
Question: 7
Your answer: no
Correct!

   Игрок должен дать правильный ответ на три вопроса подряд. После успешной игры в терминале появится строка "Congratulations, Ваше имя!" Что означет об успешном прохождении  игры! 

 В случае, если игрок даст неверный ответ, а также любой некорректный ввод вместо yes или no в ответ на случайное число все данные ответы приравниваются равносильно неправильному ответу.

В резульате в сроке появится 'yes' is wrong answer ;(. Correct answer was 'no'.
Let's try again, Ваше имя! 
