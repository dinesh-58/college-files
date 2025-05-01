print('You can interact with the system with following statements:')
print('\n ->hi / hello \n ->how are you? \n ->what did you do yesterday?')
print('\n -> Exit')
while True:
    statement = input('Enter a statement: ')
    statement = statement.lower()
    if statement in ['hi', 'hello']:
        print('Whats up?')
    elif statement in ['how are you?']:
        print('Doing good.')
    elif statement in ['what did you do yesterday?']:
        print('I wrestled.')
    elif statement in ['exit']:
        print('Good day.')
        break
