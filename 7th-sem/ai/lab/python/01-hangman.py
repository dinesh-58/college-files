import random

words = ['nepal', 'kathmandu', 'chitwan']
word = random.choice(words)
print('Guess the characters: ')
guessed_chars = ''
chances = 12

while chances > 0:
    failed = 0
    for char in word:
        if char in guessed_chars:
            print(char, end='')
        else:
            print('_', end='')
            failed += 1
    if failed == 0:
        print('\n')
        print('you win')
        print('the word is: ', word)
        break  # terminate program upon winning
    print('\n')
    guess = input('guess a char')
    guessed_chars += guess
    # TODO: add case to check if guessed char already guessed before
    if guess not in word:
        chances -= 1
        print('wrong guess')
        print('you have ', chances, 'more chances')
        if chances == 0:
            print('you lose')
